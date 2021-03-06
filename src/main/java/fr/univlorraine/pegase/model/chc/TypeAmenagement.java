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
import fr.univlorraine.pegase.model.chc.Nomenclature;
import fr.univlorraine.pegase.model.chc.TypeAmenagement1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * TypeAmenagement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T17:44:47.769+01:00[Europe/Paris]")
public class TypeAmenagement {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATE_DEBUT_VALIDITE = "dateDebutValidite";
  @SerializedName(SERIALIZED_NAME_DATE_DEBUT_VALIDITE)
  private LocalDate dateDebutValidite;

  public static final String SERIALIZED_NAME_DATE_FIN_VALIDITE = "dateFinValidite";
  @SerializedName(SERIALIZED_NAME_DATE_FIN_VALIDITE)
  private LocalDate dateFinValidite;

  public static final String SERIALIZED_NAME_LIBELLE_AFFICHAGE = "libelleAffichage";
  @SerializedName(SERIALIZED_NAME_LIBELLE_AFFICHAGE)
  private String libelleAffichage;

  public static final String SERIALIZED_NAME_LIBELLE_COURT = "libelleCourt";
  @SerializedName(SERIALIZED_NAME_LIBELLE_COURT)
  private String libelleCourt;

  public static final String SERIALIZED_NAME_LIBELLE_LONG = "libelleLong";
  @SerializedName(SERIALIZED_NAME_LIBELLE_LONG)
  private String libelleLong;

  public static final String SERIALIZED_NAME_PRIORITE_AFFICHAGE = "prioriteAffichage";
  @SerializedName(SERIALIZED_NAME_PRIORITE_AFFICHAGE)
  private Integer prioriteAffichage;

  public static final String SERIALIZED_NAME_TEMOIN_LIVRE = "temoinLivre";
  @SerializedName(SERIALIZED_NAME_TEMOIN_LIVRE)
  private Boolean temoinLivre;

  public static final String SERIALIZED_NAME_TEMOIN_VISIBLE = "temoinVisible";
  @SerializedName(SERIALIZED_NAME_TEMOIN_VISIBLE)
  private Boolean temoinVisible;

  public static final String SERIALIZED_NAME_TYPE_NOMENCLATURE = "typeNomenclature";
  @SerializedName(SERIALIZED_NAME_TYPE_NOMENCLATURE)
  private String typeNomenclature;

  public static final String SERIALIZED_NAME_DATE_CONSOMMATION = "dateConsommation";
  @SerializedName(SERIALIZED_NAME_DATE_CONSOMMATION)
  private LocalDate dateConsommation;

  public static final String SERIALIZED_NAME_MOTIF = "motif";
  @SerializedName(SERIALIZED_NAME_MOTIF)
  private String motif;

  public static final String SERIALIZED_NAME_PORTEE = "portee";
  @SerializedName(SERIALIZED_NAME_PORTEE)
  private String portee;

  public static final String SERIALIZED_NAME_PRISE_EN_COMPTE = "priseEnCompte";
  @SerializedName(SERIALIZED_NAME_PRISE_EN_COMPTE)
  private String priseEnCompte;


  public TypeAmenagement code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code interne de la nomenclature choisi par l&#39;établissement
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code interne de la nomenclature choisi par l'établissement")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TypeAmenagement dateDebutValidite(LocalDate dateDebutValidite) {
    
    this.dateDebutValidite = dateDebutValidite;
    return this;
  }

   /**
   * Date du début de la validité de la nomenclature
   * @return dateDebutValidite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date du début de la validité de la nomenclature")

  public LocalDate getDateDebutValidite() {
    return dateDebutValidite;
  }


  public void setDateDebutValidite(LocalDate dateDebutValidite) {
    this.dateDebutValidite = dateDebutValidite;
  }


  public TypeAmenagement dateFinValidite(LocalDate dateFinValidite) {
    
    this.dateFinValidite = dateFinValidite;
    return this;
  }

   /**
   * Date de la fin de la validité de la nomenclature
   * @return dateFinValidite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date de la fin de la validité de la nomenclature")

  public LocalDate getDateFinValidite() {
    return dateFinValidite;
  }


  public void setDateFinValidite(LocalDate dateFinValidite) {
    this.dateFinValidite = dateFinValidite;
  }


  public TypeAmenagement libelleAffichage(String libelleAffichage) {
    
    this.libelleAffichage = libelleAffichage;
    return this;
  }

   /**
   * Libellé qui sera affiché aux usagers pour les fonctionnalités à distance
   * @return libelleAffichage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Libellé qui sera affiché aux usagers pour les fonctionnalités à distance")

  public String getLibelleAffichage() {
    return libelleAffichage;
  }


  public void setLibelleAffichage(String libelleAffichage) {
    this.libelleAffichage = libelleAffichage;
  }


  public TypeAmenagement libelleCourt(String libelleCourt) {
    
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Libelle court de la nomenclature
   * @return libelleCourt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Libelle court de la nomenclature")

  public String getLibelleCourt() {
    return libelleCourt;
  }


  public void setLibelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
  }


  public TypeAmenagement libelleLong(String libelleLong) {
    
    this.libelleLong = libelleLong;
    return this;
  }

   /**
   * Nom complet de la nomenclature
   * @return libelleLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nom complet de la nomenclature")

  public String getLibelleLong() {
    return libelleLong;
  }


  public void setLibelleLong(String libelleLong) {
    this.libelleLong = libelleLong;
  }


  public TypeAmenagement prioriteAffichage(Integer prioriteAffichage) {
    
    this.prioriteAffichage = prioriteAffichage;
    return this;
  }

   /**
   * Plus le nombre est élevé plus il apparaît en priorité dans la liste de valeurs
   * @return prioriteAffichage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plus le nombre est élevé plus il apparaît en priorité dans la liste de valeurs")

  public Integer getPrioriteAffichage() {
    return prioriteAffichage;
  }


  public void setPrioriteAffichage(Integer prioriteAffichage) {
    this.prioriteAffichage = prioriteAffichage;
  }


  public TypeAmenagement temoinLivre(Boolean temoinLivre) {
    
    this.temoinLivre = temoinLivre;
    return this;
  }

   /**
   * Témoin indiquant si la nomenclature a été livrée
   * @return temoinLivre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin indiquant si la nomenclature a été livrée")

  public Boolean getTemoinLivre() {
    return temoinLivre;
  }


  public void setTemoinLivre(Boolean temoinLivre) {
    this.temoinLivre = temoinLivre;
  }


  public TypeAmenagement temoinVisible(Boolean temoinVisible) {
    
    this.temoinVisible = temoinVisible;
    return this;
  }

   /**
   * Témoin de la visibilité de la nomenclature
   * @return temoinVisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Témoin de la visibilité de la nomenclature")

  public Boolean getTemoinVisible() {
    return temoinVisible;
  }


  public void setTemoinVisible(Boolean temoinVisible) {
    this.temoinVisible = temoinVisible;
  }


  public TypeAmenagement typeNomenclature(String typeNomenclature) {
    
    this.typeNomenclature = typeNomenclature;
    return this;
  }

   /**
   * Discriminant
   * @return typeNomenclature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discriminant")

  public String getTypeNomenclature() {
    return typeNomenclature;
  }


  public void setTypeNomenclature(String typeNomenclature) {
    this.typeNomenclature = typeNomenclature;
  }


  public TypeAmenagement dateConsommation(LocalDate dateConsommation) {
    
    this.dateConsommation = dateConsommation;
    return this;
  }

   /**
   * Date du début de la validité de la nomenclature
   * @return dateConsommation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date du début de la validité de la nomenclature")

  public LocalDate getDateConsommation() {
    return dateConsommation;
  }


  public void setDateConsommation(LocalDate dateConsommation) {
    this.dateConsommation = dateConsommation;
  }


  public TypeAmenagement motif(String motif) {
    
    this.motif = motif;
    return this;
  }

   /**
   * motif de type amenagement
   * @return motif
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "motif de type amenagement")

  public String getMotif() {
    return motif;
  }


  public void setMotif(String motif) {
    this.motif = motif;
  }


  public TypeAmenagement portee(String portee) {
    
    this.portee = portee;
    return this;
  }

   /**
   * Portée du  type d&#39;aménagement
   * @return portee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Portée du  type d'aménagement")

  public String getPortee() {
    return portee;
  }


  public void setPortee(String portee) {
    this.portee = portee;
  }


  public TypeAmenagement priseEnCompte(String priseEnCompte) {
    
    this.priseEnCompte = priseEnCompte;
    return this;
  }

   /**
   * Prise en compte du type d&#39;aménagement
   * @return priseEnCompte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prise en compte du type d'aménagement")

  public String getPriseEnCompte() {
    return priseEnCompte;
  }


  public void setPriseEnCompte(String priseEnCompte) {
    this.priseEnCompte = priseEnCompte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeAmenagement typeAmenagement = (TypeAmenagement) o;
    return Objects.equals(this.code, typeAmenagement.code) &&
        Objects.equals(this.dateDebutValidite, typeAmenagement.dateDebutValidite) &&
        Objects.equals(this.dateFinValidite, typeAmenagement.dateFinValidite) &&
        Objects.equals(this.libelleAffichage, typeAmenagement.libelleAffichage) &&
        Objects.equals(this.libelleCourt, typeAmenagement.libelleCourt) &&
        Objects.equals(this.libelleLong, typeAmenagement.libelleLong) &&
        Objects.equals(this.prioriteAffichage, typeAmenagement.prioriteAffichage) &&
        Objects.equals(this.temoinLivre, typeAmenagement.temoinLivre) &&
        Objects.equals(this.temoinVisible, typeAmenagement.temoinVisible) &&
        Objects.equals(this.typeNomenclature, typeAmenagement.typeNomenclature) &&
        Objects.equals(this.dateConsommation, typeAmenagement.dateConsommation) &&
        Objects.equals(this.motif, typeAmenagement.motif) &&
        Objects.equals(this.portee, typeAmenagement.portee) &&
        Objects.equals(this.priseEnCompte, typeAmenagement.priseEnCompte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, dateDebutValidite, dateFinValidite, libelleAffichage, libelleCourt, libelleLong, prioriteAffichage, temoinLivre, temoinVisible, typeNomenclature, dateConsommation, motif, portee, priseEnCompte);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeAmenagement {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateDebutValidite: ").append(toIndentedString(dateDebutValidite)).append("\n");
    sb.append("    dateFinValidite: ").append(toIndentedString(dateFinValidite)).append("\n");
    sb.append("    libelleAffichage: ").append(toIndentedString(libelleAffichage)).append("\n");
    sb.append("    libelleCourt: ").append(toIndentedString(libelleCourt)).append("\n");
    sb.append("    libelleLong: ").append(toIndentedString(libelleLong)).append("\n");
    sb.append("    prioriteAffichage: ").append(toIndentedString(prioriteAffichage)).append("\n");
    sb.append("    temoinLivre: ").append(toIndentedString(temoinLivre)).append("\n");
    sb.append("    temoinVisible: ").append(toIndentedString(temoinVisible)).append("\n");
    sb.append("    typeNomenclature: ").append(toIndentedString(typeNomenclature)).append("\n");
    sb.append("    dateConsommation: ").append(toIndentedString(dateConsommation)).append("\n");
    sb.append("    motif: ").append(toIndentedString(motif)).append("\n");
    sb.append("    portee: ").append(toIndentedString(portee)).append("\n");
    sb.append("    priseEnCompte: ").append(toIndentedString(priseEnCompte)).append("\n");
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

