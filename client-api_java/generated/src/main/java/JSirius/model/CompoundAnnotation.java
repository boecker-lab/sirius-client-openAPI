/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 5.6.3-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.CompoundClasses;
import JSirius.model.FormulaCandidate;
import JSirius.model.StructureCandidate;
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
 * Summary of the results of a Compound. Can be added to a CompoundId.  It is not null within a CompoundId if it was not requested und non null otherwise  The different summary fields within this summary are null if the corresponding  compound does not contain the represented results. The content of  non NULL  summary field id the result was computed but is empty.
 */
@ApiModel(description = "Summary of the results of a Compound. Can be added to a CompoundId.  It is not null within a CompoundId if it was not requested und non null otherwise  The different summary fields within this summary are null if the corresponding  compound does not contain the represented results. The content of  non NULL  summary field id the result was computed but is empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T10:27:24.207994Z[Etc/UTC]")
public class CompoundAnnotation {
  public static final String SERIALIZED_NAME_FORMULA_ANNOTATION = "formulaAnnotation";
  @SerializedName(SERIALIZED_NAME_FORMULA_ANNOTATION)
  private FormulaCandidate formulaAnnotation;

  public static final String SERIALIZED_NAME_STRUCTURE_ANNOTATION = "structureAnnotation";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_ANNOTATION)
  private StructureCandidate structureAnnotation;

  public static final String SERIALIZED_NAME_COMPOUND_CLASS_ANNOTATION = "compoundClassAnnotation";
  @SerializedName(SERIALIZED_NAME_COMPOUND_CLASS_ANNOTATION)
  private CompoundClasses compoundClassAnnotation;

  public CompoundAnnotation() {
  }

  public CompoundAnnotation formulaAnnotation(FormulaCandidate formulaAnnotation) {
    
    this.formulaAnnotation = formulaAnnotation;
    return this;
  }

   /**
   * Get formulaAnnotation
   * @return formulaAnnotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormulaCandidate getFormulaAnnotation() {
    return formulaAnnotation;
  }


  public void setFormulaAnnotation(FormulaCandidate formulaAnnotation) {
    this.formulaAnnotation = formulaAnnotation;
  }


  public CompoundAnnotation structureAnnotation(StructureCandidate structureAnnotation) {
    
    this.structureAnnotation = structureAnnotation;
    return this;
  }

   /**
   * Get structureAnnotation
   * @return structureAnnotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StructureCandidate getStructureAnnotation() {
    return structureAnnotation;
  }


  public void setStructureAnnotation(StructureCandidate structureAnnotation) {
    this.structureAnnotation = structureAnnotation;
  }


  public CompoundAnnotation compoundClassAnnotation(CompoundClasses compoundClassAnnotation) {
    
    this.compoundClassAnnotation = compoundClassAnnotation;
    return this;
  }

   /**
   * Get compoundClassAnnotation
   * @return compoundClassAnnotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompoundClasses getCompoundClassAnnotation() {
    return compoundClassAnnotation;
  }


  public void setCompoundClassAnnotation(CompoundClasses compoundClassAnnotation) {
    this.compoundClassAnnotation = compoundClassAnnotation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundAnnotation compoundAnnotation = (CompoundAnnotation) o;
    return Objects.equals(this.formulaAnnotation, compoundAnnotation.formulaAnnotation) &&
        Objects.equals(this.structureAnnotation, compoundAnnotation.structureAnnotation) &&
        Objects.equals(this.compoundClassAnnotation, compoundAnnotation.compoundClassAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulaAnnotation, structureAnnotation, compoundClassAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundAnnotation {\n");
    sb.append("    formulaAnnotation: ").append(toIndentedString(formulaAnnotation)).append("\n");
    sb.append("    structureAnnotation: ").append(toIndentedString(structureAnnotation)).append("\n");
    sb.append("    compoundClassAnnotation: ").append(toIndentedString(compoundClassAnnotation)).append("\n");
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
    openapiFields.add("formulaAnnotation");
    openapiFields.add("structureAnnotation");
    openapiFields.add("compoundClassAnnotation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompoundAnnotation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompoundAnnotation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompoundAnnotation is not found in the empty JSON string", CompoundAnnotation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CompoundAnnotation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompoundAnnotation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `formulaAnnotation`
      if (jsonObj.get("formulaAnnotation") != null && !jsonObj.get("formulaAnnotation").isJsonNull()) {
        FormulaCandidate.validateJsonObject(jsonObj.getAsJsonObject("formulaAnnotation"));
      }
      // validate the optional field `structureAnnotation`
      if (jsonObj.get("structureAnnotation") != null && !jsonObj.get("structureAnnotation").isJsonNull()) {
        StructureCandidate.validateJsonObject(jsonObj.getAsJsonObject("structureAnnotation"));
      }
      // validate the optional field `compoundClassAnnotation`
      if (jsonObj.get("compoundClassAnnotation") != null && !jsonObj.get("compoundClassAnnotation").isJsonNull()) {
        CompoundClasses.validateJsonObject(jsonObj.getAsJsonObject("compoundClassAnnotation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompoundAnnotation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompoundAnnotation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompoundAnnotation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompoundAnnotation.class));

       return (TypeAdapter<T>) new TypeAdapter<CompoundAnnotation>() {
           @Override
           public void write(JsonWriter out, CompoundAnnotation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompoundAnnotation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompoundAnnotation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompoundAnnotation
  * @throws IOException if the JSON string is invalid with respect to CompoundAnnotation
  */
  public static CompoundAnnotation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompoundAnnotation.class);
  }

 /**
  * Convert an instance of CompoundAnnotation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

