package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationExecuteInputModelExecuteRecordType;
import org.bian.dto.CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationExecuteInputModel
 */
public class CRProspectCampaignSpecificationExecuteInputModel   {
  private String prospectCampaignDesignServicingSessionReference = null;

  private String prospectCampaignSpecificationInstanceReference = null;

  private CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private Object prospectCampaignSpecificationExecuteActionTaskRecord = null;

  private CRProspectCampaignSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return prospectCampaignSpecificationExecuteActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationExecuteActionTaskRecord() {
    return prospectCampaignSpecificationExecuteActionTaskRecord;
  }

  public void setProspectCampaignSpecificationExecuteActionTaskRecord(Object prospectCampaignSpecificationExecuteActionTaskRecord) {
    this.prospectCampaignSpecificationExecuteActionTaskRecord = prospectCampaignSpecificationExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRProspectCampaignSpecificationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRProspectCampaignSpecificationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

