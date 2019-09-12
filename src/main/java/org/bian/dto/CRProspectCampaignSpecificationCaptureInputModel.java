package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCaptureInputModel
 */
public class CRProspectCampaignSpecificationCaptureInputModel   {
  private String prospectCampaignDesignServicingSessionReference = null;

  private String prospectCampaignSpecificationInstanceReference = null;

  private CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private Object prospectCampaignSpecificationCaptureActionTaskRecord = null;

  private CRProspectCampaignSpecificationCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return prospectCampaignSpecificationCaptureActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationCaptureActionTaskRecord() {
    return prospectCampaignSpecificationCaptureActionTaskRecord;
  }

  public void setProspectCampaignSpecificationCaptureActionTaskRecord(Object prospectCampaignSpecificationCaptureActionTaskRecord) {
    this.prospectCampaignSpecificationCaptureActionTaskRecord = prospectCampaignSpecificationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRProspectCampaignSpecificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRProspectCampaignSpecificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

