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
package fr.univlorraine.mondossierweb.ui.view.parcours;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.util.StringUtils;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.FlexLayout.WrapMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.i18n.LocaleChangeEvent;
import com.vaadin.flow.i18n.LocaleChangeObserver;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasDynamicTitle;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import fr.univlorraine.mondossierweb.service.SecurityService;
import fr.univlorraine.mondossierweb.ui.component.AdaptSizeLayout;
import fr.univlorraine.mondossierweb.ui.component.Card;
import fr.univlorraine.mondossierweb.ui.layout.HasCodeEtuUrlParameterView;
import fr.univlorraine.mondossierweb.ui.layout.HasHeader;
import fr.univlorraine.mondossierweb.ui.layout.MainLayout;
import fr.univlorraine.mondossierweb.ui.layout.PageTitleFormatter;
import fr.univlorraine.mondossierweb.ui.layout.TextHeader;
import fr.univlorraine.mondossierweb.utils.security.SecurityUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Secured({SecurityUtils.ROLE_SUPERADMIN,SecurityUtils.ROLE_ETUDIANT, SecurityUtils.ROLE_ENSEIGNANT})
@Route(layout = MainLayout.class)
@SuppressWarnings("serial")
@Slf4j
public class ParcoursView extends AdaptSizeLayout implements HasDynamicTitle, HasHeader, LocaleChangeObserver {

	
	@Autowired
	private transient PageTitleFormatter pageTitleFormatter;
	@Getter
	private String pageTitle = "";
	@Getter
	private final TextHeader header = new TextHeader();

	private final VerticalLayout bacLayout = new VerticalLayout();
	private final VerticalLayout anneesLayout = new VerticalLayout();
	private final FlexLayout parcoursLayout = new FlexLayout(bacLayout, anneesLayout);
	

	private final TextHeader titreBac = new TextHeader();
	private final TextHeader titreAnnees = new TextHeader();
	
	
	private final TextField titreAccesBac=new TextField();
	private final TextField anneeBac=new TextField();
	private final TextField typeBac=new TextField();
	private final TextField mentionBac=new TextField();
	private final TextField paysEtbBac=new TextField();
	private final TextField departementEtbBac=new TextField();
	private final TextField etablissementBac=new TextField();
	private final TextField codeIneBac=new TextField();
	
	
	private final TextField anneeSupFr=new TextField();
	private final TextField anneeUnivFr=new TextField();
	private final TextField anneeEtablissement=new TextField();


	
	@PostConstruct
	private void init() {
		setSizeFull();
		initBac();
		initAnnees();
		parcoursLayout.setWidthFull();
		add(parcoursLayout);
	}

	private void initBac() {
		
		//formatCard(identiteLayout);

		bacLayout.add(titreBac);
		
		codeIneBac.setReadOnly(true);
		bacLayout.add(codeIneBac);
		
		titreAccesBac.setReadOnly(true);
		bacLayout.add(titreAccesBac);
		
		anneeBac.setReadOnly(true);
		bacLayout.add(anneeBac);
		
		typeBac.setReadOnly(true);
		bacLayout.add(typeBac);
		
		mentionBac.setReadOnly(true);
		bacLayout.add(mentionBac);
		
		paysEtbBac.setReadOnly(true);
		bacLayout.add(paysEtbBac);
		
		departementEtbBac.setReadOnly(true);
		bacLayout.add(departementEtbBac);
		
		etablissementBac.setReadOnly(true);
		bacLayout.add(etablissementBac);
		
		

		//identiteLayout.addClassName("mdw-card");
		setLongTextField(titreAccesBac);
		
		formatTextField(anneeBac);
		
		setModerateTextField(typeBac);
		
		formatTextField(mentionBac);
		
		setLongTextField(paysEtbBac);
		
		setLongTextField(departementEtbBac);
		
		setLongTextField(etablissementBac);
		
		setModerateTextField(codeIneBac);
		
	}
	
private void initAnnees() {
		
		//formatCard(identiteLayout);

		anneesLayout.add(titreAnnees);
		
		anneeSupFr.setReadOnly(true);
		anneesLayout.add(anneeSupFr);
		
		anneeUnivFr.setReadOnly(true);
		anneesLayout.add(anneeUnivFr);
		
		anneeEtablissement.setReadOnly(true);
		anneesLayout.add(anneeEtablissement);

		//identiteLayout.addClassName("mdw-card");

		setModerateTextField(anneeSupFr);
		
		formatTextField(anneeUnivFr);
		
		formatTextField(anneeEtablissement);
		
	}
	
	
	private void formatTextField(TextField tf) {
		tf.getStyle().set("margin", "0em");
	}
	
	private void setLongTextField(TextField tf) {
		formatTextField(tf);
		tf.setWidthFull();
		tf.setMaxWidth("25em");
	}
	
	private void setModerateTextField(TextField tf) {
		formatTextField(tf);
		tf.setWidthFull();
		tf.setMaxWidth("20em");
	}

	private void formatCard(VerticalLayout card, boolean isMobile) {
		//card.getStyle().set("box-shadow", "0 5px 15px rgba(101,101,102,.15)");
		card.getStyle().set("margin", "1em");
		card.getStyle().set("border-radius", "4px");
		card.getStyle().set("border", "0.1em solid");
		card.getStyle().set("border-color", "var(--lumo-contrast-5pct)");
		
		card.setWidth(isMobile ? "100%" :"100%");
		//card.setMaxWidth(isMobile ? "100%" :"40em");
		
		
	}

	/**
	 * @see com.vaadin.flow.i18n.LocaleChangeObserver#localeChange(com.vaadin.flow.i18n.LocaleChangeEvent)
	 */
	@Override
	public void localeChange(final LocaleChangeEvent event) {
		setViewTitle(getTranslation("parcours.title"));

		titreBac.setText(getTranslation("bac.titre"));
		titreAccesBac.setLabel(getTranslation("bac.titreacces"));
		anneeBac.setLabel(getTranslation("bac.annee"));
		typeBac.setLabel(getTranslation("bac.type"));
		mentionBac.setLabel(getTranslation("bac.mention"));
		paysEtbBac.setLabel(getTranslation("bac.pays"));
		departementEtbBac.setLabel(getTranslation("bac.departement"));
		etablissementBac.setLabel(getTranslation("bac.etablissement"));
		codeIneBac.setLabel(getTranslation("bac.codeine"));
		
		titreAnnees.setText(getTranslation("annees.titre"));
		anneeSupFr.setLabel(getTranslation("annees.anneesupfr"));
		anneeUnivFr.setLabel(getTranslation("annees.anneeunivfr"));
		anneeEtablissement.setLabel(getTranslation("annee.anneetablissement"));
	}


	private void setViewTitle(final String viewTitle) {
		pageTitle = pageTitleFormatter.format(viewTitle);
		getUI().map(UI::getPage).ifPresent(page -> page.setTitle(pageTitle));

		header.setText(viewTitle);
	}

	@Override
	protected void adaptSize(final Boolean isMobile) {
		parcoursLayout.setWrapMode(isMobile? WrapMode.WRAP : WrapMode.NOWRAP);
		formatCard(bacLayout, isMobile);
		formatCard(anneesLayout, isMobile);

	}
	

}