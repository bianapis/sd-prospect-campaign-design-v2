package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationUpdateInputModelProspectCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationUpdateOutputModel
 */
public class CRProspectCampaignSpecificationUpdateOutputModel   {
  private CRProspectCampaignSpecificationUpdateInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private String prospectCampaignSpecificationUpdateActionTaskReference = null;

  private Object prospectCampaignSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationUpdateInputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationUpdateInputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return prospectCampaignSpecificationUpdateActionTaskReference
  **/

  public String getProspectCampaignSpecificationUpdateActionTaskReference() {
    return prospectCampaignSpecificationUpdateActionTaskReference;
  }

  public void setProspectCampaignSpecificationUpdateActionTaskReference(String prospectCampaignSpecificationUpdateActionTaskReference) {
    this.prospectCampaignSpecificationUpdateActionTaskReference = prospectCampaignSpecificationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return prospectCampaignSpecificationUpdateActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationUpdateActionTaskRecord() {
    return prospectCampaignSpecificationUpdateActionTaskRecord;
  }

  public void setProspectCampaignSpecificationUpdateActionTaskRecord(Object prospectCampaignSpecificationUpdateActionTaskRecord) {
    this.prospectCampaignSpecificationUpdateActionTaskRecord = prospectCampaignSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

