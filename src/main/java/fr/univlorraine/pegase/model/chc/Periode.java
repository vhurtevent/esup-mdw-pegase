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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Periode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T17:44:47.769+01:00[Europe/Paris]")
public class Periode {
  public static final String SERIALIZED_NAME_ANNEE_UNIVERSITAIRE = "anneeUniversitaire";
  @SerializedName(SERIALIZED_NAME_ANNEE_UNIVERSITAIRE)
  private Integer anneeUniversitaire;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATE_DEBUT = "dateDebut";
  @SerializedName(SERIALIZED_NAME_DATE_DEBUT)
  private LocalDate dateDebut;

  public static final String SERIALIZED_NAME_DATE_FIN = "dateFin";
  @SerializedName(SERIALIZED_NAME_DATE_FIN)
  private LocalDate dateFin;

  public static final String SERIALIZED_NAME_LIBELLE_AFFICHAGE = "libelleAffichage";
  @SerializedName(SERIALIZED_NAME_LIBELLE_AFFICHAGE)
  private String libelleAffichage;

  public static final String SERIALIZED_NAME_LIBELLE_COURT = "libelleCourt";
  @SerializedName(SERIALIZED_NAME_LIBELLE_COURT)
  private String libelleCourt;

  public static final String SERIALIZED_NAME_LIBELLE_LONG = "libelleLong";
  @SerializedName(SERIALIZED_NAME_LIBELLE_LONG)
  private String libelleLong;


  public Periode anneeUniversitaire(Integer anneeUniversitaire) {
    
    this.anneeUniversitaire = anneeUniversitaire;
    return this;
  }

   /**
   * année universitaire - ex : 2019
   * @return anneeUniversitaire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "année universitaire - ex : 2019")

  public Integer getAnneeUniversitaire() {
    return anneeUniversitaire;
  }


  public void setAnneeUniversitaire(Integer anneeUniversitaire) {
    this.anneeUniversitaire = anneeUniversitaire;
  }


  public Periode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code de la période - identifiant unique
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code de la période - identifiant unique")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Periode dateDebut(LocalDate dateDebut) {
    
    this.dateDebut = dateDebut;
    return this;
  }

   /**
   * Date de début de la période
   * @return dateDebut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date de début de la période")

  public LocalDate getDateDebut() {
    return dateDebut;
  }


  public void setDateDebut(LocalDate dateDebut) {
    this.dateDebut = dateDebut;
  }


  public Periode dateFin(LocalDate dateFin) {
    
    this.dateFin = dateFin;
    return this;
  }

   /**
   * Date de fin de la période
   * @return dateFin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date de fin de la période")

  public LocalDate getDateFin() {
    return dateFin;
  }


  public void setDateFin(LocalDate dateFin) {
    this.dateFin = dateFin;
  }


  public Periode libelleAffichage(String libelleAffichage) {
    
    this.libelleAffichage = libelleAffichage;
    return this;
  }

   /**
   * Le libellé affichage de la période
   * @return libelleAffichage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le libellé affichage de la période")

  public String getLibelleAffichage() {
    return libelleAffichage;
  }


  public void setLibelleAffichage(String libelleAffichage) {
    this.libelleAffichage = libelleAffichage;
  }


  public Periode libelleCourt(String libelleCourt) {
    
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Le libellé court de la période
   * @return libelleCourt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le libellé court de la période")

  public String getLibelleCourt() {
    return libelleCourt;
  }


  public void setLibelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
  }


  public Periode libelleLong(String libelleLong) {
    
    this.libelleLong = libelleLong;
    return this;
  }

   /**
   * Le libellé long de la période
   * @return libelleLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le libellé long de la période")

  public String getLibelleLong() {
    return libelleLong;
  }


  public void setLibelleLong(String libelleLong) {
    this.libelleLong = libelleLong;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Periode periode = (Periode) o;
    return Objects.equals(this.anneeUniversitaire, periode.anneeUniversitaire) &&
        Objects.equals(this.code, periode.code) &&
        Objects.equals(this.dateDebut, periode.dateDebut) &&
        Objects.equals(this.dateFin, periode.dateFin) &&
        Objects.equals(this.libelleAffichage, periode.libelleAffichage) &&
        Objects.equals(this.libelleCourt, periode.libelleCourt) &&
        Objects.equals(this.libelleLong, periode.libelleLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anneeUniversitaire, code, dateDebut, dateFin, libelleAffichage, libelleCourt, libelleLong);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Periode {\n");
    sb.append("    anneeUniversitaire: ").append(toIndentedString(anneeUniversitaire)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateDebut: ").append(toIndentedString(dateDebut)).append("\n");
    sb.append("    dateFin: ").append(toIndentedString(dateFin)).append("\n");
    sb.append("    libelleAffichage: ").append(toIndentedString(libelleAffichage)).append("\n");
    sb.append("    libelleCourt: ").append(toIndentedString(libelleCourt)).append("\n");
    sb.append("    libelleLong: ").append(toIndentedString(libelleLong)).append("\n");
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

