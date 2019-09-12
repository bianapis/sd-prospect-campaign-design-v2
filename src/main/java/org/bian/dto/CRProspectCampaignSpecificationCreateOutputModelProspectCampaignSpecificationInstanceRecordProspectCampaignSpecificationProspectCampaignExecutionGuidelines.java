package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecificationProspectCampaignExecutionGuidelines
 */
public class CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecificationProspectCampaignExecutionGuidelines   {
  private String prospectCampaignEligibility = null;

  private String prospectCampaignQualifications = null;

  private String prospectCampaignInteractionGuide = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the eligibility criteria that are to be applied to select suitable candidates for the prospect campaign. (Note candidate lists are developed by Campaign Execution) 
   * @return prospectCampaignEligibility
  **/

  public String getProspectCampaignEligibility() {
    return prospectCampaignEligibility;
  }

  public void setProspectCampaignEligibility(String prospectCampaignEligibility) {
    this.prospectCampaignEligibility = prospectCampaignEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines any qualifications or credentials required of the bank unit or employees to execute the campaign (e.g. product certified, sign-off authority level) 
   * @return prospectCampaignQualifications
  **/

  public String getProspectCampaignQualifications() {
    return prospectCampaignQualifications;
  }

  public void setProspectCampaignQualifications(String prospectCampaignQualifications) {
    this.prospectCampaignQualifications = prospectCampaignQualifications;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provides the structured narrative and any pricing/negotiating frameworks that are used in the execution of the campaign 
   * @return prospectCampaignInteractionGuide
  **/

  public String getProspectCampaignInteractionGuide() {
    return prospectCampaignInteractionGuide;
  }

  public void setProspectCampaignInteractionGuide(String prospectCampaignInteractionGuide) {
    this.prospectCampaignInteractionGuide = prospectCampaignInteractionGuide;
  }


}

