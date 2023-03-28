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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-28T16:16:33.449853Z[Etc/UTC]")
public class FragmentNode {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MOLECULAR_FORMULA = "molecularFormula";
  @SerializedName(SERIALIZED_NAME_MOLECULAR_FORMULA)
  private String molecularFormula;

  public static final String SERIALIZED_NAME_ION_TYPE = "ionType";
  @SerializedName(SERIALIZED_NAME_ION_TYPE)
  private String ionType;

  public static final String SERIALIZED_NAME_MASS_DEVIATION_DA = "massDeviationDa";
  @SerializedName(SERIALIZED_NAME_MASS_DEVIATION_DA)
  private Double massDeviationDa;

  public static final String SERIALIZED_NAME_MASS_ERROR_PPM = "massErrorPpm";
  @SerializedName(SERIALIZED_NAME_MASS_ERROR_PPM)
  private Double massErrorPpm;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_INTENSITY = "intensity";
  @SerializedName(SERIALIZED_NAME_INTENSITY)
  private Double intensity;

  public static final String SERIALIZED_NAME_MZ = "mz";
  @SerializedName(SERIALIZED_NAME_MZ)
  private Double mz;

  public FragmentNode() {
  }

  public FragmentNode id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public FragmentNode molecularFormula(String molecularFormula) {
    
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


  public FragmentNode ionType(String ionType) {
    
    this.ionType = ionType;
    return this;
  }

   /**
   * Get ionType
   * @return ionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIonType() {
    return ionType;
  }


  public void setIonType(String ionType) {
    this.ionType = ionType;
  }


  public FragmentNode massDeviationDa(Double massDeviationDa) {
    
    this.massDeviationDa = massDeviationDa;
    return this;
  }

   /**
   * Get massDeviationDa
   * @return massDeviationDa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMassDeviationDa() {
    return massDeviationDa;
  }


  public void setMassDeviationDa(Double massDeviationDa) {
    this.massDeviationDa = massDeviationDa;
  }


  public FragmentNode massErrorPpm(Double massErrorPpm) {
    
    this.massErrorPpm = massErrorPpm;
    return this;
  }

   /**
   * Get massErrorPpm
   * @return massErrorPpm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMassErrorPpm() {
    return massErrorPpm;
  }


  public void setMassErrorPpm(Double massErrorPpm) {
    this.massErrorPpm = massErrorPpm;
  }


  public FragmentNode score(Double score) {
    
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


  public FragmentNode intensity(Double intensity) {
    
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIntensity() {
    return intensity;
  }


  public void setIntensity(Double intensity) {
    this.intensity = intensity;
  }


  public FragmentNode mz(Double mz) {
    
    this.mz = mz;
    return this;
  }

   /**
   * Get mz
   * @return mz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMz() {
    return mz;
  }


  public void setMz(Double mz) {
    this.mz = mz;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentNode fragmentNode = (FragmentNode) o;
    return Objects.equals(this.id, fragmentNode.id) &&
        Objects.equals(this.molecularFormula, fragmentNode.molecularFormula) &&
        Objects.equals(this.ionType, fragmentNode.ionType) &&
        Objects.equals(this.massDeviationDa, fragmentNode.massDeviationDa) &&
        Objects.equals(this.massErrorPpm, fragmentNode.massErrorPpm) &&
        Objects.equals(this.score, fragmentNode.score) &&
        Objects.equals(this.intensity, fragmentNode.intensity) &&
        Objects.equals(this.mz, fragmentNode.mz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, molecularFormula, ionType, massDeviationDa, massErrorPpm, score, intensity, mz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentNode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    molecularFormula: ").append(toIndentedString(molecularFormula)).append("\n");
    sb.append("    ionType: ").append(toIndentedString(ionType)).append("\n");
    sb.append("    massDeviationDa: ").append(toIndentedString(massDeviationDa)).append("\n");
    sb.append("    massErrorPpm: ").append(toIndentedString(massErrorPpm)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    mz: ").append(toIndentedString(mz)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("molecularFormula");
    openapiFields.add("ionType");
    openapiFields.add("massDeviationDa");
    openapiFields.add("massErrorPpm");
    openapiFields.add("score");
    openapiFields.add("intensity");
    openapiFields.add("mz");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FragmentNode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FragmentNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FragmentNode is not found in the empty JSON string", FragmentNode.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FragmentNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FragmentNode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("molecularFormula") != null && !jsonObj.get("molecularFormula").isJsonNull()) && !jsonObj.get("molecularFormula").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `molecularFormula` to be a primitive type in the JSON string but got `%s`", jsonObj.get("molecularFormula").toString()));
      }
      if ((jsonObj.get("ionType") != null && !jsonObj.get("ionType").isJsonNull()) && !jsonObj.get("ionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FragmentNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FragmentNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FragmentNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FragmentNode.class));

       return (TypeAdapter<T>) new TypeAdapter<FragmentNode>() {
           @Override
           public void write(JsonWriter out, FragmentNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FragmentNode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FragmentNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FragmentNode
  * @throws IOException if the JSON string is invalid with respect to FragmentNode
  */
  public static FragmentNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FragmentNode.class);
  }

 /**
  * Convert an instance of FragmentNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

