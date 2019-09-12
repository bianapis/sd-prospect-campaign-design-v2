package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationControlInputModelProspectCampaignSpecificationControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationControlInputModel
 */
public class CRProspectCampaignSpecificationControlInputModel   {
  private String prospectCampaignDesignServicingSessionReference = null;

  private String prospectCampaignSpecificationInstanceReference = null;

  private Object prospectCampaignSpecificationControlActionTaskRecord = null;

  private CRProspectCampaignSpecificationControlInputModelProspectCampaignSpecificationControlActionRequest prospectCampaignSpecificationControlActionRequest = null;


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
   * Get prospectCampaignSpecificationControlActionRequest
   * @return prospectCampaignSpecificationControlActionRequest
  **/

  public CRProspectCampaignSpecificationControlInputModelProspectCampaignSpecificationControlActionRequest getProspectCampaignSpecificationControlActionRequest() {
    return prospectCampaignSpecificationControlActionRequest;
  }

  public void setProspectCampaignSpecificationControlActionRequest(CRProspectCampaignSpecificationControlInputModelProspectCampaignSpecificationControlActionRequest prospectCampaignSpecificationControlActionRequest) {
    this.prospectCampaignSpecificationControlActionRequest = prospectCampaignSpecificationControlActionRequest;
  }


}

