/**
 *
 *  ESUP-Portail MONDOSSIERWEB - Copyright (c) 2020 ESUP-Portail consortium
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package fr.univlorraine.mondossierweb.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.expression.EvaluationException;
import org.springframework.expression.ParseException;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;

import fr.univlorraine.mondossierweb.model.app.entity.Utilisateur;
import fr.univlorraine.mondossierweb.model.ldap.entity.LdapPerson;
import fr.univlorraine.mondossierweb.ui.view.error.AccessDeniedView;
import fr.univlorraine.mondossierweb.ui.view.recherche.RechercheView;
import fr.univlorraine.mondossierweb.utils.security.SecurityUtils;
import fr.univlorraine.pegase.model.insgestion.ApprenantEtInscriptions;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@SuppressWarnings("serial")
public class SecurityService implements VaadinServiceInitListener {

	@Autowired
	private transient BeanFactory beanFactory;
	@Autowired
	private transient PegaseService pegaseService;
	
	
	@Value("${recherche.actif}")
	private transient boolean rechercheActive;	

	private final SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
	private final StandardEvaluationContext evaluationContext = new StandardEvaluationContext();

	@PostConstruct
	private void init() {
		evaluationContext.setBeanResolver(new BeanFactoryResolver(beanFactory));
	}

	/**
	 * @see com.vaadin.flow.server.VaadinServiceInitListener#serviceInit(com.vaadin.flow.server.ServiceInitEvent)
	 */
	@Override
	public void serviceInit(final ServiceInitEvent event) {
		event.getSource().addUIInitListener(uiEvent -> uiEvent.getUI().addBeforeEnterListener(beforeEvent -> {
			if (!isAccessGranted(beforeEvent.getNavigationTarget())) {
				beforeEvent.rerouteToError(new AccessDeniedException(""), "");
			}
		}));
	}

	public Optional<SecurityContext> getSecurityContext() {
		return Optional.of(SecurityContextHolder.getContext());
	}

	public Optional<Authentication> getAuthentication() {
		return getSecurityContext().map(SecurityContext::getAuthentication);
	}

	public Optional<String> getUsername() {
		return getAuthentication().map(Authentication::getName);
	}

	public Optional<String> getCodeEtudiant() {
		return  getPrincipal().map(Utilisateur::getCodeEtudiant);
	}

	public Optional<Utilisateur> getPrincipal() {
		return getAuthentication().map(Authentication::getPrincipal)
			.map(Utilisateur.class::cast);
	}

	public Optional<String> getSearch() {
		return getPrincipal().map(Utilisateur :: getRecherche);
	}

	public Collection<LdapPerson> getResultatRecherche() {
		return getPrincipal().map(Utilisateur :: getResultatRecherche).orElse(null);
	}

	public void setResultatRecherche(Collection<LdapPerson> collection) {
		getPrincipal().ifPresent(u -> u.setResultatRecherche(collection));
	}

	public void saveSearch(String recherche) {
		getPrincipal().ifPresent(u -> u.setRecherche(recherche));
	}

	public void setDossierConsulte(String codetu) {
		getPrincipal().ifPresent(u -> u.setCodEtuDossier(codetu));
	}

	public String getDossierConsulte() {
		if(getPrincipal().isPresent()) {
			return getPrincipal().get().getCodEtuDossier();
		}
		return null;
	}

	public void setDossier(ApprenantEtInscriptions dossier) {
		if(getPrincipal().isPresent()) {
			getPrincipal().get().setDossier(dossier);
		}
	}

	public ApprenantEtInscriptions getDossier() {
		if(getPrincipal().isPresent()) {
			return getPrincipal().get().getDossier();
		}
		return null;
	}

	public boolean isUserLoggedIn() {
		return getAuthentication()
			.filter(Predicate.not(AnonymousAuthenticationToken.class::isInstance))
			.map(Authentication::isAuthenticated)
			.orElse(false);
	}

	public boolean isStudent() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null) {
			return false;
		}

		return authentication
			.getAuthorities()
			.stream()
			.map(GrantedAuthority::getAuthority)
			.anyMatch(SecurityUtils.ROLE_ETUDIANT::contains);
	}

	public boolean isAdmin() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null) {
			return false;
		}

		return authentication
			.getAuthorities()
			.stream()
			.map(GrantedAuthority::getAuthority)
			.anyMatch(SecurityUtils.ROLE_SUPERADMIN::contains);
	}

	public boolean isEnseignant() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null) {
			return false;
		}

		return authentication
			.getAuthorities()
			.stream()
			.map(GrantedAuthority::getAuthority)
			.anyMatch(SecurityUtils.ROLE_ENSEIGNANT::contains);
	}

	public boolean isAccessGrantedForStudent(String codetu) {

		if(isStudent()) {
			return codetu.equals(getCodeEtudiant().orElse(null));
		}
		return isAdmin() || isEnseignant();
	}

	public boolean isAccessGranted(final Class<?> securedClass) {
		if(!rechercheActive && RechercheView.class.equals(securedClass) ) {
			return false;
		}
		return (AccessDeniedView.class.equals(securedClass) || isUserLoggedIn())
			&& isAccessGrantedForPreAuthorize(securedClass)
			&& isAccessGrantedForRoleAnnotations(securedClass);
	}

	private boolean isAccessGrantedForPreAuthorize(final Class<?> securedClass) {
		PreAuthorize preAuthorize = AnnotationUtils.findAnnotation(securedClass, PreAuthorize.class);
		if (preAuthorize == null) {
			return true;
		}

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return false;
		}

		SecurityExpressionRoot securityExpressionRoot = new SecurityExpressionRoot(authentication) {
		};

		try {
			return spelExpressionParser.parseExpression(preAuthorize.value()).getValue(evaluationContext, securityExpressionRoot, Boolean.class);
		} catch (EvaluationException | ParseException e) {
			log.error("Erreur lors de la pré-autorisation d'accès à {}.", securedClass, e);
			return false;
		}
	}

	private boolean isAccessGrantedForRoleAnnotations(final Class<?> securedClass) {
		final Set<String> allowedRoles = Stream.of(
			Optional.ofNullable(AnnotationUtils.findAnnotation(securedClass, Secured.class))
			.map(Secured::value),
			Optional.ofNullable(AnnotationUtils.findAnnotation(securedClass, RolesAllowed.class))
			.map(RolesAllowed::value))
			.filter(Predicate.not(Optional::isEmpty))
			.map(Optional::get)
			.flatMap(Arrays::stream)
			.collect(Collectors.toSet());

		if (allowedRoles.isEmpty()) {
			return true;
		}

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return false;
		}

		return authentication
			.getAuthorities()
			.stream()
			.map(GrantedAuthority::getAuthority)
			.anyMatch(allowedRoles::contains);
	}

	/**
	 * Met à jour les informations sur le dossier si nécessaire
	 */
	public void checkDossier() {
		// Si on n'a pas les informations sur l'étudiant consulté
		if(getDossier() == null || !getDossier().getApprenant().getCode().equals(getDossierConsulte())) {
			log.info("Mise à jour des données du dossier en session pour : {}", getDossierConsulte());
			// Met à jour les données du dossier en session
			setDossier(pegaseService.recupererDossierApprenant(getDossierConsulte()));
		}
	}

	/**
	 * Permet ou non l'accès au dossier en paramètre
	 * @param codeApprenant
	 * @return
	 */
	public boolean secureAccess(String codeApprenant) {
		if(StringUtils.hasText(codeApprenant)) {
			// Si l'utilisateur est autorisé à accéder au dossier en paramètre
			if(isAccessGrantedForStudent(codeApprenant)) {
				setDossierConsulte(codeApprenant);
				log.info("Accès au dossier {}", codeApprenant);
			} else {
				return false;
			}
		}
		return true;
	}









}
