package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecificationProspectCampaignConsumables
 */
public class CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecificationProspectCampaignConsumables   {
  private String prospectCampaignConsumableType = null;

  private String prospectCampaignConsumableDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of consumable item associated with the campaign (e.g. gift, brochure) 
   * @return prospectCampaignConsumableType
  **/

  public String getProspectCampaignConsumableType() {
    return prospectCampaignConsumableType;
  }

  public void setProspectCampaignConsumableType(String prospectCampaignConsumableType) {
    this.prospectCampaignConsumableType = prospectCampaignConsumableType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specification of the consumable item in whatever form appropriate. Note sourcing/procurement of the item is handled by execution) 
   * @return prospectCampaignConsumableDescription
  **/

  public String getProspectCampaignConsumableDescription() {
    return prospectCampaignConsumableDescription;
  }

  public void setProspectCampaignConsumableDescription(String prospectCampaignConsumableDescription) {
    this.prospectCampaignConsumableDescription = prospectCampaignConsumableDescription;
  }


}

