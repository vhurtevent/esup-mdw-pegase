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
 * La voie d&#39;admission
 */
@JsonAdapter(VoieAdmission.Adapter.class)
public enum VoieAdmission {
  
  CONCOURS("concours"),
  
  TITRE("titre"),
  
  DOSSIER("dossier");

  private String value;

  VoieAdmission(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VoieAdmission fromValue(String value) {
    for (VoieAdmission b : VoieAdmission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VoieAdmission> {
    @Override
    public void write(final JsonWriter jsonWriter, final VoieAdmission enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VoieAdmission read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VoieAdmission.fromValue(value);
    }
  }
}
