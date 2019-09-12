package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationExchangeInputModelProspectCampaignSpecificationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationExchangeInputModel
 */
public class CRProspectCampaignSpecificationExchangeInputModel   {
  private String prospectCampaignDesignServicingSessionReference = null;

  private String prospectCampaignSpecificationInstanceReference = null;

  private Object prospectCampaignSpecificationExchangeActionTaskRecord = null;

  private CRProspectCampaignSpecificationExchangeInputModelProspectCampaignSpecificationExchangeActionRequest prospectCampaignSpecificationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return prospectCampaignDesignServicingSessionReference
  **/

  public String getProspectCampaignDesignServicingSessionReference() {
    return prospectCampaignDesignServicingSessionReference;
  }

  public void setProspectCampaignDesignServicingSessionReference(String prospectCampaignDesignServicingSessionReference) {
    this.prospectCampaignDesignServicingSessionReference = prospectCampaignDesignServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospect Campaign Specification instance 
   * @return prospectCampaignSpecificationInstanceReference
  **/

  public String getProspectCampaignSpecificationInstanceReference() {
    return prospectCampaignSpecificationInstanceReference;
  }

  public void setProspectCampaignSpecificationInstanceReference(String prospectCampaignSpecificationInstanceReference) {
    this.prospectCampaignSpecificationInstanceReference = prospectCampaignSpecificationInstanceReference;
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
   * Get prospectCampaignSpecificationExchangeActionRequest
   * @return prospectCampaignSpecificationExchangeActionRequest
  **/

  public CRProspectCampaignSpecificationExchangeInputModelProspectCampaignSpecificationExchangeActionRequest getProspectCampaignSpecificationExchangeActionRequest() {
    return prospectCampaignSpecificationExchangeActionRequest;
  }

  public void setProspectCampaignSpecificationExchangeActionRequest(CRProspectCampaignSpecificationExchangeInputModelProspectCampaignSpecificationExchangeActionRequest prospectCampaignSpecificationExchangeActionRequest) {
    this.prospectCampaignSpecificationExchangeActionRequest = prospectCampaignSpecificationExchangeActionRequest;
  }


}

