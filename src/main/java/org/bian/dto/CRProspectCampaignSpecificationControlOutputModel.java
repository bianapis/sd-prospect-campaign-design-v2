package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationControlOutputModel
 */
public class CRProspectCampaignSpecificationControlOutputModel   {
  private String prospectCampaignSpecificationControlActionTaskReference = null;

  private Object prospectCampaignSpecificationControlActionTaskRecord = null;

  private String prospectCampaignSpecificationControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Specification instance control processing service call 
   * @return prospectCampaignSpecificationControlActionTaskReference
  **/

  public String getProspectCampaignSpecificationControlActionTaskReference() {
    return prospectCampaignSpecificationControlActionTaskReference;
  }

  public void setProspectCampaignSpecificationControlActionTaskReference(String prospectCampaignSpecificationControlActionTaskReference) {
    this.prospectCampaignSpecificationControlActionTaskReference = prospectCampaignSpecificationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return prospectCampaignSpecificationControlActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationControlActionTaskRecord() {
    return prospectCampaignSpecificationControlActionTaskRecord;
  }

  public void setProspectCampaignSpecificationControlActionTaskRecord(Object prospectCampaignSpecificationControlActionTaskRecord) {
    this.prospectCampaignSpecificationControlActionTaskRecord = prospectCampaignSpecificationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return prospectCampaignSpecificationControlActionResponse
  **/

  public String getProspectCampaignSpecificationControlActionResponse() {
    return prospectCampaignSpecificationControlActionResponse;
  }

  public void setProspectCampaignSpecificationControlActionResponse(String prospectCampaignSpecificationControlActionResponse) {
    this.prospectCampaignSpecificationControlActionResponse = prospectCampaignSpecificationControlActionResponse;
  }


}

