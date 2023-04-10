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
public class CollisionEnergy {
  public static final String SERIALIZED_NAME_MIN_ENERGY = "minEnergy";
  @SerializedName(SERIALIZED_NAME_MIN_ENERGY)
  private Double minEnergy;

  public static final String SERIALIZED_NAME_MAX_ENERGY = "maxEnergy";
  @SerializedName(SERIALIZED_NAME_MAX_ENERGY)
  private Double maxEnergy;

  public static final String SERIALIZED_NAME_CORRECTED = "corrected";
  @SerializedName(SERIALIZED_NAME_CORRECTED)
  private Boolean corrected;

  public CollisionEnergy() {
  }

  public CollisionEnergy minEnergy(Double minEnergy) {
    
    this.minEnergy = minEnergy;
    return this;
  }

   /**
   * Get minEnergy
   * @return minEnergy
  **/
  @javax.annotation.Nullable

  public Double getMinEnergy() {
    return minEnergy;
  }


  public void setMinEnergy(Double minEnergy) {
    this.minEnergy = minEnergy;
  }


  public CollisionEnergy maxEnergy(Double maxEnergy) {
    
    this.maxEnergy = maxEnergy;
    return this;
  }

   /**
   * Get maxEnergy
   * @return maxEnergy
  **/
  @javax.annotation.Nullable

  public Double getMaxEnergy() {
    return maxEnergy;
  }


  public void setMaxEnergy(Double maxEnergy) {
    this.maxEnergy = maxEnergy;
  }


  public CollisionEnergy corrected(Boolean corrected) {
    
    this.corrected = corrected;
    return this;
  }

   /**
   * Get corrected
   * @return corrected
  **/
  @javax.annotation.Nullable

  public Boolean getCorrected() {
    return corrected;
  }


  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollisionEnergy collisionEnergy = (CollisionEnergy) o;
    return Objects.equals(this.minEnergy, collisionEnergy.minEnergy) &&
        Objects.equals(this.maxEnergy, collisionEnergy.maxEnergy) &&
        Objects.equals(this.corrected, collisionEnergy.corrected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minEnergy, maxEnergy, corrected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollisionEnergy {\n");
    sb.append("    minEnergy: ").append(toIndentedString(minEnergy)).append("\n");
    sb.append("    maxEnergy: ").append(toIndentedString(maxEnergy)).append("\n");
    sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
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
    openapiFields.add("minEnergy");
    openapiFields.add("maxEnergy");
    openapiFields.add("corrected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollisionEnergy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollisionEnergy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollisionEnergy is not found in the empty JSON string", CollisionEnergy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CollisionEnergy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollisionEnergy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollisionEnergy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollisionEnergy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollisionEnergy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollisionEnergy.class));

       return (TypeAdapter<T>) new TypeAdapter<CollisionEnergy>() {
           @Override
           public void write(JsonWriter out, CollisionEnergy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollisionEnergy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollisionEnergy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollisionEnergy
  * @throws IOException if the JSON string is invalid with respect to CollisionEnergy
  */
  public static CollisionEnergy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollisionEnergy.class);
  }

 /**
  * Convert an instance of CollisionEnergy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

