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
import fr.univlorraine.pegase.model.insgestion.CibleInscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VoeuInscriptionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T16:15:29.973+01:00[Europe/Paris]")
public class VoeuInscriptionAllOf {
  public static final String SERIALIZED_NAME_CIBLE = "cible";
  @SerializedName(SERIALIZED_NAME_CIBLE)
  private CibleInscription cible = null;


  public VoeuInscriptionAllOf cible(CibleInscription cible) {
    
    this.cible = cible;
    return this;
  }

   /**
   * Get cible
   * @return cible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CibleInscription getCible() {
    return cible;
  }


  public void setCible(CibleInscription cible) {
    this.cible = cible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoeuInscriptionAllOf voeuInscriptionAllOf = (VoeuInscriptionAllOf) o;
    return Objects.equals(this.cible, voeuInscriptionAllOf.cible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoeuInscriptionAllOf {\n");
    sb.append("    cible: ").append(toIndentedString(cible)).append("\n");
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

