/*
 * Swagger Gestion - INS
 * Il s'agit de l'API de gestion - INS.
 *
 * The version of the OpenAPI document: 1.0.0
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
 * Le statut de l&#39;inscription
 */
@JsonAdapter(StatutInscriptionVoeu.Adapter.class)
public enum StatutInscriptionVoeu {
  
  PREINSCRIT("preinscrit"),
  
  NON_DEMARRE("non_demarre"),
  
  EN_COURS("en_cours"),
  
  VALIDE("valide"),
  
  EN_ACTUALISATION("en_actualisation");

  private String value;

  StatutInscriptionVoeu(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatutInscriptionVoeu fromValue(String value) {
    for (StatutInscriptionVoeu b : StatutInscriptionVoeu.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StatutInscriptionVoeu> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatutInscriptionVoeu enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StatutInscriptionVoeu read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StatutInscriptionVoeu.fromValue(value);
    }
  }
}
