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
import fr.univlorraine.pegase.model.insgestion.Formation;
import fr.univlorraine.pegase.model.insgestion.Periode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CibleInscriptionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T16:15:29.973+01:00[Europe/Paris]")
public class CibleInscriptionAllOf {
  public static final String SERIALIZED_NAME_CODE_CHEMIN = "codeChemin";
  @SerializedName(SERIALIZED_NAME_CODE_CHEMIN)
  private String codeChemin;

  public static final String SERIALIZED_NAME_CODE_STRUCTURE = "codeStructure";
  @SerializedName(SERIALIZED_NAME_CODE_STRUCTURE)
  private String codeStructure;

  public static final String SERIALIZED_NAME_FORMATION = "formation";
  @SerializedName(SERIALIZED_NAME_FORMATION)
  private Formation formation = null;

  public static final String SERIALIZED_NAME_PERIODE = "periode";
  @SerializedName(SERIALIZED_NAME_PERIODE)
  private Periode periode = null;


  public CibleInscriptionAllOf codeChemin(String codeChemin) {
    
    this.codeChemin = codeChemin;
    return this;
  }

   /**
   * Le chemin d&#39;accès à l&#39;objet de formation
   * @return codeChemin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F-ING-BIOSC→FING-BIOSC-A1→FING-BIOSC-S1", value = "Le chemin d'accès à l'objet de formation")

  public String getCodeChemin() {
    return codeChemin;
  }


  public void setCodeChemin(String codeChemin) {
    this.codeChemin = codeChemin;
  }


  public CibleInscriptionAllOf codeStructure(String codeStructure) {
    
    this.codeStructure = codeStructure;
    return this;
  }

   /**
   * Le code de la structure issu de la nomenclature Structures organisationnelles
   * @return codeStructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ETAB00", value = "Le code de la structure issu de la nomenclature Structures organisationnelles")

  public String getCodeStructure() {
    return codeStructure;
  }


  public void setCodeStructure(String codeStructure) {
    this.codeStructure = codeStructure;
  }


  public CibleInscriptionAllOf formation(Formation formation) {
    
    this.formation = formation;
    return this;
  }

   /**
   * Get formation
   * @return formation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Formation getFormation() {
    return formation;
  }


  public void setFormation(Formation formation) {
    this.formation = formation;
  }


  public CibleInscriptionAllOf periode(Periode periode) {
    
    this.periode = periode;
    return this;
  }

   /**
   * Get periode
   * @return periode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Periode getPeriode() {
    return periode;
  }


  public void setPeriode(Periode periode) {
    this.periode = periode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CibleInscriptionAllOf cibleInscriptionAllOf = (CibleInscriptionAllOf) o;
    return Objects.equals(this.codeChemin, cibleInscriptionAllOf.codeChemin) &&
        Objects.equals(this.codeStructure, cibleInscriptionAllOf.codeStructure) &&
        Objects.equals(this.formation, cibleInscriptionAllOf.formation) &&
        Objects.equals(this.periode, cibleInscriptionAllOf.periode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeChemin, codeStructure, formation, periode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CibleInscriptionAllOf {\n");
    sb.append("    codeChemin: ").append(toIndentedString(codeChemin)).append("\n");
    sb.append("    codeStructure: ").append(toIndentedString(codeStructure)).append("\n");
    sb.append("    formation: ").append(toIndentedString(formation)).append("\n");
    sb.append("    periode: ").append(toIndentedString(periode)).append("\n");
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

