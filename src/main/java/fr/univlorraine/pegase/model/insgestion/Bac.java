/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.model.insgestion;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Bac
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T16:15:29.973+01:00[Europe/Paris]")
public class Bac {
  public static final String SERIALIZED_NAME_TITRE_ACCES = "titreAcces";
  @SerializedName(SERIALIZED_NAME_TITRE_ACCES)
  private String titreAcces;

  public static final String SERIALIZED_NAME_ANNEE_OBTENTION = "anneeObtention";
  @SerializedName(SERIALIZED_NAME_ANNEE_OBTENTION)
  private String anneeObtention;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  private String serie;

  public static final String SERIALIZED_NAME_MENTION = "mention";
  @SerializedName(SERIALIZED_NAME_MENTION)
  private String mention;

  public static final String SERIALIZED_NAME_TYPE_ETABLISSEMENT = "typeEtablissement";
  @SerializedName(SERIALIZED_NAME_TYPE_ETABLISSEMENT)
  private String typeEtablissement;

  public static final String SERIALIZED_NAME_PAYS = "pays";
  @SerializedName(SERIALIZED_NAME_PAYS)
  private String pays;

  public static final String SERIALIZED_NAME_DEPARTEMENT = "departement";
  @SerializedName(SERIALIZED_NAME_DEPARTEMENT)
  private String departement;

  public static final String SERIALIZED_NAME_ETABLISSEMENT = "etablissement";
  @SerializedName(SERIALIZED_NAME_ETABLISSEMENT)
  private String etablissement;

  public static final String SERIALIZED_NAME_INE = "ine";
  @SerializedName(SERIALIZED_NAME_INE)
  private String ine;

  public static final String SERIALIZED_NAME_ETABLISSEMENT_LIBRE = "etablissementLibre";
  @SerializedName(SERIALIZED_NAME_ETABLISSEMENT_LIBRE)
  private String etablissementLibre;

  public static final String SERIALIZED_NAME_DETAIL_TITRE = "detailTitre";
  @SerializedName(SERIALIZED_NAME_DETAIL_TITRE)
  private String detailTitre;


  public Bac titreAcces(String titreAcces) {
    
    this.titreAcces = titreAcces;
    return this;
  }

   /**
   * Le titre d&#39;accès du baccalaureat ou équivalent
   * @return titreAcces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le titre d'accès du baccalaureat ou équivalent")

  public String getTitreAcces() {
    return titreAcces;
  }


  public void setTitreAcces(String titreAcces) {
    this.titreAcces = titreAcces;
  }


  public Bac anneeObtention(String anneeObtention) {
    
    this.anneeObtention = anneeObtention;
    return this;
  }

   /**
   * L&#39;annee d&#39;obtention du baccalaureat ou équivalent
   * @return anneeObtention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'annee d'obtention du baccalaureat ou équivalent")

  public String getAnneeObtention() {
    return anneeObtention;
  }


  public void setAnneeObtention(String anneeObtention) {
    this.anneeObtention = anneeObtention;
  }


  public Bac serie(String serie) {
    
    this.serie = serie;
    return this;
  }

   /**
   * Le code de la série du baccalauréat ou équivalent issu de la nomenclature Séries du baccalauréat et équivalences  Codes de la nomenclature sur 6 caractères. Préfixe des codes : BAC 
   * @return serie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de la série du baccalauréat ou équivalent issu de la nomenclature Séries du baccalauréat et équivalences  Codes de la nomenclature sur 6 caractères. Préfixe des codes : BAC ")

  public String getSerie() {
    return serie;
  }


  public void setSerie(String serie) {
    this.serie = serie;
  }


  public Bac mention(String mention) {
    
    this.mention = mention;
    return this;
  }

   /**
   * Le code de la mention du candidat issu de la nomenclature des Mentions obtenues au baccalauréat  Codes de la nomenclature sur 6 caractères. Préfixe des codes : MEN 
   * @return mention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de la mention du candidat issu de la nomenclature des Mentions obtenues au baccalauréat  Codes de la nomenclature sur 6 caractères. Préfixe des codes : MEN ")

  public String getMention() {
    return mention;
  }


  public void setMention(String mention) {
    this.mention = mention;
  }


  public Bac typeEtablissement(String typeEtablissement) {
    
    this.typeEtablissement = typeEtablissement;
    return this;
  }

   /**
   * Le type de l&#39;établissement dans lequel le diplôme a été obtenu  Les valeurs &#x60;F&#x60; ou &#x60;E&#x60; sont acceptées: * la valeur &#x60;F&#x60; correspond au type établissement d&#39;un établissement   français en France, * la valeur &#x60;E&#x60; correspond au type établissement d&#39;un établissement français   à l&#39;étranger ou d&#39;un établissement étranger. 
   * @return typeEtablissement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le type de l'établissement dans lequel le diplôme a été obtenu  Les valeurs `F` ou `E` sont acceptées: * la valeur `F` correspond au type établissement d'un établissement   français en France, * la valeur `E` correspond au type établissement d'un établissement français   à l'étranger ou d'un établissement étranger. ")

  public String getTypeEtablissement() {
    return typeEtablissement;
  }


  public void setTypeEtablissement(String typeEtablissement) {
    this.typeEtablissement = typeEtablissement;
  }


  public Bac pays(String pays) {
    
    this.pays = pays;
    return this;
  }

   /**
   * Le code du pays délivrant le diplôme issu de la nomenclature Pays et nationalités. 
   * @return pays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du pays délivrant le diplôme issu de la nomenclature Pays et nationalités. ")

  public String getPays() {
    return pays;
  }


  public void setPays(String pays) {
    this.pays = pays;
  }


  public Bac departement(String departement) {
    
    this.departement = departement;
    return this;
  }

   /**
   * Le code du département de l&#39;établissement dans lequel le diplôme a été obtenu issu de la nomenclature Départements.  Codes de la nomenclature sur 3 caractères. Ex : 001 &#x3D; AIN 
   * @return departement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du département de l'établissement dans lequel le diplôme a été obtenu issu de la nomenclature Départements.  Codes de la nomenclature sur 3 caractères. Ex : 001 = AIN ")

  public String getDepartement() {
    return departement;
  }


  public void setDepartement(String departement) {
    this.departement = departement;
  }


  public Bac etablissement(String etablissement) {
    
    this.etablissement = etablissement;
    return this;
  }

   /**
   * Le numéro UAI de l&#39;établissement dans lequel le diplôme a été obtenu issu de la nomenclature Etablissements français.  Codes de la nomenclature &#x3D; code UAI 
   * @return etablissement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le numéro UAI de l'établissement dans lequel le diplôme a été obtenu issu de la nomenclature Etablissements français.  Codes de la nomenclature = code UAI ")

  public String getEtablissement() {
    return etablissement;
  }


  public void setEtablissement(String etablissement) {
    this.etablissement = etablissement;
  }


  public Bac ine(String ine) {
    
    this.ine = ine;
    return this;
  }

   /**
   * le code INE de l&#39;étudiant
   * @return ine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "le code INE de l'étudiant")

  public String getIne() {
    return ine;
  }


  public void setIne(String ine) {
    this.ine = ine;
  }


  public Bac etablissementLibre(String etablissementLibre) {
    
    this.etablissementLibre = etablissementLibre;
    return this;
  }

   /**
   * Etablissement en saisie libre dans le cas  - d&#39;un Titre admis en dispense, - ou par équivalence du baccalauréat, - ou d&#39;un Titre étranger, - ou baccalauréat international. 
   * @return etablissementLibre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Etablissement en saisie libre dans le cas  - d'un Titre admis en dispense, - ou par équivalence du baccalauréat, - ou d'un Titre étranger, - ou baccalauréat international. ")

  public String getEtablissementLibre() {
    return etablissementLibre;
  }


  public void setEtablissementLibre(String etablissementLibre) {
    this.etablissementLibre = etablissementLibre;
  }


  public Bac detailTitre(String detailTitre) {
    
    this.detailTitre = detailTitre;
    return this;
  }

   /**
   * Précision du titre admis en dispense du baccalauréat (texte libre).  Valeur demandée lorsque l’on choisit le type ou série « 0032/Titre français admis en dispense »   pour un titre d’accès à l’enseignement supérieur « TITRE admis en dispense ou par équivalence du baccalauréat ». 
   * @return detailTitre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Précision du titre admis en dispense du baccalauréat (texte libre).  Valeur demandée lorsque l’on choisit le type ou série « 0032/Titre français admis en dispense »   pour un titre d’accès à l’enseignement supérieur « TITRE admis en dispense ou par équivalence du baccalauréat ». ")

  public String getDetailTitre() {
    return detailTitre;
  }


  public void setDetailTitre(String detailTitre) {
    this.detailTitre = detailTitre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bac bac = (Bac) o;
    return Objects.equals(this.titreAcces, bac.titreAcces) &&
        Objects.equals(this.anneeObtention, bac.anneeObtention) &&
        Objects.equals(this.serie, bac.serie) &&
        Objects.equals(this.mention, bac.mention) &&
        Objects.equals(this.typeEtablissement, bac.typeEtablissement) &&
        Objects.equals(this.pays, bac.pays) &&
        Objects.equals(this.departement, bac.departement) &&
        Objects.equals(this.etablissement, bac.etablissement) &&
        Objects.equals(this.ine, bac.ine) &&
        Objects.equals(this.etablissementLibre, bac.etablissementLibre) &&
        Objects.equals(this.detailTitre, bac.detailTitre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titreAcces, anneeObtention, serie, mention, typeEtablissement, pays, departement, etablissement, ine, etablissementLibre, detailTitre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bac {\n");
    sb.append("    titreAcces: ").append(toIndentedString(titreAcces)).append("\n");
    sb.append("    anneeObtention: ").append(toIndentedString(anneeObtention)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    mention: ").append(toIndentedString(mention)).append("\n");
    sb.append("    typeEtablissement: ").append(toIndentedString(typeEtablissement)).append("\n");
    sb.append("    pays: ").append(toIndentedString(pays)).append("\n");
    sb.append("    departement: ").append(toIndentedString(departement)).append("\n");
    sb.append("    etablissement: ").append(toIndentedString(etablissement)).append("\n");
    sb.append("    ine: ").append(toIndentedString(ine)).append("\n");
    sb.append("    etablissementLibre: ").append(toIndentedString(etablissementLibre)).append("\n");
    sb.append("    detailTitre: ").append(toIndentedString(detailTitre)).append("\n");
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

