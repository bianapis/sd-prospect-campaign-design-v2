package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCaptureOutputModel
 */
public class CRProspectCampaignSpecificationCaptureOutputModel   {
  private CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private String prospectCampaignSpecificationCaptureActionTaskReference = null;

  private Object prospectCampaignSpecificationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Specification instance capture service call 
   * @return prospectCampaignSpecificationCaptureActionTaskReference
  **/

  public String getProspectCampaignSpecificationCaptureActionTaskReference() {
    return prospectCampaignSpecificationCaptureActionTaskReference;
  }

  public void setProspectCampaignSpecificationCaptureActionTaskReference(String prospectCampaignSpecificationCaptureActionTaskReference) {
    this.prospectCampaignSpecificationCaptureActionTaskReference = prospectCampaignSpecificationCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

