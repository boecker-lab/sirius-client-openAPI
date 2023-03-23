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
import JSirius.model.ZodiacEdgeFilterThresholds;
import JSirius.model.ZodiacEpochs;
import JSirius.model.ZodiacNumberOfConsideredCandidatesAt300Mz;
import JSirius.model.ZodiacNumberOfConsideredCandidatesAt800Mz;
import JSirius.model.ZodiacRunInTwoSteps;
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
 * User/developer friendly parameter subset for the ZODIAC tool (Network base molecular formula re-ranking).
 */
@ApiModel(description = "User/developer friendly parameter subset for the ZODIAC tool (Network base molecular formula re-ranking).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-23T13:56:34.186298Z[Etc/UTC]")
public class Zodiac {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_CONSIDERED_CANDIDATES_AT300_MZ = "consideredCandidatesAt300Mz";
  @SerializedName(SERIALIZED_NAME_CONSIDERED_CANDIDATES_AT300_MZ)
  private ZodiacNumberOfConsideredCandidatesAt300Mz consideredCandidatesAt300Mz;

  public static final String SERIALIZED_NAME_CONSIDERED_CANDIDATES_AT800_MZ = "consideredCandidatesAt800Mz";
  @SerializedName(SERIALIZED_NAME_CONSIDERED_CANDIDATES_AT800_MZ)
  private ZodiacNumberOfConsideredCandidatesAt800Mz consideredCandidatesAt800Mz;

  public static final String SERIALIZED_NAME_RUN_IN_TWO_STEPS = "runInTwoSteps";
  @SerializedName(SERIALIZED_NAME_RUN_IN_TWO_STEPS)
  private ZodiacRunInTwoSteps runInTwoSteps;

  public static final String SERIALIZED_NAME_EDGE_FILTER_THRESHOLDS = "edgeFilterThresholds";
  @SerializedName(SERIALIZED_NAME_EDGE_FILTER_THRESHOLDS)
  private ZodiacEdgeFilterThresholds edgeFilterThresholds;

  public static final String SERIALIZED_NAME_GIBBS_SAMPLER_PARAMETERS = "gibbsSamplerParameters";
  @SerializedName(SERIALIZED_NAME_GIBBS_SAMPLER_PARAMETERS)
  private ZodiacEpochs gibbsSamplerParameters;

  public Zodiac() {
  }

  public Zodiac enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * tags whether the tool is enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tags whether the tool is enabled")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Zodiac consideredCandidatesAt300Mz(ZodiacNumberOfConsideredCandidatesAt300Mz consideredCandidatesAt300Mz) {
    
    this.consideredCandidatesAt300Mz = consideredCandidatesAt300Mz;
    return this;
  }

   /**
   * Get consideredCandidatesAt300Mz
   * @return consideredCandidatesAt300Mz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZodiacNumberOfConsideredCandidatesAt300Mz getConsideredCandidatesAt300Mz() {
    return consideredCandidatesAt300Mz;
  }


  public void setConsideredCandidatesAt300Mz(ZodiacNumberOfConsideredCandidatesAt300Mz consideredCandidatesAt300Mz) {
    this.consideredCandidatesAt300Mz = consideredCandidatesAt300Mz;
  }


  public Zodiac consideredCandidatesAt800Mz(ZodiacNumberOfConsideredCandidatesAt800Mz consideredCandidatesAt800Mz) {
    
    this.consideredCandidatesAt800Mz = consideredCandidatesAt800Mz;
    return this;
  }

   /**
   * Get consideredCandidatesAt800Mz
   * @return consideredCandidatesAt800Mz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZodiacNumberOfConsideredCandidatesAt800Mz getConsideredCandidatesAt800Mz() {
    return consideredCandidatesAt800Mz;
  }


  public void setConsideredCandidatesAt800Mz(ZodiacNumberOfConsideredCandidatesAt800Mz consideredCandidatesAt800Mz) {
    this.consideredCandidatesAt800Mz = consideredCandidatesAt800Mz;
  }


  public Zodiac runInTwoSteps(ZodiacRunInTwoSteps runInTwoSteps) {
    
    this.runInTwoSteps = runInTwoSteps;
    return this;
  }

   /**
   * Get runInTwoSteps
   * @return runInTwoSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZodiacRunInTwoSteps getRunInTwoSteps() {
    return runInTwoSteps;
  }


  public void setRunInTwoSteps(ZodiacRunInTwoSteps runInTwoSteps) {
    this.runInTwoSteps = runInTwoSteps;
  }


  public Zodiac edgeFilterThresholds(ZodiacEdgeFilterThresholds edgeFilterThresholds) {
    
    this.edgeFilterThresholds = edgeFilterThresholds;
    return this;
  }

   /**
   * Get edgeFilterThresholds
   * @return edgeFilterThresholds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZodiacEdgeFilterThresholds getEdgeFilterThresholds() {
    return edgeFilterThresholds;
  }


  public void setEdgeFilterThresholds(ZodiacEdgeFilterThresholds edgeFilterThresholds) {
    this.edgeFilterThresholds = edgeFilterThresholds;
  }


  public Zodiac gibbsSamplerParameters(ZodiacEpochs gibbsSamplerParameters) {
    
    this.gibbsSamplerParameters = gibbsSamplerParameters;
    return this;
  }

   /**
   * Get gibbsSamplerParameters
   * @return gibbsSamplerParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZodiacEpochs getGibbsSamplerParameters() {
    return gibbsSamplerParameters;
  }


  public void setGibbsSamplerParameters(ZodiacEpochs gibbsSamplerParameters) {
    this.gibbsSamplerParameters = gibbsSamplerParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zodiac zodiac = (Zodiac) o;
    return Objects.equals(this.enabled, zodiac.enabled) &&
        Objects.equals(this.consideredCandidatesAt300Mz, zodiac.consideredCandidatesAt300Mz) &&
        Objects.equals(this.consideredCandidatesAt800Mz, zodiac.consideredCandidatesAt800Mz) &&
        Objects.equals(this.runInTwoSteps, zodiac.runInTwoSteps) &&
        Objects.equals(this.edgeFilterThresholds, zodiac.edgeFilterThresholds) &&
        Objects.equals(this.gibbsSamplerParameters, zodiac.gibbsSamplerParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, consideredCandidatesAt300Mz, consideredCandidatesAt800Mz, runInTwoSteps, edgeFilterThresholds, gibbsSamplerParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zodiac {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    consideredCandidatesAt300Mz: ").append(toIndentedString(consideredCandidatesAt300Mz)).append("\n");
    sb.append("    consideredCandidatesAt800Mz: ").append(toIndentedString(consideredCandidatesAt800Mz)).append("\n");
    sb.append("    runInTwoSteps: ").append(toIndentedString(runInTwoSteps)).append("\n");
    sb.append("    edgeFilterThresholds: ").append(toIndentedString(edgeFilterThresholds)).append("\n");
    sb.append("    gibbsSamplerParameters: ").append(toIndentedString(gibbsSamplerParameters)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("consideredCandidatesAt300Mz");
    openapiFields.add("consideredCandidatesAt800Mz");
    openapiFields.add("runInTwoSteps");
    openapiFields.add("edgeFilterThresholds");
    openapiFields.add("gibbsSamplerParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Zodiac
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Zodiac.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Zodiac is not found in the empty JSON string", Zodiac.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Zodiac.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Zodiac` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `consideredCandidatesAt300Mz`
      if (jsonObj.get("consideredCandidatesAt300Mz") != null && !jsonObj.get("consideredCandidatesAt300Mz").isJsonNull()) {
        ZodiacNumberOfConsideredCandidatesAt300Mz.validateJsonObject(jsonObj.getAsJsonObject("consideredCandidatesAt300Mz"));
      }
      // validate the optional field `consideredCandidatesAt800Mz`
      if (jsonObj.get("consideredCandidatesAt800Mz") != null && !jsonObj.get("consideredCandidatesAt800Mz").isJsonNull()) {
        ZodiacNumberOfConsideredCandidatesAt800Mz.validateJsonObject(jsonObj.getAsJsonObject("consideredCandidatesAt800Mz"));
      }
      // validate the optional field `runInTwoSteps`
      if (jsonObj.get("runInTwoSteps") != null && !jsonObj.get("runInTwoSteps").isJsonNull()) {
        ZodiacRunInTwoSteps.validateJsonObject(jsonObj.getAsJsonObject("runInTwoSteps"));
      }
      // validate the optional field `edgeFilterThresholds`
      if (jsonObj.get("edgeFilterThresholds") != null && !jsonObj.get("edgeFilterThresholds").isJsonNull()) {
        ZodiacEdgeFilterThresholds.validateJsonObject(jsonObj.getAsJsonObject("edgeFilterThresholds"));
      }
      // validate the optional field `gibbsSamplerParameters`
      if (jsonObj.get("gibbsSamplerParameters") != null && !jsonObj.get("gibbsSamplerParameters").isJsonNull()) {
        ZodiacEpochs.validateJsonObject(jsonObj.getAsJsonObject("gibbsSamplerParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Zodiac.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Zodiac' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Zodiac> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Zodiac.class));

       return (TypeAdapter<T>) new TypeAdapter<Zodiac>() {
           @Override
           public void write(JsonWriter out, Zodiac value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Zodiac read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Zodiac given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Zodiac
  * @throws IOException if the JSON string is invalid with respect to Zodiac
  */
  public static Zodiac fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Zodiac.class);
  }

 /**
  * Convert an instance of Zodiac to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

