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
import JSirius.model.Timeout;
import JSirius.model.UseHeuristic;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * User/developer friendly parameter subset for the Formula/SIRIUS tool
 */
@ApiModel(description = "User/developer friendly parameter subset for the Formula/SIRIUS tool")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T10:27:24.207994Z[Etc/UTC]")
public class Sirius {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  /**
   * Instrument specific profile for internal algorithms  Just select what comes closest to the instrument that was used for measuring the data.
   */
  @JsonAdapter(ProfileEnum.Adapter.class)
  public enum ProfileEnum {
    QTOF("QTOF"),
    
    ORBI("ORBI"),
    
    FTICR("FTICR");

    private String value;

    ProfileEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileEnum fromValue(String value) {
      for (ProfileEnum b : ProfileEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProfileEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private ProfileEnum profile;

  public static final String SERIALIZED_NAME_NUMBER_OF_CANDIDATES = "numberOfCandidates";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_CANDIDATES)
  private Integer numberOfCandidates;

  public static final String SERIALIZED_NAME_NUMBER_OF_CANDIDATES_PER_ION = "numberOfCandidatesPerIon";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_CANDIDATES_PER_ION)
  private Integer numberOfCandidatesPerIon;

  public static final String SERIALIZED_NAME_MASS_ACCURACY_M_S2PPM = "massAccuracyMS2ppm";
  @SerializedName(SERIALIZED_NAME_MASS_ACCURACY_M_S2PPM)
  private Double massAccuracyMS2ppm;

  /**
   * Specify how isotope patterns in MS/MS should be handled.  &lt;p&gt;  FILTER: When filtering is enabled, molecular formulas are excluded if their  theoretical isotope pattern does not match the theoretical one, even if their MS/MS pattern has high score.  &lt;p&gt;  SCORE: Use them for SCORING. To use this the instrument should produce clear MS/MS isotope patterns  &lt;p&gt;  IGNORE: Ignore that there might be isotope patterns in MS/MS
   */
  @JsonAdapter(IsotopeMs2SettingsEnum.Adapter.class)
  public enum IsotopeMs2SettingsEnum {
    IGNORE("IGNORE"),
    
    FILTER("FILTER"),
    
    SCORE("SCORE");

    private String value;

    IsotopeMs2SettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsotopeMs2SettingsEnum fromValue(String value) {
      for (IsotopeMs2SettingsEnum b : IsotopeMs2SettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsotopeMs2SettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsotopeMs2SettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsotopeMs2SettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsotopeMs2SettingsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ISOTOPE_MS2_SETTINGS = "isotopeMs2Settings";
  @SerializedName(SERIALIZED_NAME_ISOTOPE_MS2_SETTINGS)
  private IsotopeMs2SettingsEnum isotopeMs2Settings;

  /**
   * Gets or Sets formulaSearchDBs
   */
  @JsonAdapter(FormulaSearchDBsEnum.Adapter.class)
  public enum FormulaSearchDBsEnum {
    ALL("ALL"),
    
    ALL_BUT_INSILICO("ALL_BUT_INSILICO"),
    
    PUBCHEM("PUBCHEM"),
    
    MESH("MESH"),
    
    HMDB("HMDB"),
    
    KNAPSACK("KNAPSACK"),
    
    CHEBI("CHEBI"),
    
    PUBMED("PUBMED"),
    
    BIO("BIO"),
    
    KEGG("KEGG"),
    
    HSDB("HSDB"),
    
    MACONDA("MACONDA"),
    
    METACYC("METACYC"),
    
    GNPS("GNPS"),
    
    ZINCBIO("ZINCBIO"),
    
    TRAIN("TRAIN"),
    
    UNDP("UNDP"),
    
    YMDB("YMDB"),
    
    PLANTCYC("PLANTCYC"),
    
    NORMAN("NORMAN"),
    
    ADDITIONAL("ADDITIONAL"),
    
    SUPERNATURAL("SUPERNATURAL"),
    
    COCONUT("COCONUT"),
    
    PUBCHEMANNOTATIONBIO("PUBCHEMANNOTATIONBIO"),
    
    PUBCHEMANNOTATIONDRUG("PUBCHEMANNOTATIONDRUG"),
    
    PUBCHEMANNOTATIONSAFETYANDTOXIC("PUBCHEMANNOTATIONSAFETYANDTOXIC"),
    
    PUBCHEMANNOTATIONFOOD("PUBCHEMANNOTATIONFOOD"),
    
    LIPID("LIPID"),
    
    KEGGMINE("KEGGMINE"),
    
    ECOCYCMINE("ECOCYCMINE"),
    
    YMDBMINE("YMDBMINE");

    private String value;

    FormulaSearchDBsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormulaSearchDBsEnum fromValue(String value) {
      for (FormulaSearchDBsEnum b : FormulaSearchDBsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormulaSearchDBsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormulaSearchDBsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormulaSearchDBsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormulaSearchDBsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMULA_SEARCH_D_BS = "formulaSearchDBs";
  @SerializedName(SERIALIZED_NAME_FORMULA_SEARCH_D_BS)
  private List<FormulaSearchDBsEnum> formulaSearchDBs = null;

  public static final String SERIALIZED_NAME_ENFORCED_FORMULA_CONSTRAINTS = "enforcedFormulaConstraints";
  @SerializedName(SERIALIZED_NAME_ENFORCED_FORMULA_CONSTRAINTS)
  private String enforcedFormulaConstraints;

  public static final String SERIALIZED_NAME_FALLBACK_FORMULA_CONSTRAINTS = "fallbackFormulaConstraints";
  @SerializedName(SERIALIZED_NAME_FALLBACK_FORMULA_CONSTRAINTS)
  private String fallbackFormulaConstraints;

  public static final String SERIALIZED_NAME_DETECTABLE_ELEMENTS = "detectableElements";
  @SerializedName(SERIALIZED_NAME_DETECTABLE_ELEMENTS)
  private List<String> detectableElements = null;

  public static final String SERIALIZED_NAME_ILP_TIMEOUT = "ilpTimeout";
  @SerializedName(SERIALIZED_NAME_ILP_TIMEOUT)
  private Timeout ilpTimeout;

  public static final String SERIALIZED_NAME_USE_HEURISTIC = "useHeuristic";
  @SerializedName(SERIALIZED_NAME_USE_HEURISTIC)
  private UseHeuristic useHeuristic;

  public Sirius() {
  }

  public Sirius enabled(Boolean enabled) {
    
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


  public Sirius profile(ProfileEnum profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Instrument specific profile for internal algorithms  Just select what comes closest to the instrument that was used for measuring the data.
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instrument specific profile for internal algorithms  Just select what comes closest to the instrument that was used for measuring the data.")

  public ProfileEnum getProfile() {
    return profile;
  }


  public void setProfile(ProfileEnum profile) {
    this.profile = profile;
  }


  public Sirius numberOfCandidates(Integer numberOfCandidates) {
    
    this.numberOfCandidates = numberOfCandidates;
    return this;
  }

   /**
   * Number of formula candidates to keep as result list (Formula Candidates).
   * @return numberOfCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of formula candidates to keep as result list (Formula Candidates).")

  public Integer getNumberOfCandidates() {
    return numberOfCandidates;
  }


  public void setNumberOfCandidates(Integer numberOfCandidates) {
    this.numberOfCandidates = numberOfCandidates;
  }


  public Sirius numberOfCandidatesPerIon(Integer numberOfCandidatesPerIon) {
    
    this.numberOfCandidatesPerIon = numberOfCandidatesPerIon;
    return this;
  }

   /**
   * Use this parameter if you want to force SIRIUS to report at least  NumberOfCandidatesPerIon results per ionization.  if &lt;&#x3D; 0, this parameter will have no effect and just the top  NumberOfCandidates results will be reported.
   * @return numberOfCandidatesPerIon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use this parameter if you want to force SIRIUS to report at least  NumberOfCandidatesPerIon results per ionization.  if <= 0, this parameter will have no effect and just the top  NumberOfCandidates results will be reported.")

  public Integer getNumberOfCandidatesPerIon() {
    return numberOfCandidatesPerIon;
  }


  public void setNumberOfCandidatesPerIon(Integer numberOfCandidatesPerIon) {
    this.numberOfCandidatesPerIon = numberOfCandidatesPerIon;
  }


  public Sirius massAccuracyMS2ppm(Double massAccuracyMS2ppm) {
    
    this.massAccuracyMS2ppm = massAccuracyMS2ppm;
    return this;
  }

   /**
   * Maximum allowed mass accuracy. Only molecular formulas within this mass window are considered.
   * @return massAccuracyMS2ppm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum allowed mass accuracy. Only molecular formulas within this mass window are considered.")

  public Double getMassAccuracyMS2ppm() {
    return massAccuracyMS2ppm;
  }


  public void setMassAccuracyMS2ppm(Double massAccuracyMS2ppm) {
    this.massAccuracyMS2ppm = massAccuracyMS2ppm;
  }


  public Sirius isotopeMs2Settings(IsotopeMs2SettingsEnum isotopeMs2Settings) {
    
    this.isotopeMs2Settings = isotopeMs2Settings;
    return this;
  }

   /**
   * Specify how isotope patterns in MS/MS should be handled.  &lt;p&gt;  FILTER: When filtering is enabled, molecular formulas are excluded if their  theoretical isotope pattern does not match the theoretical one, even if their MS/MS pattern has high score.  &lt;p&gt;  SCORE: Use them for SCORING. To use this the instrument should produce clear MS/MS isotope patterns  &lt;p&gt;  IGNORE: Ignore that there might be isotope patterns in MS/MS
   * @return isotopeMs2Settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify how isotope patterns in MS/MS should be handled.  <p>  FILTER: When filtering is enabled, molecular formulas are excluded if their  theoretical isotope pattern does not match the theoretical one, even if their MS/MS pattern has high score.  <p>  SCORE: Use them for SCORING. To use this the instrument should produce clear MS/MS isotope patterns  <p>  IGNORE: Ignore that there might be isotope patterns in MS/MS")

  public IsotopeMs2SettingsEnum getIsotopeMs2Settings() {
    return isotopeMs2Settings;
  }


  public void setIsotopeMs2Settings(IsotopeMs2SettingsEnum isotopeMs2Settings) {
    this.isotopeMs2Settings = isotopeMs2Settings;
  }


  public Sirius formulaSearchDBs(List<FormulaSearchDBsEnum> formulaSearchDBs) {
    
    this.formulaSearchDBs = formulaSearchDBs;
    return this;
  }

  public Sirius addFormulaSearchDBsItem(FormulaSearchDBsEnum formulaSearchDBsItem) {
    if (this.formulaSearchDBs == null) {
      this.formulaSearchDBs = new ArrayList<>();
    }
    this.formulaSearchDBs.add(formulaSearchDBsItem);
    return this;
  }

   /**
   * List Structure database to extract molecular formulas from to reduce formula search space.  SIRIUS is quite good at de novo formula annotation, so only enable if you have a good reason.
   * @return formulaSearchDBs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List Structure database to extract molecular formulas from to reduce formula search space.  SIRIUS is quite good at de novo formula annotation, so only enable if you have a good reason.")

  public List<FormulaSearchDBsEnum> getFormulaSearchDBs() {
    return formulaSearchDBs;
  }


  public void setFormulaSearchDBs(List<FormulaSearchDBsEnum> formulaSearchDBs) {
    this.formulaSearchDBs = formulaSearchDBs;
  }


  public Sirius enforcedFormulaConstraints(String enforcedFormulaConstraints) {
    
    this.enforcedFormulaConstraints = enforcedFormulaConstraints;
    return this;
  }

   /**
   * These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  &lt;p&gt;  Enforced: Enforced elements are always considered
   * @return enforcedFormulaConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Enforced: Enforced elements are always considered")

  public String getEnforcedFormulaConstraints() {
    return enforcedFormulaConstraints;
  }


  public void setEnforcedFormulaConstraints(String enforcedFormulaConstraints) {
    this.enforcedFormulaConstraints = enforcedFormulaConstraints;
  }


  public Sirius fallbackFormulaConstraints(String fallbackFormulaConstraints) {
    
    this.fallbackFormulaConstraints = fallbackFormulaConstraints;
    return this;
  }

   /**
   * These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  &lt;p&gt;  Fallback: Fallback elements are used, if the auto-detection fails (e.g. no isotope pattern available)
   * @return fallbackFormulaConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Fallback: Fallback elements are used, if the auto-detection fails (e.g. no isotope pattern available)")

  public String getFallbackFormulaConstraints() {
    return fallbackFormulaConstraints;
  }


  public void setFallbackFormulaConstraints(String fallbackFormulaConstraints) {
    this.fallbackFormulaConstraints = fallbackFormulaConstraints;
  }


  public Sirius detectableElements(List<String> detectableElements) {
    
    this.detectableElements = detectableElements;
    return this;
  }

  public Sirius addDetectableElementsItem(String detectableElementsItem) {
    if (this.detectableElements == null) {
      this.detectableElements = new ArrayList<>();
    }
    this.detectableElements.add(detectableElementsItem);
    return this;
  }

   /**
   * These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  &lt;p&gt;  Detectable: Detectable elements are added to the chemical alphabet, if there are indications for them (e.g. in isotope pattern)
   * @return detectableElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Detectable: Detectable elements are added to the chemical alphabet, if there are indications for them (e.g. in isotope pattern)")

  public List<String> getDetectableElements() {
    return detectableElements;
  }


  public void setDetectableElements(List<String> detectableElements) {
    this.detectableElements = detectableElements;
  }


  public Sirius ilpTimeout(Timeout ilpTimeout) {
    
    this.ilpTimeout = ilpTimeout;
    return this;
  }

   /**
   * Get ilpTimeout
   * @return ilpTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Timeout getIlpTimeout() {
    return ilpTimeout;
  }


  public void setIlpTimeout(Timeout ilpTimeout) {
    this.ilpTimeout = ilpTimeout;
  }


  public Sirius useHeuristic(UseHeuristic useHeuristic) {
    
    this.useHeuristic = useHeuristic;
    return this;
  }

   /**
   * Get useHeuristic
   * @return useHeuristic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UseHeuristic getUseHeuristic() {
    return useHeuristic;
  }


  public void setUseHeuristic(UseHeuristic useHeuristic) {
    this.useHeuristic = useHeuristic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sirius sirius = (Sirius) o;
    return Objects.equals(this.enabled, sirius.enabled) &&
        Objects.equals(this.profile, sirius.profile) &&
        Objects.equals(this.numberOfCandidates, sirius.numberOfCandidates) &&
        Objects.equals(this.numberOfCandidatesPerIon, sirius.numberOfCandidatesPerIon) &&
        Objects.equals(this.massAccuracyMS2ppm, sirius.massAccuracyMS2ppm) &&
        Objects.equals(this.isotopeMs2Settings, sirius.isotopeMs2Settings) &&
        Objects.equals(this.formulaSearchDBs, sirius.formulaSearchDBs) &&
        Objects.equals(this.enforcedFormulaConstraints, sirius.enforcedFormulaConstraints) &&
        Objects.equals(this.fallbackFormulaConstraints, sirius.fallbackFormulaConstraints) &&
        Objects.equals(this.detectableElements, sirius.detectableElements) &&
        Objects.equals(this.ilpTimeout, sirius.ilpTimeout) &&
        Objects.equals(this.useHeuristic, sirius.useHeuristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, profile, numberOfCandidates, numberOfCandidatesPerIon, massAccuracyMS2ppm, isotopeMs2Settings, formulaSearchDBs, enforcedFormulaConstraints, fallbackFormulaConstraints, detectableElements, ilpTimeout, useHeuristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sirius {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    numberOfCandidates: ").append(toIndentedString(numberOfCandidates)).append("\n");
    sb.append("    numberOfCandidatesPerIon: ").append(toIndentedString(numberOfCandidatesPerIon)).append("\n");
    sb.append("    massAccuracyMS2ppm: ").append(toIndentedString(massAccuracyMS2ppm)).append("\n");
    sb.append("    isotopeMs2Settings: ").append(toIndentedString(isotopeMs2Settings)).append("\n");
    sb.append("    formulaSearchDBs: ").append(toIndentedString(formulaSearchDBs)).append("\n");
    sb.append("    enforcedFormulaConstraints: ").append(toIndentedString(enforcedFormulaConstraints)).append("\n");
    sb.append("    fallbackFormulaConstraints: ").append(toIndentedString(fallbackFormulaConstraints)).append("\n");
    sb.append("    detectableElements: ").append(toIndentedString(detectableElements)).append("\n");
    sb.append("    ilpTimeout: ").append(toIndentedString(ilpTimeout)).append("\n");
    sb.append("    useHeuristic: ").append(toIndentedString(useHeuristic)).append("\n");
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
    openapiFields.add("profile");
    openapiFields.add("numberOfCandidates");
    openapiFields.add("numberOfCandidatesPerIon");
    openapiFields.add("massAccuracyMS2ppm");
    openapiFields.add("isotopeMs2Settings");
    openapiFields.add("formulaSearchDBs");
    openapiFields.add("enforcedFormulaConstraints");
    openapiFields.add("fallbackFormulaConstraints");
    openapiFields.add("detectableElements");
    openapiFields.add("ilpTimeout");
    openapiFields.add("useHeuristic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Sirius
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Sirius.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sirius is not found in the empty JSON string", Sirius.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Sirius.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Sirius` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
      if ((jsonObj.get("isotopeMs2Settings") != null && !jsonObj.get("isotopeMs2Settings").isJsonNull()) && !jsonObj.get("isotopeMs2Settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isotopeMs2Settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isotopeMs2Settings").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("formulaSearchDBs") != null && !jsonObj.get("formulaSearchDBs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formulaSearchDBs` to be an array in the JSON string but got `%s`", jsonObj.get("formulaSearchDBs").toString()));
      }
      if ((jsonObj.get("enforcedFormulaConstraints") != null && !jsonObj.get("enforcedFormulaConstraints").isJsonNull()) && !jsonObj.get("enforcedFormulaConstraints").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enforcedFormulaConstraints` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enforcedFormulaConstraints").toString()));
      }
      if ((jsonObj.get("fallbackFormulaConstraints") != null && !jsonObj.get("fallbackFormulaConstraints").isJsonNull()) && !jsonObj.get("fallbackFormulaConstraints").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackFormulaConstraints` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackFormulaConstraints").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("detectableElements") != null && !jsonObj.get("detectableElements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectableElements` to be an array in the JSON string but got `%s`", jsonObj.get("detectableElements").toString()));
      }
      // validate the optional field `ilpTimeout`
      if (jsonObj.get("ilpTimeout") != null && !jsonObj.get("ilpTimeout").isJsonNull()) {
        Timeout.validateJsonObject(jsonObj.getAsJsonObject("ilpTimeout"));
      }
      // validate the optional field `useHeuristic`
      if (jsonObj.get("useHeuristic") != null && !jsonObj.get("useHeuristic").isJsonNull()) {
        UseHeuristic.validateJsonObject(jsonObj.getAsJsonObject("useHeuristic"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Sirius.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sirius' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sirius> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sirius.class));

       return (TypeAdapter<T>) new TypeAdapter<Sirius>() {
           @Override
           public void write(JsonWriter out, Sirius value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Sirius read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Sirius given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Sirius
  * @throws IOException if the JSON string is invalid with respect to Sirius
  */
  public static Sirius fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sirius.class);
  }

 /**
  * Convert an instance of Sirius to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

