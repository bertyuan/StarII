package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Machine  {
  
  private Integer partnerId = null;
  private String partnerName = null;
  private Integer userId = null;
  private String userName = null;
  private Integer machineId = null;
  private String manifestId = null;
  private String machineName = null;

  
  /**
   * partner id
   **/
  @ApiModelProperty(value = "partner id")
  @JsonProperty("partner_id")
  public Integer getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }

  
  /**
   * partner name
   **/
  @ApiModelProperty(value = "partner name")
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }
  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  
  /**
   * user id
   **/
  @ApiModelProperty(value = "user id")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   * user name
   **/
  @ApiModelProperty(value = "user name")
  @JsonProperty("user_name")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * machine id
   **/
  @ApiModelProperty(value = "machine id")
  @JsonProperty("machine_id")
  public Integer getMachineId() {
    return machineId;
  }
  public void setMachineId(Integer machineId) {
    this.machineId = machineId;
  }

  
  /**
   * manifest id
   **/
  @ApiModelProperty(value = "manifest id")
  @JsonProperty("manifest_id")
  public String getManifestId() {
    return manifestId;
  }
  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }

  
  /**
   * machine name
   **/
  @ApiModelProperty(value = "machine name")
  @JsonProperty("machine_name")
  public String getMachineName() {
    return machineName;
  }
  public void setMachineName(String machineName) {
    this.machineName = machineName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Machine {\n");
    
    sb.append("  partnerId: ").append(partnerId).append("\n");
    sb.append("  partnerName: ").append(partnerName).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  machineId: ").append(machineId).append("\n");
    sb.append("  manifestId: ").append(manifestId).append("\n");
    sb.append("  machineName: ").append(machineName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
