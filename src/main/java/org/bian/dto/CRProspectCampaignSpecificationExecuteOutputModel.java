package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationExecuteOutputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationExecuteOutputModel
 */
public class CRProspectCampaignSpecificationExecuteOutputModel   {
  private CRProspectCampaignSpecificationExecuteOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private String prospectCampaignSpecificationExecuteActionTaskReference = null;

  private Object prospectCampaignSpecificationExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationExecuteOutputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationExecuteOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Specification instance execute service call 
   * @return prospectCampaignSpecificationExecuteActionTaskReference
  **/

  public String getProspectCampaignSpecificationExecuteActionTaskReference() {
    return prospectCampaignSpecificationExecuteActionTaskReference;
  }

  public void setProspectCampaignSpecificationExecuteActionTaskReference(String prospectCampaignSpecificationExecuteActionTaskReference) {
    this.prospectCampaignSpecificationExecuteActionTaskReference = prospectCampaignSpecificationExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

