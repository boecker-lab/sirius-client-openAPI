/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.FragmentNode;
import JSirius.model.LossEdge;
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
 * FragmentationTree
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T15:31:49.516631200+02:00[Europe/Berlin]")
public class FragmentationTree {
  @SerializedName("fragments")
  private List<FragmentNode> fragments = null;

  @SerializedName("losses")
  private List<LossEdge> losses = null;

  @SerializedName("treeScore")
  private Double treeScore = null;

  @SerializedName("root")
  private FragmentNode root = null;

  public FragmentationTree fragments(List<FragmentNode> fragments) {
    this.fragments = fragments;
    return this;
  }

  public FragmentationTree addFragmentsItem(FragmentNode fragmentsItem) {
    if (this.fragments == null) {
      this.fragments = new ArrayList<FragmentNode>();
    }
    this.fragments.add(fragmentsItem);
    return this;
  }

   /**
   * Get fragments
   * @return fragments
  **/
  @Schema(description = "")
  public List<FragmentNode> getFragments() {
    return fragments;
  }

  public void setFragments(List<FragmentNode> fragments) {
    this.fragments = fragments;
  }

  public FragmentationTree losses(List<LossEdge> losses) {
    this.losses = losses;
    return this;
  }

  public FragmentationTree addLossesItem(LossEdge lossesItem) {
    if (this.losses == null) {
      this.losses = new ArrayList<LossEdge>();
    }
    this.losses.add(lossesItem);
    return this;
  }

   /**
   * Get losses
   * @return losses
  **/
  @Schema(description = "")
  public List<LossEdge> getLosses() {
    return losses;
  }

  public void setLosses(List<LossEdge> losses) {
    this.losses = losses;
  }

  public FragmentationTree treeScore(Double treeScore) {
    this.treeScore = treeScore;
    return this;
  }

   /**
   * Get treeScore
   * @return treeScore
  **/
  @Schema(description = "")
  public Double getTreeScore() {
    return treeScore;
  }

  public void setTreeScore(Double treeScore) {
    this.treeScore = treeScore;
  }

  public FragmentationTree root(FragmentNode root) {
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @Schema(description = "")
  public FragmentNode getRoot() {
    return root;
  }

  public void setRoot(FragmentNode root) {
    this.root = root;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentationTree fragmentationTree = (FragmentationTree) o;
    return Objects.equals(this.fragments, fragmentationTree.fragments) &&
        Objects.equals(this.losses, fragmentationTree.losses) &&
        Objects.equals(this.treeScore, fragmentationTree.treeScore) &&
        Objects.equals(this.root, fragmentationTree.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fragments, losses, treeScore, root);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentationTree {\n");
    
    sb.append("    fragments: ").append(toIndentedString(fragments)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    treeScore: ").append(toIndentedString(treeScore)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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