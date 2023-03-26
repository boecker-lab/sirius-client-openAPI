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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T19:58:17.564906Z[Etc/UTC]")
public class UseHeuristic {
  public static final String SERIALIZED_NAME_MZ_TO_USE_HEURISTIC = "mzToUseHeuristic";
  @SerializedName(SERIALIZED_NAME_MZ_TO_USE_HEURISTIC)
  private Integer mzToUseHeuristic;

  public static final String SERIALIZED_NAME_MZ_TO_USE_HEURISTIC_ONLY = "mzToUseHeuristicOnly";
  @SerializedName(SERIALIZED_NAME_MZ_TO_USE_HEURISTIC_ONLY)
  private Integer mzToUseHeuristicOnly;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public UseHeuristic() {
  }

  public UseHeuristic mzToUseHeuristic(Integer mzToUseHeuristic) {
    
    this.mzToUseHeuristic = mzToUseHeuristic;
    return this;
  }

   /**
   * Get mzToUseHeuristic
   * @return mzToUseHeuristic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMzToUseHeuristic() {
    return mzToUseHeuristic;
  }


  public void setMzToUseHeuristic(Integer mzToUseHeuristic) {
    this.mzToUseHeuristic = mzToUseHeuristic;
  }


  public UseHeuristic mzToUseHeuristicOnly(Integer mzToUseHeuristicOnly) {
    
    this.mzToUseHeuristicOnly = mzToUseHeuristicOnly;
    return this;
  }

   /**
   * Get mzToUseHeuristicOnly
   * @return mzToUseHeuristicOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMzToUseHeuristicOnly() {
    return mzToUseHeuristicOnly;
  }


  public void setMzToUseHeuristicOnly(Integer mzToUseHeuristicOnly) {
    this.mzToUseHeuristicOnly = mzToUseHeuristicOnly;
  }


  public UseHeuristic identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseHeuristic useHeuristic = (UseHeuristic) o;
    return Objects.equals(this.mzToUseHeuristic, useHeuristic.mzToUseHeuristic) &&
        Objects.equals(this.mzToUseHeuristicOnly, useHeuristic.mzToUseHeuristicOnly) &&
        Objects.equals(this.identifier, useHeuristic.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mzToUseHeuristic, mzToUseHeuristicOnly, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseHeuristic {\n");
    sb.append("    mzToUseHeuristic: ").append(toIndentedString(mzToUseHeuristic)).append("\n");
    sb.append("    mzToUseHeuristicOnly: ").append(toIndentedString(mzToUseHeuristicOnly)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
    openapiFields.add("mzToUseHeuristic");
    openapiFields.add("mzToUseHeuristicOnly");
    openapiFields.add("identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UseHeuristic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UseHeuristic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UseHeuristic is not found in the empty JSON string", UseHeuristic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UseHeuristic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UseHeuristic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UseHeuristic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UseHeuristic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UseHeuristic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UseHeuristic.class));

       return (TypeAdapter<T>) new TypeAdapter<UseHeuristic>() {
           @Override
           public void write(JsonWriter out, UseHeuristic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UseHeuristic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UseHeuristic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UseHeuristic
  * @throws IOException if the JSON string is invalid with respect to UseHeuristic
  */
  public static UseHeuristic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UseHeuristic.class);
  }

 /**
  * Convert an instance of UseHeuristic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

