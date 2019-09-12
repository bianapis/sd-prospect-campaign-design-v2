package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCreateInputModel
 */
public class CRProspectCampaignSpecificationCreateInputModel   {
  private String prospectCampaignDesignServicingSessionReference = null;

  private Object prospectCampaignSpecificationCreateActionRecord = null;

  private String prospectCampaignSpecificationInstanceStatus = null;

  private CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return prospectCampaignSpecificationCreateActionRecord
  **/

  public Object getProspectCampaignSpecificationCreateActionRecord() {
    return prospectCampaignSpecificationCreateActionRecord;
  }

  public void setProspectCampaignSpecificationCreateActionRecord(Object prospectCampaignSpecificationCreateActionRecord) {
    this.prospectCampaignSpecificationCreateActionRecord = prospectCampaignSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Prospect Campaign Specification instance (e.g. initialised, pending, active) 
   * @return prospectCampaignSpecificationInstanceStatus
  **/

  public String getProspectCampaignSpecificationInstanceStatus() {
    return prospectCampaignSpecificationInstanceStatus;
  }

  public void setProspectCampaignSpecificationInstanceStatus(String prospectCampaignSpecificationInstanceStatus) {
    this.prospectCampaignSpecificationInstanceStatus = prospectCampaignSpecificationInstanceStatus;
  }


  /**
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


}

