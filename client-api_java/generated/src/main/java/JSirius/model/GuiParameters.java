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
 * Parameters to \&quot;remote control\&quot; the SIRIUS GUI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuiParameters {
  /**
   * Selected Result ab.
   */
  @JsonAdapter(SelectedTabEnum.Adapter.class)
  public enum SelectedTabEnum {
    FORMULAS("FORMULAS"),
    
    SPECTRA("SPECTRA"),
    
    TREES("TREES"),
    
    PREDICTED_FINGERPRINT("PREDICTED_FINGERPRINT"),
    
    STRUCTURES("STRUCTURES"),
    
    STRUCTURE_ANNOTATION("STRUCTURE_ANNOTATION"),
    
    COMPOUND_CLASSES("COMPOUND_CLASSES");

    private String value;

    SelectedTabEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedTabEnum fromValue(String value) {
      for (SelectedTabEnum b : SelectedTabEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedTabEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedTabEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedTabEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedTabEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SELECTED_TAB = "selectedTab";
  @SerializedName(SERIALIZED_NAME_SELECTED_TAB)
  private SelectedTabEnum selectedTab;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public static final String SERIALIZED_NAME_FID = "fid";
  @SerializedName(SERIALIZED_NAME_FID)
  private String fid;

  public static final String SERIALIZED_NAME_STRUCTURE_CANDIDATE_IN_CH_I_KEY = "structureCandidateInChIKey";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_CANDIDATE_IN_CH_I_KEY)
  private String structureCandidateInChIKey;

  public static final String SERIALIZED_NAME_BRING_TO_FRONT = "bringToFront";
  @SerializedName(SERIALIZED_NAME_BRING_TO_FRONT)
  private Boolean bringToFront;

  public GuiParameters() {
  }

  public GuiParameters selectedTab(SelectedTabEnum selectedTab) {
    
    this.selectedTab = selectedTab;
    return this;
  }

   /**
   * Selected Result ab.
   * @return selectedTab
  **/
  @javax.annotation.Nullable

  public SelectedTabEnum getSelectedTab() {
    return selectedTab;
  }


  public void setSelectedTab(SelectedTabEnum selectedTab) {
    this.selectedTab = selectedTab;
  }


  public GuiParameters cid(String cid) {
    
    this.cid = cid;
    return this;
  }

   /**
   * ID of Selected compound.
   * @return cid
  **/
  @javax.annotation.Nullable

  public String getCid() {
    return cid;
  }


  public void setCid(String cid) {
    this.cid = cid;
  }


  public GuiParameters fid(String fid) {
    
    this.fid = fid;
    return this;
  }

   /**
   * ID of Selected Formula candidate of the selected compound.
   * @return fid
  **/
  @javax.annotation.Nullable

  public String getFid() {
    return fid;
  }


  public void setFid(String fid) {
    this.fid = fid;
  }


  public GuiParameters structureCandidateInChIKey(String structureCandidateInChIKey) {
    
    this.structureCandidateInChIKey = structureCandidateInChIKey;
    return this;
  }

   /**
   * InChIKey of selected structure candidate of selected formula candidate.
   * @return structureCandidateInChIKey
  **/
  @javax.annotation.Nullable

  public String getStructureCandidateInChIKey() {
    return structureCandidateInChIKey;
  }


  public void setStructureCandidateInChIKey(String structureCandidateInChIKey) {
    this.structureCandidateInChIKey = structureCandidateInChIKey;
  }


  public GuiParameters bringToFront(Boolean bringToFront) {
    
    this.bringToFront = bringToFront;
    return this;
  }

   /**
   * If true bring SIRIUS GUI window to foreground.
   * @return bringToFront
  **/
  @javax.annotation.Nullable

  public Boolean getBringToFront() {
    return bringToFront;
  }


  public void setBringToFront(Boolean bringToFront) {
    this.bringToFront = bringToFront;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuiParameters guiParameters = (GuiParameters) o;
    return Objects.equals(this.selectedTab, guiParameters.selectedTab) &&
        Objects.equals(this.cid, guiParameters.cid) &&
        Objects.equals(this.fid, guiParameters.fid) &&
        Objects.equals(this.structureCandidateInChIKey, guiParameters.structureCandidateInChIKey) &&
        Objects.equals(this.bringToFront, guiParameters.bringToFront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedTab, cid, fid, structureCandidateInChIKey, bringToFront);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuiParameters {\n");
    sb.append("    selectedTab: ").append(toIndentedString(selectedTab)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    structureCandidateInChIKey: ").append(toIndentedString(structureCandidateInChIKey)).append("\n");
    sb.append("    bringToFront: ").append(toIndentedString(bringToFront)).append("\n");
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
    openapiFields.add("selectedTab");
    openapiFields.add("cid");
    openapiFields.add("fid");
    openapiFields.add("structureCandidateInChIKey");
    openapiFields.add("bringToFront");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GuiParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GuiParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuiParameters is not found in the empty JSON string", GuiParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GuiParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuiParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("selectedTab") != null && !jsonObj.get("selectedTab").isJsonNull()) && !jsonObj.get("selectedTab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedTab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedTab").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
      if ((jsonObj.get("fid") != null && !jsonObj.get("fid").isJsonNull()) && !jsonObj.get("fid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fid").toString()));
      }
      if ((jsonObj.get("structureCandidateInChIKey") != null && !jsonObj.get("structureCandidateInChIKey").isJsonNull()) && !jsonObj.get("structureCandidateInChIKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `structureCandidateInChIKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("structureCandidateInChIKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuiParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuiParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuiParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuiParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<GuiParameters>() {
           @Override
           public void write(JsonWriter out, GuiParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuiParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GuiParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GuiParameters
  * @throws IOException if the JSON string is invalid with respect to GuiParameters
  */
  public static GuiParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuiParameters.class);
  }

 /**
  * Convert an instance of GuiParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

