/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 5.6.4-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import JSirius.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnnotatedPeak {
  public static final String SERIALIZED_NAME_MASS = "mass";
  @SerializedName(SERIALIZED_NAME_MASS)
  private Double mass;

  public static final String SERIALIZED_NAME_INTENSITY = "intensity";
  @SerializedName(SERIALIZED_NAME_INTENSITY)
  private Double intensity;

  public static final String SERIALIZED_NAME_PEAK_ANNOTATION = "peakAnnotation";
  @SerializedName(SERIALIZED_NAME_PEAK_ANNOTATION)
  private Object peakAnnotation;

  public AnnotatedPeak() {
  }

  public AnnotatedPeak mass(Double mass) {
    
    this.mass = mass;
    return this;
  }

   /**
   * Get mass
   * @return mass
  **/
  @javax.annotation.Nullable

  public Double getMass() {
    return mass;
  }


  public void setMass(Double mass) {
    this.mass = mass;
  }


  public AnnotatedPeak intensity(Double intensity) {
    
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @javax.annotation.Nullable

  public Double getIntensity() {
    return intensity;
  }


  public void setIntensity(Double intensity) {
    this.intensity = intensity;
  }


  public AnnotatedPeak peakAnnotation(Object peakAnnotation) {
    
    this.peakAnnotation = peakAnnotation;
    return this;
  }

   /**
   * Get peakAnnotation
   * @return peakAnnotation
  **/
  @javax.annotation.Nullable

  public Object getPeakAnnotation() {
    return peakAnnotation;
  }


  public void setPeakAnnotation(Object peakAnnotation) {
    this.peakAnnotation = peakAnnotation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedPeak annotatedPeak = (AnnotatedPeak) o;
    return Objects.equals(this.mass, annotatedPeak.mass) &&
        Objects.equals(this.intensity, annotatedPeak.intensity) &&
        Objects.equals(this.peakAnnotation, annotatedPeak.peakAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mass, intensity, peakAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedPeak {\n");
    sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    peakAnnotation: ").append(toIndentedString(peakAnnotation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("mass");
    openapiFields.add("intensity");
    openapiFields.add("peakAnnotation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnnotatedPeak
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnnotatedPeak.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotatedPeak is not found in the empty JSON string", AnnotatedPeak.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnnotatedPeak.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnotatedPeak` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotatedPeak.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotatedPeak' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotatedPeak> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotatedPeak.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotatedPeak>() {
           @Override
           public void write(JsonWriter out, AnnotatedPeak value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnotatedPeak read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnnotatedPeak given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnnotatedPeak
  * @throws IOException if the JSON string is invalid with respect to AnnotatedPeak
  */
  public static AnnotatedPeak fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotatedPeak.class);
  }

 /**
  * Convert an instance of AnnotatedPeak to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

