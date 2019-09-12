package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCreateOutputModel
 */
public class CRProspectCampaignSpecificationCreateOutputModel   {
  private String prospectCampaignSpecificationInstanceReference = null;

  private String prospectCampaignSpecificationCreateActionReference = null;

  private Object prospectCampaignSpecificationCreateActionRecord = null;

  private String prospectCampaignSpecificationInstanceStatus = null;

  private CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return prospectCampaignSpecificationCreateActionReference
  **/

  public String getProspectCampaignSpecificationCreateActionReference() {
    return prospectCampaignSpecificationCreateActionReference;
  }

  public void setProspectCampaignSpecificationCreateActionReference(String prospectCampaignSpecificationCreateActionReference) {
    this.prospectCampaignSpecificationCreateActionReference = prospectCampaignSpecificationCreateActionReference;
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

  public CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


}

