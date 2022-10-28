/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.DBLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * StructureCandidate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-28T16:49:53.971718Z[Etc/UTC]")
public class StructureCandidate {
  @SerializedName("structureName")
  private String structureName = null;

  @SerializedName("smiles")
  private String smiles = null;

  @SerializedName("csiScore")
  private Double csiScore = null;

  @SerializedName("tanimotoSimilarity")
  private Double tanimotoSimilarity = null;

  @SerializedName("confidenceScore")
  private Double confidenceScore = null;

  @SerializedName("numOfPubMedIds")
  private Integer numOfPubMedIds = null;

  @SerializedName("xlogP")
  private Double xlogP = null;

  @SerializedName("inchiKey")
  private String inchiKey = null;

  @SerializedName("fpBitsSet")
  private List<Integer> fpBitsSet = null;

  @SerializedName("dbLinks")
  private List<DBLink> dbLinks = null;

  @SerializedName("pubmedIds")
  private List<Integer> pubmedIds = null;

  public StructureCandidate structureName(String structureName) {
    this.structureName = structureName;
    return this;
  }

   /**
   * Get structureName
   * @return structureName
  **/
  @Schema(description = "")
  public String getStructureName() {
    return structureName;
  }

  public void setStructureName(String structureName) {
    this.structureName = structureName;
  }

  public StructureCandidate smiles(String smiles) {
    this.smiles = smiles;
    return this;
  }

   /**
   * Get smiles
   * @return smiles
  **/
  @Schema(description = "")
  public String getSmiles() {
    return smiles;
  }

  public void setSmiles(String smiles) {
    this.smiles = smiles;
  }

  public StructureCandidate csiScore(Double csiScore) {
    this.csiScore = csiScore;
    return this;
  }

   /**
   * Get csiScore
   * @return csiScore
  **/
  @Schema(description = "")
  public Double getCsiScore() {
    return csiScore;
  }

  public void setCsiScore(Double csiScore) {
    this.csiScore = csiScore;
  }

  public StructureCandidate tanimotoSimilarity(Double tanimotoSimilarity) {
    this.tanimotoSimilarity = tanimotoSimilarity;
    return this;
  }

   /**
   * Get tanimotoSimilarity
   * @return tanimotoSimilarity
  **/
  @Schema(description = "")
  public Double getTanimotoSimilarity() {
    return tanimotoSimilarity;
  }

  public void setTanimotoSimilarity(Double tanimotoSimilarity) {
    this.tanimotoSimilarity = tanimotoSimilarity;
  }

  public StructureCandidate confidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * Get confidenceScore
   * @return confidenceScore
  **/
  @Schema(description = "")
  public Double getConfidenceScore() {
    return confidenceScore;
  }

  public void setConfidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public StructureCandidate numOfPubMedIds(Integer numOfPubMedIds) {
    this.numOfPubMedIds = numOfPubMedIds;
    return this;
  }

   /**
   * Get numOfPubMedIds
   * @return numOfPubMedIds
  **/
  @Schema(description = "")
  public Integer getNumOfPubMedIds() {
    return numOfPubMedIds;
  }

  public void setNumOfPubMedIds(Integer numOfPubMedIds) {
    this.numOfPubMedIds = numOfPubMedIds;
  }

  public StructureCandidate xlogP(Double xlogP) {
    this.xlogP = xlogP;
    return this;
  }

   /**
   * Get xlogP
   * @return xlogP
  **/
  @Schema(description = "")
  public Double getXlogP() {
    return xlogP;
  }

  public void setXlogP(Double xlogP) {
    this.xlogP = xlogP;
  }

  public StructureCandidate inchiKey(String inchiKey) {
    this.inchiKey = inchiKey;
    return this;
  }

   /**
   * Get inchiKey
   * @return inchiKey
  **/
  @Schema(description = "")
  public String getInchiKey() {
    return inchiKey;
  }

  public void setInchiKey(String inchiKey) {
    this.inchiKey = inchiKey;
  }

  public StructureCandidate fpBitsSet(List<Integer> fpBitsSet) {
    this.fpBitsSet = fpBitsSet;
    return this;
  }

  public StructureCandidate addFpBitsSetItem(Integer fpBitsSetItem) {
    if (this.fpBitsSet == null) {
      this.fpBitsSet = new ArrayList<Integer>();
    }
    this.fpBitsSet.add(fpBitsSetItem);
    return this;
  }

   /**
   * Array containing the indices of the molecular fingerprint that are available in the structure (1)  OPTIONAL: needs to be added by parameter
   * @return fpBitsSet
  **/
  @Schema(description = "Array containing the indices of the molecular fingerprint that are available in the structure (1)  OPTIONAL: needs to be added by parameter")
  public List<Integer> getFpBitsSet() {
    return fpBitsSet;
  }

  public void setFpBitsSet(List<Integer> fpBitsSet) {
    this.fpBitsSet = fpBitsSet;
  }

  public StructureCandidate dbLinks(List<DBLink> dbLinks) {
    this.dbLinks = dbLinks;
    return this;
  }

  public StructureCandidate addDbLinksItem(DBLink dbLinksItem) {
    if (this.dbLinks == null) {
      this.dbLinks = new ArrayList<DBLink>();
    }
    this.dbLinks.add(dbLinksItem);
    return this;
  }

   /**
   * List of structure database links belonging to this structure candidate  OPTIONAL: needs to be added by parameter
   * @return dbLinks
  **/
  @Schema(description = "List of structure database links belonging to this structure candidate  OPTIONAL: needs to be added by parameter")
  public List<DBLink> getDbLinks() {
    return dbLinks;
  }

  public void setDbLinks(List<DBLink> dbLinks) {
    this.dbLinks = dbLinks;
  }

  public StructureCandidate pubmedIds(List<Integer> pubmedIds) {
    this.pubmedIds = pubmedIds;
    return this;
  }

  public StructureCandidate addPubmedIdsItem(Integer pubmedIdsItem) {
    if (this.pubmedIds == null) {
      this.pubmedIds = new ArrayList<Integer>();
    }
    this.pubmedIds.add(pubmedIdsItem);
    return this;
  }

   /**
   * PubMed IDs belonging to this structure candidate  OPTIONAL: needs to be added by parameter
   * @return pubmedIds
  **/
  @Schema(description = "PubMed IDs belonging to this structure candidate  OPTIONAL: needs to be added by parameter")
  public List<Integer> getPubmedIds() {
    return pubmedIds;
  }

  public void setPubmedIds(List<Integer> pubmedIds) {
    this.pubmedIds = pubmedIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructureCandidate structureCandidate = (StructureCandidate) o;
    return Objects.equals(this.structureName, structureCandidate.structureName) &&
        Objects.equals(this.smiles, structureCandidate.smiles) &&
        Objects.equals(this.csiScore, structureCandidate.csiScore) &&
        Objects.equals(this.tanimotoSimilarity, structureCandidate.tanimotoSimilarity) &&
        Objects.equals(this.confidenceScore, structureCandidate.confidenceScore) &&
        Objects.equals(this.numOfPubMedIds, structureCandidate.numOfPubMedIds) &&
        Objects.equals(this.xlogP, structureCandidate.xlogP) &&
        Objects.equals(this.inchiKey, structureCandidate.inchiKey) &&
        Objects.equals(this.fpBitsSet, structureCandidate.fpBitsSet) &&
        Objects.equals(this.dbLinks, structureCandidate.dbLinks) &&
        Objects.equals(this.pubmedIds, structureCandidate.pubmedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structureName, smiles, csiScore, tanimotoSimilarity, confidenceScore, numOfPubMedIds, xlogP, inchiKey, fpBitsSet, dbLinks, pubmedIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructureCandidate {\n");
    
    sb.append("    structureName: ").append(toIndentedString(structureName)).append("\n");
    sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
    sb.append("    csiScore: ").append(toIndentedString(csiScore)).append("\n");
    sb.append("    tanimotoSimilarity: ").append(toIndentedString(tanimotoSimilarity)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    numOfPubMedIds: ").append(toIndentedString(numOfPubMedIds)).append("\n");
    sb.append("    xlogP: ").append(toIndentedString(xlogP)).append("\n");
    sb.append("    inchiKey: ").append(toIndentedString(inchiKey)).append("\n");
    sb.append("    fpBitsSet: ").append(toIndentedString(fpBitsSet)).append("\n");
    sb.append("    dbLinks: ").append(toIndentedString(dbLinks)).append("\n");
    sb.append("    pubmedIds: ").append(toIndentedString(pubmedIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
