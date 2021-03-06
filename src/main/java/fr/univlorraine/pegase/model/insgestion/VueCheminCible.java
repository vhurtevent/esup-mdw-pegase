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
 * VueCheminCible
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-11T16:15:29.973+01:00[Europe/Paris]")
public class VueCheminCible {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LIBELLE_COURT = "libelleCourt";
  @SerializedName(SERIALIZED_NAME_LIBELLE_COURT)
  private String libelleCourt;

  public static final String SERIALIZED_NAME_LIBELLE_LONG = "libelleLong";
  @SerializedName(SERIALIZED_NAME_LIBELLE_LONG)
  private String libelleLong;


  public VueCheminCible code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code l&#39;objet dans la maquette de formation
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Code l'objet dans la maquette de formation")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public VueCheminCible type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Code du type de l&#39;objet dans la maquette de formation (PARCOUR_TYPE, ANNEE, SEMESTRE, ...)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Code du type de l'objet dans la maquette de formation (PARCOUR_TYPE, ANNEE, SEMESTRE, ...)")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VueCheminCible libelleCourt(String libelleCourt) {
    
    this.libelleCourt = libelleCourt;
    return this;
  }

   /**
   * Libellé court de l&#39;objet dans la maquette de formation
   * @return libelleCourt
  **/
  @ApiModelProperty(required = true, value = "Libellé court de l'objet dans la maquette de formation")

  public String getLibelleCourt() {
    return libelleCourt;
  }


  public void setLibelleCourt(String libelleCourt) {
    this.libelleCourt = libelleCourt;
  }


  public VueCheminCible libelleLong(String libelleLong) {
    
    this.libelleLong = libelleLong;
    return this;
  }

   /**
   * Libellé long de l&#39;objet dans la maquette de formation
   * @return libelleLong
  **/
  @ApiModelProperty(required = true, value = "Libellé long de l'objet dans la maquette de formation")

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
    VueCheminCible vueCheminCible = (VueCheminCible) o;
    return Objects.equals(this.code, vueCheminCible.code) &&
        Objects.equals(this.type, vueCheminCible.type) &&
        Objects.equals(this.libelleCourt, vueCheminCible.libelleCourt) &&
        Objects.equals(this.libelleLong, vueCheminCible.libelleLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, libelleCourt, libelleLong);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VueCheminCible {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

