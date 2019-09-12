package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveOutputModel
 */
public class CRProspectCampaignSpecificationRetrieveOutputModel   {
  private CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord = null;

  private String prospectCampaignSpecificationRetrieveActionTaskReference = null;

  private Object prospectCampaignSpecificationRetrieveActionTaskRecord = null;

  private String prospectCampaignSpecificationRetrieveActionResponse = null;

  private CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord prospectCampaignSpecificationInstanceReportRecord = null;

  private CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis prospectCampaignSpecificationInstanceAnalysis = null;


  /**
   * Get prospectCampaignSpecificationInstanceRecord
   * @return prospectCampaignSpecificationInstanceRecord
  **/

  public CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord getProspectCampaignSpecificationInstanceRecord() {
    return prospectCampaignSpecificationInstanceRecord;
  }

  public void setProspectCampaignSpecificationInstanceRecord(CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord prospectCampaignSpecificationInstanceRecord) {
    this.prospectCampaignSpecificationInstanceRecord = prospectCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Specification instance retrieve service call 
   * @return prospectCampaignSpecificationRetrieveActionTaskReference
  **/

  public String getProspectCampaignSpecificationRetrieveActionTaskReference() {
    return prospectCampaignSpecificationRetrieveActionTaskReference;
  }

  public void setProspectCampaignSpecificationRetrieveActionTaskReference(String prospectCampaignSpecificationRetrieveActionTaskReference) {
    this.prospectCampaignSpecificationRetrieveActionTaskReference = prospectCampaignSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return prospectCampaignSpecificationRetrieveActionTaskRecord
  **/

  public Object getProspectCampaignSpecificationRetrieveActionTaskRecord() {
    return prospectCampaignSpecificationRetrieveActionTaskRecord;
  }

  public void setProspectCampaignSpecificationRetrieveActionTaskRecord(Object prospectCampaignSpecificationRetrieveActionTaskRecord) {
    this.prospectCampaignSpecificationRetrieveActionTaskRecord = prospectCampaignSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return prospectCampaignSpecificationRetrieveActionResponse
  **/

  public String getProspectCampaignSpecificationRetrieveActionResponse() {
    return prospectCampaignSpecificationRetrieveActionResponse;
  }

  public void setProspectCampaignSpecificationRetrieveActionResponse(String prospectCampaignSpecificationRetrieveActionResponse) {
    this.prospectCampaignSpecificationRetrieveActionResponse = prospectCampaignSpecificationRetrieveActionResponse;
  }


  /**
   * Get prospectCampaignSpecificationInstanceReportRecord
   * @return prospectCampaignSpecificationInstanceReportRecord
  **/

  public CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord getProspectCampaignSpecificationInstanceReportRecord() {
    return prospectCampaignSpecificationInstanceReportRecord;
  }

  public void setProspectCampaignSpecificationInstanceReportRecord(CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord prospectCampaignSpecificationInstanceReportRecord) {
    this.prospectCampaignSpecificationInstanceReportRecord = prospectCampaignSpecificationInstanceReportRecord;
  }


  /**
   * Get prospectCampaignSpecificationInstanceAnalysis
   * @return prospectCampaignSpecificationInstanceAnalysis
  **/

  public CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis getProspectCampaignSpecificationInstanceAnalysis() {
    return prospectCampaignSpecificationInstanceAnalysis;
  }

  public void setProspectCampaignSpecificationInstanceAnalysis(CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis prospectCampaignSpecificationInstanceAnalysis) {
    this.prospectCampaignSpecificationInstanceAnalysis = prospectCampaignSpecificationInstanceAnalysis;
  }


}

