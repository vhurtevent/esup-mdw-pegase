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
import fr.univlorraine.pegase.model.insgestion.VoieAdmission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Admission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T16:15:29.973+01:00[Europe/Paris]")
public class Admission {
  public static final String SERIALIZED_NAME_VOIE = "voie";
  @SerializedName(SERIALIZED_NAME_VOIE)
  private VoieAdmission voie;

  public static final String SERIALIZED_NAME_ANNEE_CONCOURS = "anneeConcours";
  @SerializedName(SERIALIZED_NAME_ANNEE_CONCOURS)
  private BigDecimal anneeConcours;

  public static final String SERIALIZED_NAME_CONCOURS = "concours";
  @SerializedName(SERIALIZED_NAME_CONCOURS)
  private String concours;

  public static final String SERIALIZED_NAME_RANG_CONCOURS = "rangConcours";
  @SerializedName(SERIALIZED_NAME_RANG_CONCOURS)
  private BigDecimal rangConcours;

  public static final String SERIALIZED_NAME_ANNEE_PRECEDENTE = "anneePrecedente";
  @SerializedName(SERIALIZED_NAME_ANNEE_PRECEDENTE)
  private BigDecimal anneePrecedente;

  public static final String SERIALIZED_NAME_TEMOIN_CLASSE_PREPA = "temoinClassePrepa";
  @SerializedName(SERIALIZED_NAME_TEMOIN_CLASSE_PREPA)
  private Boolean temoinClassePrepa;

  public static final String SERIALIZED_NAME_TYPE_PREPA = "typePrepa";
  @SerializedName(SERIALIZED_NAME_TYPE_PREPA)
  private String typePrepa;

  public static final String SERIALIZED_NAME_PUISSANCE_PREPA = "puissancePrepa";
  @SerializedName(SERIALIZED_NAME_PUISSANCE_PREPA)
  private String puissancePrepa;

  public static final String SERIALIZED_NAME_TYPE_ETABLISSEMENT_PRECEDENT = "typeEtablissementPrecedent";
  @SerializedName(SERIALIZED_NAME_TYPE_ETABLISSEMENT_PRECEDENT)
  private String typeEtablissementPrecedent;

  public static final String SERIALIZED_NAME_DEPARTEMENT_ETABLISSEMENT_PRECEDENT = "departementEtablissementPrecedent";
  @SerializedName(SERIALIZED_NAME_DEPARTEMENT_ETABLISSEMENT_PRECEDENT)
  private String departementEtablissementPrecedent;

  public static final String SERIALIZED_NAME_PAYS_ETABLISSEMENT_PRECEDENT = "paysEtablissementPrecedent";
  @SerializedName(SERIALIZED_NAME_PAYS_ETABLISSEMENT_PRECEDENT)
  private String paysEtablissementPrecedent;

  public static final String SERIALIZED_NAME_ETABLISSEMENT_PRECEDENT = "etablissementPrecedent";
  @SerializedName(SERIALIZED_NAME_ETABLISSEMENT_PRECEDENT)
  private String etablissementPrecedent;

  public static final String SERIALIZED_NAME_ETABLISSEMENT_PRECEDENT_ETRANGER = "etablissementPrecedentEtranger";
  @SerializedName(SERIALIZED_NAME_ETABLISSEMENT_PRECEDENT_ETRANGER)
  private String etablissementPrecedentEtranger;


  public Admission voie(VoieAdmission voie) {
    
    this.voie = voie;
    return this;
  }

   /**
   * Get voie
   * @return voie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoieAdmission getVoie() {
    return voie;
  }


  public void setVoie(VoieAdmission voie) {
    this.voie = voie;
  }


  public Admission anneeConcours(BigDecimal anneeConcours) {
    
    this.anneeConcours = anneeConcours;
    return this;
  }

   /**
   * L&#39;année de passage du concours d&#39;admission au format AAAA  Obligatoire si VoieAdmission &#x3D; concours 
   * @return anneeConcours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'année de passage du concours d'admission au format AAAA  Obligatoire si VoieAdmission = concours ")

  public BigDecimal getAnneeConcours() {
    return anneeConcours;
  }


  public void setAnneeConcours(BigDecimal anneeConcours) {
    this.anneeConcours = anneeConcours;
  }


  public Admission concours(String concours) {
    
    this.concours = concours;
    return this;
  }

   /**
   * Le code du concours d&#39;admission issu de la nomenclature Concours d&#39;admission.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : CON   Obligatoire si le champ anneeConcours est complété 
   * @return concours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du concours d'admission issu de la nomenclature Concours d'admission.  Codes de la nomenclature sur 6 caractères. Préfixe des codes : CON   Obligatoire si le champ anneeConcours est complété ")

  public String getConcours() {
    return concours;
  }


  public void setConcours(String concours) {
    this.concours = concours;
  }


  public Admission rangConcours(BigDecimal rangConcours) {
    
    this.rangConcours = rangConcours;
    return this;
  }

   /**
   * Le rang obtenu au concours d&#39;admission
   * @return rangConcours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le rang obtenu au concours d'admission")

  public BigDecimal getRangConcours() {
    return rangConcours;
  }


  public void setRangConcours(BigDecimal rangConcours) {
    this.rangConcours = rangConcours;
  }


  public Admission anneePrecedente(BigDecimal anneePrecedente) {
    
    this.anneePrecedente = anneePrecedente;
    return this;
  }

   /**
   * L&#39;année universitaire correspondant au cursus CPGE au format AAAA
   * @return anneePrecedente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "L'année universitaire correspondant au cursus CPGE au format AAAA")

  public BigDecimal getAnneePrecedente() {
    return anneePrecedente;
  }


  public void setAnneePrecedente(BigDecimal anneePrecedente) {
    this.anneePrecedente = anneePrecedente;
  }


  public Admission temoinClassePrepa(Boolean temoinClassePrepa) {
    
    this.temoinClassePrepa = temoinClassePrepa;
    return this;
  }

   /**
   * Le témoin indiquant que l&#39;étudiant a suivi un cursus en CPGE (classe préparatoire) l&#39;année dernière.  Obligatoire si le champ anneeConcours est complété. 
   * @return temoinClassePrepa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le témoin indiquant que l'étudiant a suivi un cursus en CPGE (classe préparatoire) l'année dernière.  Obligatoire si le champ anneeConcours est complété. ")

  public Boolean getTemoinClassePrepa() {
    return temoinClassePrepa;
  }


  public void setTemoinClassePrepa(Boolean temoinClassePrepa) {
    this.temoinClassePrepa = temoinClassePrepa;
  }


  public Admission typePrepa(String typePrepa) {
    
    this.typePrepa = typePrepa;
    return this;
  }

   /**
   * Le code du type de classe préparatoire fréquenté issu de la nomenclature Types de classe préparatoire   Codes de la nomenclature sur 6 caractères. Préfixe des codes : TCP  Obligatoire si temoinClassePrepa &#x3D; true 
   * @return typePrepa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du type de classe préparatoire fréquenté issu de la nomenclature Types de classe préparatoire   Codes de la nomenclature sur 6 caractères. Préfixe des codes : TCP  Obligatoire si temoinClassePrepa = true ")

  public String getTypePrepa() {
    return typePrepa;
  }


  public void setTypePrepa(String typePrepa) {
    this.typePrepa = typePrepa;
  }


  public Admission puissancePrepa(String puissancePrepa) {
    
    this.puissancePrepa = puissancePrepa;
    return this;
  }

   /**
   * La puissance de la classe préparatoire   Les valeurs P1, P2, P22 et P32 sont acceptées 
   * @return puissancePrepa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La puissance de la classe préparatoire   Les valeurs P1, P2, P22 et P32 sont acceptées ")

  public String getPuissancePrepa() {
    return puissancePrepa;
  }


  public void setPuissancePrepa(String puissancePrepa) {
    this.puissancePrepa = puissancePrepa;
  }


  public Admission typeEtablissementPrecedent(String typeEtablissementPrecedent) {
    
    this.typeEtablissementPrecedent = typeEtablissementPrecedent;
    return this;
  }

   /**
   * - F : français en France, - E : français à l&#39;étranger, - R : étranger   Obligatoire si temoinClassePrepa &#x3D; true 
   * @return typeEtablissementPrecedent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "- F : français en France, - E : français à l'étranger, - R : étranger   Obligatoire si temoinClassePrepa = true ")

  public String getTypeEtablissementPrecedent() {
    return typeEtablissementPrecedent;
  }


  public void setTypeEtablissementPrecedent(String typeEtablissementPrecedent) {
    this.typeEtablissementPrecedent = typeEtablissementPrecedent;
  }


  public Admission departementEtablissementPrecedent(String departementEtablissementPrecedent) {
    
    this.departementEtablissementPrecedent = departementEtablissementPrecedent;
    return this;
  }

   /**
   * Le code du département de l&#39;établissement de la CPGE si &#39;français en France&#39; issu de la nomenclature Départements   Obligatoire si typeEtablissementPrecedent &#x3D; F 
   * @return departementEtablissementPrecedent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du département de l'établissement de la CPGE si 'français en France' issu de la nomenclature Départements   Obligatoire si typeEtablissementPrecedent = F ")

  public String getDepartementEtablissementPrecedent() {
    return departementEtablissementPrecedent;
  }


  public void setDepartementEtablissementPrecedent(String departementEtablissementPrecedent) {
    this.departementEtablissementPrecedent = departementEtablissementPrecedent;
  }


  public Admission paysEtablissementPrecedent(String paysEtablissementPrecedent) {
    
    this.paysEtablissementPrecedent = paysEtablissementPrecedent;
    return this;
  }

   /**
   * Le code du pays de l&#39;établissement de la CPGE si &#39;français à l&#39;étranger&#39; ou &#39;étranger&#39; issu de la nomenclature Pays et Nationalités  Obligatoire si typeEtablissementPrecedent &#x3D; E ou R 
   * @return paysEtablissementPrecedent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code du pays de l'établissement de la CPGE si 'français à l'étranger' ou 'étranger' issu de la nomenclature Pays et Nationalités  Obligatoire si typeEtablissementPrecedent = E ou R ")

  public String getPaysEtablissementPrecedent() {
    return paysEtablissementPrecedent;
  }


  public void setPaysEtablissementPrecedent(String paysEtablissementPrecedent) {
    this.paysEtablissementPrecedent = paysEtablissementPrecedent;
  }


  public Admission etablissementPrecedent(String etablissementPrecedent) {
    
    this.etablissementPrecedent = etablissementPrecedent;
    return this;
  }

   /**
   * Le code de l&#39;établissement français de la CPGE si &#39;français en France&#39; ou &#39;français à l&#39;étranger&#39; issu de la nomenclature Etablissements français  Obligatoire 
   * @return etablissementPrecedent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de l'établissement français de la CPGE si 'français en France' ou 'français à l'étranger' issu de la nomenclature Etablissements français  Obligatoire ")

  public String getEtablissementPrecedent() {
    return etablissementPrecedent;
  }


  public void setEtablissementPrecedent(String etablissementPrecedent) {
    this.etablissementPrecedent = etablissementPrecedent;
  }


  public Admission etablissementPrecedentEtranger(String etablissementPrecedentEtranger) {
    
    this.etablissementPrecedentEtranger = etablissementPrecedentEtranger;
    return this;
  }

   /**
   * Le code de l&#39;établissement étranger de la CPGE si &#39;étranger&#39; issu de la nomenclature Etablissements étrangers  Obligatoire 
   * @return etablissementPrecedentEtranger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Le code de l'établissement étranger de la CPGE si 'étranger' issu de la nomenclature Etablissements étrangers  Obligatoire ")

  public String getEtablissementPrecedentEtranger() {
    return etablissementPrecedentEtranger;
  }


  public void setEtablissementPrecedentEtranger(String etablissementPrecedentEtranger) {
    this.etablissementPrecedentEtranger = etablissementPrecedentEtranger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Admission admission = (Admission) o;
    return Objects.equals(this.voie, admission.voie) &&
        Objects.equals(this.anneeConcours, admission.anneeConcours) &&
        Objects.equals(this.concours, admission.concours) &&
        Objects.equals(this.rangConcours, admission.rangConcours) &&
        Objects.equals(this.anneePrecedente, admission.anneePrecedente) &&
        Objects.equals(this.temoinClassePrepa, admission.temoinClassePrepa) &&
        Objects.equals(this.typePrepa, admission.typePrepa) &&
        Objects.equals(this.puissancePrepa, admission.puissancePrepa) &&
        Objects.equals(this.typeEtablissementPrecedent, admission.typeEtablissementPrecedent) &&
        Objects.equals(this.departementEtablissementPrecedent, admission.departementEtablissementPrecedent) &&
        Objects.equals(this.paysEtablissementPrecedent, admission.paysEtablissementPrecedent) &&
        Objects.equals(this.etablissementPrecedent, admission.etablissementPrecedent) &&
        Objects.equals(this.etablissementPrecedentEtranger, admission.etablissementPrecedentEtranger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voie, anneeConcours, concours, rangConcours, anneePrecedente, temoinClassePrepa, typePrepa, puissancePrepa, typeEtablissementPrecedent, departementEtablissementPrecedent, paysEtablissementPrecedent, etablissementPrecedent, etablissementPrecedentEtranger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Admission {\n");
    sb.append("    voie: ").append(toIndentedString(voie)).append("\n");
    sb.append("    anneeConcours: ").append(toIndentedString(anneeConcours)).append("\n");
    sb.append("    concours: ").append(toIndentedString(concours)).append("\n");
    sb.append("    rangConcours: ").append(toIndentedString(rangConcours)).append("\n");
    sb.append("    anneePrecedente: ").append(toIndentedString(anneePrecedente)).append("\n");
    sb.append("    temoinClassePrepa: ").append(toIndentedString(temoinClassePrepa)).append("\n");
    sb.append("    typePrepa: ").append(toIndentedString(typePrepa)).append("\n");
    sb.append("    puissancePrepa: ").append(toIndentedString(puissancePrepa)).append("\n");
    sb.append("    typeEtablissementPrecedent: ").append(toIndentedString(typeEtablissementPrecedent)).append("\n");
    sb.append("    departementEtablissementPrecedent: ").append(toIndentedString(departementEtablissementPrecedent)).append("\n");
    sb.append("    paysEtablissementPrecedent: ").append(toIndentedString(paysEtablissementPrecedent)).append("\n");
    sb.append("    etablissementPrecedent: ").append(toIndentedString(etablissementPrecedent)).append("\n");
    sb.append("    etablissementPrecedentEtranger: ").append(toIndentedString(etablissementPrecedentEtranger)).append("\n");
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

