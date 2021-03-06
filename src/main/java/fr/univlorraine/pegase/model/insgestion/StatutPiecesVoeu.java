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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Le statut de l&#39;ensemble des pièces
 */
@JsonAdapter(StatutPiecesVoeu.Adapter.class)
public enum StatutPiecesVoeu {
  
  SANS_STATUT("sans_statut"),
  
  NON_VALIDE("non_valide"),
  
  ATTENTE_VALIDATION("attente_validation"),
  
  VALIDE("valide");

  private String value;

  StatutPiecesVoeu(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatutPiecesVoeu fromValue(String value) {
    for (StatutPiecesVoeu b : StatutPiecesVoeu.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StatutPiecesVoeu> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatutPiecesVoeu enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StatutPiecesVoeu read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StatutPiecesVoeu.fromValue(value);
    }
  }
}

