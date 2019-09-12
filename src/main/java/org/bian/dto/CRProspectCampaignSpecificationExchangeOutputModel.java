package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationExchangeOutputModel
 */
public class CRProspectCampaignSpecificationExchangeOutputModel   {
  private String prospectCampaignSpecificationExchangeActionTaskReference = null;

  private Object prospectCampaignSpecificationExchangeActionTaskRecord = null;

  private String prospectCampaignSpecificationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Specification instance exchange service call 
   * @return prospectCampaignSpecificationExchangeActionTaskReference
  **/

  public String getProspectCampaignSpecificationExchangeActionTaskReference() {
    return prospectCampaignSpecificationExchangeActionTaskReference;
  }

  public void setProspectCampaignSpecificationExchangeActionTaskReference(String prospectCampaignSpecificationExchangeActionTaskReference) {
    this.prospectCampaignSpecificationExchangeActionTaskReference = prospectCampaignSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return prospectCampaignSpecificationExchangeActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationExchangeActionTaskRecord() {
    return prospectCampaignSpecificationExchangeActionTaskRecord;
  }

  public void setProspectCampaignSpecificationExchangeActionTaskRecord(Object prospectCampaignSpecificationExchangeActionTaskRecord) {
    this.prospectCampaignSpecificationExchangeActionTaskRecord = prospectCampaignSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return prospectCampaignSpecificationExchangeActionResponse
  **/

  public String getProspectCampaignSpecificationExchangeActionResponse() {
    return prospectCampaignSpecificationExchangeActionResponse;
  }

  public void setProspectCampaignSpecificationExchangeActionResponse(String prospectCampaignSpecificationExchangeActionResponse) {
    this.prospectCampaignSpecificationExchangeActionResponse = prospectCampaignSpecificationExchangeActionResponse;
  }


}

