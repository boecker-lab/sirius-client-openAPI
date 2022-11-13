/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.Subscription;
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
 * AccountInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-13T13:06:27.895593Z[Etc/UTC]")
public class AccountInfo {
  @SerializedName("userID")
  private String userID = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("userEmail")
  private String userEmail = null;

  @SerializedName("gravatarURL")
  private String gravatarURL = null;

  @SerializedName("subscriptions")
  private List<Subscription> subscriptions = null;

  @SerializedName("activeSubscriptionId")
  private String activeSubscriptionId = null;

  public AccountInfo userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @Schema(description = "")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public AccountInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountInfo userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @Schema(description = "")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public AccountInfo gravatarURL(String gravatarURL) {
    this.gravatarURL = gravatarURL;
    return this;
  }

   /**
   * Get gravatarURL
   * @return gravatarURL
  **/
  @Schema(description = "")
  public String getGravatarURL() {
    return gravatarURL;
  }

  public void setGravatarURL(String gravatarURL) {
    this.gravatarURL = gravatarURL;
  }

  public AccountInfo subscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public AccountInfo addSubscriptionsItem(Subscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<Subscription>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Schema(description = "")
  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public AccountInfo activeSubscriptionId(String activeSubscriptionId) {
    this.activeSubscriptionId = activeSubscriptionId;
    return this;
  }

   /**
   * Get activeSubscriptionId
   * @return activeSubscriptionId
  **/
  @Schema(description = "")
  public String getActiveSubscriptionId() {
    return activeSubscriptionId;
  }

  public void setActiveSubscriptionId(String activeSubscriptionId) {
    this.activeSubscriptionId = activeSubscriptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.userID, accountInfo.userID) &&
        Objects.equals(this.username, accountInfo.username) &&
        Objects.equals(this.userEmail, accountInfo.userEmail) &&
        Objects.equals(this.gravatarURL, accountInfo.gravatarURL) &&
        Objects.equals(this.subscriptions, accountInfo.subscriptions) &&
        Objects.equals(this.activeSubscriptionId, accountInfo.activeSubscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, username, userEmail, gravatarURL, subscriptions, activeSubscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    gravatarURL: ").append(toIndentedString(gravatarURL)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    activeSubscriptionId: ").append(toIndentedString(activeSubscriptionId)).append("\n");
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
