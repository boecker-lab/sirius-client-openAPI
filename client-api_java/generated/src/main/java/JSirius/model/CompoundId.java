/*
 * SIRIUS Nightsky API
 * OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.
 *
 * The version of the OpenAPI document: 0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.CompoundAnnotation;
import JSirius.model.MsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * The CompoundId contains the ID of a compound together with some read-only information that might be displayed in  some summary view.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompoundId {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Long index;

  public static final String SERIALIZED_NAME_ION_MASS = "ionMass";
  @SerializedName(SERIALIZED_NAME_ION_MASS)
  private Double ionMass;

  public static final String SERIALIZED_NAME_ION_TYPE = "ionType";
  @SerializedName(SERIALIZED_NAME_ION_TYPE)
  private String ionType;

  public static final String SERIALIZED_NAME_RT_START_SECONDS = "rtStartSeconds";
  @SerializedName(SERIALIZED_NAME_RT_START_SECONDS)
  private Double rtStartSeconds;

  public static final String SERIALIZED_NAME_RT_END_SECONDS = "rtEndSeconds";
  @SerializedName(SERIALIZED_NAME_RT_END_SECONDS)
  private Double rtEndSeconds;

  public static final String SERIALIZED_NAME_TOP_ANNOTATION = "topAnnotation";
  @SerializedName(SERIALIZED_NAME_TOP_ANNOTATION)
  private CompoundAnnotation topAnnotation;

  public static final String SERIALIZED_NAME_MS_DATA = "msData";
  @SerializedName(SERIALIZED_NAME_MS_DATA)
  private MsData msData;

  /**
   * Gets or Sets qualityFlags
   */
  @JsonAdapter(QualityFlagsEnum.Adapter.class)
  public enum QualityFlagsEnum {
    GOOD("Good"),
    
    LOWINTENSITY("LowIntensity"),
    
    NOMS1PEAK("NoMS1Peak"),
    
    FEWPEAKS("FewPeaks"),
    
    CHIMERIC("Chimeric"),
    
    NOTMONOISOTOPICPEAK("NotMonoisotopicPeak"),
    
    POORLYEXPLAINED("PoorlyExplained"),
    
    UNKNOWN("UNKNOWN"),
    
    BADISOTOPEPATTERN("BadIsotopePattern"),
    
    BADPEAKSHAPE("BadPeakShape");

    private String value;

    QualityFlagsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualityFlagsEnum fromValue(String value) {
      for (QualityFlagsEnum b : QualityFlagsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualityFlagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualityFlagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualityFlagsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualityFlagsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALITY_FLAGS = "qualityFlags";
  @SerializedName(SERIALIZED_NAME_QUALITY_FLAGS)
  private List<QualityFlagsEnum> qualityFlags;

  public static final String SERIALIZED_NAME_COMPUTING = "computing";
  @SerializedName(SERIALIZED_NAME_COMPUTING)
  private Boolean computing;

  public CompoundId() {
  }

  public CompoundId id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CompoundId name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CompoundId index(Long index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable

  public Long getIndex() {
    return index;
  }


  public void setIndex(Long index) {
    this.index = index;
  }


  public CompoundId ionMass(Double ionMass) {
    
    this.ionMass = ionMass;
    return this;
  }

   /**
   * Get ionMass
   * @return ionMass
  **/
  @javax.annotation.Nullable

  public Double getIonMass() {
    return ionMass;
  }


  public void setIonMass(Double ionMass) {
    this.ionMass = ionMass;
  }


  public CompoundId ionType(String ionType) {
    
    this.ionType = ionType;
    return this;
  }

   /**
   * Get ionType
   * @return ionType
  **/
  @javax.annotation.Nullable

  public String getIonType() {
    return ionType;
  }


  public void setIonType(String ionType) {
    this.ionType = ionType;
  }


  public CompoundId rtStartSeconds(Double rtStartSeconds) {
    
    this.rtStartSeconds = rtStartSeconds;
    return this;
  }

   /**
   * Get rtStartSeconds
   * @return rtStartSeconds
  **/
  @javax.annotation.Nullable

  public Double getRtStartSeconds() {
    return rtStartSeconds;
  }


  public void setRtStartSeconds(Double rtStartSeconds) {
    this.rtStartSeconds = rtStartSeconds;
  }


  public CompoundId rtEndSeconds(Double rtEndSeconds) {
    
    this.rtEndSeconds = rtEndSeconds;
    return this;
  }

   /**
   * Get rtEndSeconds
   * @return rtEndSeconds
  **/
  @javax.annotation.Nullable

  public Double getRtEndSeconds() {
    return rtEndSeconds;
  }


  public void setRtEndSeconds(Double rtEndSeconds) {
    this.rtEndSeconds = rtEndSeconds;
  }


  public CompoundId topAnnotation(CompoundAnnotation topAnnotation) {
    
    this.topAnnotation = topAnnotation;
    return this;
  }

   /**
   * Get topAnnotation
   * @return topAnnotation
  **/
  @javax.annotation.Nullable

  public CompoundAnnotation getTopAnnotation() {
    return topAnnotation;
  }


  public void setTopAnnotation(CompoundAnnotation topAnnotation) {
    this.topAnnotation = topAnnotation;
  }


  public CompoundId msData(MsData msData) {
    
    this.msData = msData;
    return this;
  }

   /**
   * Get msData
   * @return msData
  **/
  @javax.annotation.Nullable

  public MsData getMsData() {
    return msData;
  }


  public void setMsData(MsData msData) {
    this.msData = msData;
  }


  public CompoundId qualityFlags(List<QualityFlagsEnum> qualityFlags) {
    
    this.qualityFlags = qualityFlags;
    return this;
  }

  public CompoundId addQualityFlagsItem(QualityFlagsEnum qualityFlagsItem) {
    if (this.qualityFlags == null) {
      this.qualityFlags = new ArrayList<>();
    }
    this.qualityFlags.add(qualityFlagsItem);
    return this;
  }

   /**
   * Contains all pre-computation quality information that belong to  this compound, such as information about the quality of the peak shape, MS2 spectrum etc.,  see ({@link CompoundQuality.CompoundQualityFlag CompoundQuality.CompoundQualityFlag})  &lt;p&gt;  Each Compound has a Set of Quality assessment flags.
   * @return qualityFlags
  **/
  @javax.annotation.Nullable

  public List<QualityFlagsEnum> getQualityFlags() {
    return qualityFlags;
  }


  public void setQualityFlags(List<QualityFlagsEnum> qualityFlags) {
    this.qualityFlags = qualityFlags;
  }


  public CompoundId computing(Boolean computing) {
    
    this.computing = computing;
    return this;
  }

   /**
   * Get computing
   * @return computing
  **/
  @javax.annotation.Nullable

  public Boolean getComputing() {
    return computing;
  }


  public void setComputing(Boolean computing) {
    this.computing = computing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundId compoundId = (CompoundId) o;
    return Objects.equals(this.id, compoundId.id) &&
        Objects.equals(this.name, compoundId.name) &&
        Objects.equals(this.index, compoundId.index) &&
        Objects.equals(this.ionMass, compoundId.ionMass) &&
        Objects.equals(this.ionType, compoundId.ionType) &&
        Objects.equals(this.rtStartSeconds, compoundId.rtStartSeconds) &&
        Objects.equals(this.rtEndSeconds, compoundId.rtEndSeconds) &&
        Objects.equals(this.topAnnotation, compoundId.topAnnotation) &&
        Objects.equals(this.msData, compoundId.msData) &&
        Objects.equals(this.qualityFlags, compoundId.qualityFlags) &&
        Objects.equals(this.computing, compoundId.computing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, index, ionMass, ionType, rtStartSeconds, rtEndSeconds, topAnnotation, msData, qualityFlags, computing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    ionMass: ").append(toIndentedString(ionMass)).append("\n");
    sb.append("    ionType: ").append(toIndentedString(ionType)).append("\n");
    sb.append("    rtStartSeconds: ").append(toIndentedString(rtStartSeconds)).append("\n");
    sb.append("    rtEndSeconds: ").append(toIndentedString(rtEndSeconds)).append("\n");
    sb.append("    topAnnotation: ").append(toIndentedString(topAnnotation)).append("\n");
    sb.append("    msData: ").append(toIndentedString(msData)).append("\n");
    sb.append("    qualityFlags: ").append(toIndentedString(qualityFlags)).append("\n");
    sb.append("    computing: ").append(toIndentedString(computing)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("index");
    openapiFields.add("ionMass");
    openapiFields.add("ionType");
    openapiFields.add("rtStartSeconds");
    openapiFields.add("rtEndSeconds");
    openapiFields.add("topAnnotation");
    openapiFields.add("msData");
    openapiFields.add("qualityFlags");
    openapiFields.add("computing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompoundId
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompoundId.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompoundId is not found in the empty JSON string", CompoundId.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CompoundId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompoundId` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ionType") != null && !jsonObj.get("ionType").isJsonNull()) && !jsonObj.get("ionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ionType").toString()));
      }
      // validate the optional field `topAnnotation`
      if (jsonObj.get("topAnnotation") != null && !jsonObj.get("topAnnotation").isJsonNull()) {
        CompoundAnnotation.validateJsonObject(jsonObj.getAsJsonObject("topAnnotation"));
      }
      // validate the optional field `msData`
      if (jsonObj.get("msData") != null && !jsonObj.get("msData").isJsonNull()) {
        MsData.validateJsonObject(jsonObj.getAsJsonObject("msData"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("qualityFlags") != null && !jsonObj.get("qualityFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualityFlags` to be an array in the JSON string but got `%s`", jsonObj.get("qualityFlags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompoundId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompoundId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompoundId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompoundId.class));

       return (TypeAdapter<T>) new TypeAdapter<CompoundId>() {
           @Override
           public void write(JsonWriter out, CompoundId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompoundId read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompoundId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompoundId
  * @throws IOException if the JSON string is invalid with respect to CompoundId
  */
  public static CompoundId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompoundId.class);
  }

 /**
  * Convert an instance of CompoundId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

