/*
 * API CHC v4
 * Liste l'ensemble des services et des opérations disponibles dans le module choix des cursus v4
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.chc;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fr.univlorraine.pegase.model.chc.PlageChoix;
import fr.univlorraine.pegase.model.chc.TypeAmenagement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * ApprenantExtention
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T17:44:47.769+01:00[Europe/Paris]")
public class ApprenantExtention {
  public static final String SERIALIZED_NAME_CODE_APPRENANT = "codeApprenant";
  @SerializedName(SERIALIZED_NAME_CODE_APPRENANT)
  private String codeApprenant;

  public static final String SERIALIZED_NAME_DATE_NAISSANCE = "dateNaissance";
  @SerializedName(SERIALIZED_NAME_DATE_NAISSANCE)
  private LocalDate dateNaissance;

  public static final String SERIALIZED_NAME_INE = "ine";
  @SerializedName(SERIALIZED_NAME_INE)
  private String ine;

  public static final String SERIALIZED_NAME_NOM_FAMILLE = "nomFamille";
  @SerializedName(SERIALIZED_NAME_NOM_FAMILLE)
  private String nomFamille;

  public static final String SERIALIZED_NAME_PLAGE_CHOIX = "plageChoix";
  @SerializedName(SERIALIZED_NAME_PLAGE_CHOIX)
  private PlageChoix plageChoix;

  public static final String SERIALIZED_NAME_PRENOM = "prenom";
  @SerializedName(SERIALIZED_NAME_PRENOM)
  private String prenom;

  public static final String SERIALIZED_NAME_TEMOIN_ACQUIS = "temoinAcquis";
  @SerializedName(SERIALIZED_NAME_TEMOIN_ACQUIS)
  private Boolean temoinAcquis;

  public static final String SERIALIZED_NAME_TEMOIN_AFFECTE = "temoinAffecte";
  @SerializedName(SERIALIZED_NAME_TEMOIN_AFFECTE)
  private Boolean temoinAffecte;

  public static final String SERIALIZED_NAME_TYPE_AMENAGEMENT_LST = "typeAmenagementLst";
  @SerializedName(SERIALIZED_NAME_TYPE_AMENAGEMENT_LST)
  private List<TypeAmenagement> typeAmenagementLst = null;


  public ApprenantExtention codeApprenant(String codeApprenant) {
    
    this.codeApprenant = codeApprenant;
    return this;
  }

   /**
   * Le code de l&#39;apprenant - identifiant unique
   * @return codeApprenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de l'apprenant - identifiant unique")

  public String getCodeApprenant() {
    return codeApprenant;
  }


  public void setCodeApprenant(String codeApprenant) {
    this.codeApprenant = codeApprenant;
  }


  public ApprenantExtention dateNaissance(LocalDate dateNaissance) {
    
    this.dateNaissance = dateNaissance;
    return this;
  }

   /**
   * La date de naissance
   * @return dateNaissance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La date de naissance")

  public LocalDate getDateNaissance() {
    return dateNaissance;
  }


  public void setDateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
  }


  public ApprenantExtention ine(String ine) {
    
    this.ine = ine;
    return this;
  }

   /**
   * Le code INE de l&#39;apprenant
   * @return ine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code INE de l'apprenant")

  public String getIne() {
    return ine;
  }


  public void setIne(String ine) {
    this.ine = ine;
  }


  public ApprenantExtention nomFamille(String nomFamille) {
    
    this.nomFamille = nomFamille;
    return this;
  }

   /**
   * Le nom de famille
   * @return nomFamille
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le nom de famille")

  public String getNomFamille() {
    return nomFamille;
  }


  public void setNomFamille(String nomFamille) {
    this.nomFamille = nomFamille;
  }


  public ApprenantExtention plageChoix(PlageChoix plageChoix) {
    
    this.plageChoix = plageChoix;
    return this;
  }

   /**
   * Get plageChoix
   * @return plageChoix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlageChoix getPlageChoix() {
    return plageChoix;
  }


  public void setPlageChoix(PlageChoix plageChoix) {
    this.plageChoix = plageChoix;
  }


  public ApprenantExtention prenom(String prenom) {
    
    this.prenom = prenom;
    return this;
  }

   /**
   * Le prénom
   * @return prenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le prénom")

  public String getPrenom() {
    return prenom;
  }


  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  public ApprenantExtention temoinAcquis(Boolean temoinAcquis) {
    
    this.temoinAcquis = temoinAcquis;
    return this;
  }

   /**
   * Est ce que l&#39;apprenant a validé son cursus sur l&#39;objet maquette?
   * @return temoinAcquis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Est ce que l'apprenant a validé son cursus sur l'objet maquette?")

  public Boolean getTemoinAcquis() {
    return temoinAcquis;
  }


  public void setTemoinAcquis(Boolean temoinAcquis) {
    this.temoinAcquis = temoinAcquis;
  }


  public ApprenantExtention temoinAffecte(Boolean temoinAffecte) {
    
    this.temoinAffecte = temoinAffecte;
    return this;
  }

   /**
   * Est ce que l&#39;apprenant est affecté sur l&#39;objet maquette?
   * @return temoinAffecte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Est ce que l'apprenant est affecté sur l'objet maquette?")

  public Boolean getTemoinAffecte() {
    return temoinAffecte;
  }


  public void setTemoinAffecte(Boolean temoinAffecte) {
    this.temoinAffecte = temoinAffecte;
  }


  public ApprenantExtention typeAmenagementLst(List<TypeAmenagement> typeAmenagementLst) {
    
    this.typeAmenagementLst = typeAmenagementLst;
    return this;
  }

  public ApprenantExtention addTypeAmenagementLstItem(TypeAmenagement typeAmenagementLstItem) {
    if (this.typeAmenagementLst == null) {
      this.typeAmenagementLst = new ArrayList<>();
    }
    this.typeAmenagementLst.add(typeAmenagementLstItem);
    return this;
  }

   /**
   * les types amenagements choisis pour un objet maquette
   * @return typeAmenagementLst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "les types amenagements choisis pour un objet maquette")

  public List<TypeAmenagement> getTypeAmenagementLst() {
    return typeAmenagementLst;
  }


  public void setTypeAmenagementLst(List<TypeAmenagement> typeAmenagementLst) {
    this.typeAmenagementLst = typeAmenagementLst;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprenantExtention apprenantExtention = (ApprenantExtention) o;
    return Objects.equals(this.codeApprenant, apprenantExtention.codeApprenant) &&
        Objects.equals(this.dateNaissance, apprenantExtention.dateNaissance) &&
        Objects.equals(this.ine, apprenantExtention.ine) &&
        Objects.equals(this.nomFamille, apprenantExtention.nomFamille) &&
        Objects.equals(this.plageChoix, apprenantExtention.plageChoix) &&
        Objects.equals(this.prenom, apprenantExtention.prenom) &&
        Objects.equals(this.temoinAcquis, apprenantExtention.temoinAcquis) &&
        Objects.equals(this.temoinAffecte, apprenantExtention.temoinAffecte) &&
        Objects.equals(this.typeAmenagementLst, apprenantExtention.typeAmenagementLst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeApprenant, dateNaissance, ine, nomFamille, plageChoix, prenom, temoinAcquis, temoinAffecte, typeAmenagementLst);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprenantExtention {\n");
    sb.append("    codeApprenant: ").append(toIndentedString(codeApprenant)).append("\n");
    sb.append("    dateNaissance: ").append(toIndentedString(dateNaissance)).append("\n");
    sb.append("    ine: ").append(toIndentedString(ine)).append("\n");
    sb.append("    nomFamille: ").append(toIndentedString(nomFamille)).append("\n");
    sb.append("    plageChoix: ").append(toIndentedString(plageChoix)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    temoinAcquis: ").append(toIndentedString(temoinAcquis)).append("\n");
    sb.append("    temoinAffecte: ").append(toIndentedString(temoinAffecte)).append("\n");
    sb.append("    typeAmenagementLst: ").append(toIndentedString(typeAmenagementLst)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

