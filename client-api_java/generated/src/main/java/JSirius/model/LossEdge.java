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
import JSirius.model.FragmentNode;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:54:10.963050Z[Etc/UTC]")
public class LossEdge {
  public static final String SERIALIZED_NAME_SOURCE_FRAGMENT = "sourceFragment";
  @SerializedName(SERIALIZED_NAME_SOURCE_FRAGMENT)
  private FragmentNode sourceFragment;

  public static final String SERIALIZED_NAME_TARGET_FRAGMENT = "targetFragment";
  @SerializedName(SERIALIZED_NAME_TARGET_FRAGMENT)
  private FragmentNode targetFragment;

  public static final String SERIALIZED_NAME_MOLECULAR_FORMULA = "molecularFormula";
  @SerializedName(SERIALIZED_NAME_MOLECULAR_FORMULA)
  private String molecularFormula;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public LossEdge() {
  }

  public LossEdge sourceFragment(FragmentNode sourceFragment) {
    
    this.sourceFragment = sourceFragment;
    return this;
  }

   /**
   * Get sourceFragment
   * @return sourceFragment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FragmentNode getSourceFragment() {
    return sourceFragment;
  }


  public void setSourceFragment(FragmentNode sourceFragment) {
    this.sourceFragment = sourceFragment;
  }


  public LossEdge targetFragment(FragmentNode targetFragment) {
    
    this.targetFragment = targetFragment;
    return this;
  }

   /**
   * Get targetFragment
   * @return targetFragment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FragmentNode getTargetFragment() {
    return targetFragment;
  }


  public void setTargetFragment(FragmentNode targetFragment) {
    this.targetFragment = targetFragment;
  }


  public LossEdge molecularFormula(String molecularFormula) {
    
    this.molecularFormula = molecularFormula;
    return this;
  }

   /**
   * Get molecularFormula
   * @return molecularFormula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMolecularFormula() {
    return molecularFormula;
  }


  public void setMolecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
  }


  public LossEdge score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LossEdge lossEdge = (LossEdge) o;
    return Objects.equals(this.sourceFragment, lossEdge.sourceFragment) &&
        Objects.equals(this.targetFragment, lossEdge.targetFragment) &&
        Objects.equals(this.molecularFormula, lossEdge.molecularFormula) &&
        Objects.equals(this.score, lossEdge.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFragment, targetFragment, molecularFormula, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LossEdge {\n");
    sb.append("    sourceFragment: ").append(toIndentedString(sourceFragment)).append("\n");
    sb.append("    targetFragment: ").append(toIndentedString(targetFragment)).append("\n");
    sb.append("    molecularFormula: ").append(toIndentedString(molecularFormula)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("sourceFragment");
    openapiFields.add("targetFragment");
    openapiFields.add("molecularFormula");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LossEdge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LossEdge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LossEdge is not found in the empty JSON string", LossEdge.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LossEdge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LossEdge` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `sourceFragment`
      if (jsonObj.get("sourceFragment") != null && !jsonObj.get("sourceFragment").isJsonNull()) {
        FragmentNode.validateJsonObject(jsonObj.getAsJsonObject("sourceFragment"));
      }
      // validate the optional field `targetFragment`
      if (jsonObj.get("targetFragment") != null && !jsonObj.get("targetFragment").isJsonNull()) {
        FragmentNode.validateJsonObject(jsonObj.getAsJsonObject("targetFragment"));
      }
      if ((jsonObj.get("molecularFormula") != null && !jsonObj.get("molecularFormula").isJsonNull()) && !jsonObj.get("molecularFormula").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `molecularFormula` to be a primitive type in the JSON string but got `%s`", jsonObj.get("molecularFormula").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LossEdge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LossEdge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LossEdge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LossEdge.class));

       return (TypeAdapter<T>) new TypeAdapter<LossEdge>() {
           @Override
           public void write(JsonWriter out, LossEdge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LossEdge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LossEdge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LossEdge
  * @throws IOException if the JSON string is invalid with respect to LossEdge
  */
  public static LossEdge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LossEdge.class);
  }

 /**
  * Convert an instance of LossEdge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

