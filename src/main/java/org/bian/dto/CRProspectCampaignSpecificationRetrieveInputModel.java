package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveInputModel
 */
public class CRProspectCampaignSpecificationRetrieveInputModel   {
  private Object prospectCampaignSpecificationRetrieveActionTaskRecord = null;

  private String prospectCampaignSpecificationRetrieveActionRequest = null;

  private CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord prospectCampaignSpecificationInstanceReportRecord = null;

  private CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis prospectCampaignSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return prospectCampaignSpecificationRetrieveActionRequest
  **/

  public String getProspectCampaignSpecificationRetrieveActionRequest() {
    return prospectCampaignSpecificationRetrieveActionRequest;
  }

  public void setProspectCampaignSpecificationRetrieveActionRequest(String prospectCampaignSpecificationRetrieveActionRequest) {
    this.prospectCampaignSpecificationRetrieveActionRequest = prospectCampaignSpecificationRetrieveActionRequest;
  }


  /**
   * Get prospectCampaignSpecificationInstanceReportRecord
   * @return prospectCampaignSpecificationInstanceReportRecord
  **/

  public CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord getProspectCampaignSpecificationInstanceReportRecord() {
    return prospectCampaignSpecificationInstanceReportRecord;
  }

  public void setProspectCampaignSpecificationInstanceReportRecord(CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord prospectCampaignSpecificationInstanceReportRecord) {
    this.prospectCampaignSpecificationInstanceReportRecord = prospectCampaignSpecificationInstanceReportRecord;
  }


  /**
   * Get prospectCampaignSpecificationInstanceAnalysis
   * @return prospectCampaignSpecificationInstanceAnalysis
  **/

  public CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis getProspectCampaignSpecificationInstanceAnalysis() {
    return prospectCampaignSpecificationInstanceAnalysis;
  }

  public void setProspectCampaignSpecificationInstanceAnalysis(CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis prospectCampaignSpecificationInstanceAnalysis) {
    this.prospectCampaignSpecificationInstanceAnalysis = prospectCampaignSpecificationInstanceAnalysis;
  }


}

