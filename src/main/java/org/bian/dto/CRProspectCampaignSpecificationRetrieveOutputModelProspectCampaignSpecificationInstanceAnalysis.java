package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis
 */
public class CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceAnalysis   {
  private String prospectCampaignSpecificationInstanceAnalysisData = null;

  private String prospectCampaignSpecificationInstanceAnalysisReportType = null;

  private Object prospectCampaignSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return prospectCampaignSpecificationInstanceAnalysisData
  **/

  public String getProspectCampaignSpecificationInstanceAnalysisData() {
    return prospectCampaignSpecificationInstanceAnalysisData;
  }

  public void setProspectCampaignSpecificationInstanceAnalysisData(String prospectCampaignSpecificationInstanceAnalysisData) {
    this.prospectCampaignSpecificationInstanceAnalysisData = prospectCampaignSpecificationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return prospectCampaignSpecificationInstanceAnalysisReportType
  **/

  public String getProspectCampaignSpecificationInstanceAnalysisReportType() {
    return prospectCampaignSpecificationInstanceAnalysisReportType;
  }

  public void setProspectCampaignSpecificationInstanceAnalysisReportType(String prospectCampaignSpecificationInstanceAnalysisReportType) {
    this.prospectCampaignSpecificationInstanceAnalysisReportType = prospectCampaignSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return prospectCampaignSpecificationInstanceAnalysisReport
  **/

  public Object getProspectCampaignSpecificationInstanceAnalysisReport() {
    return prospectCampaignSpecificationInstanceAnalysisReport;
  }

  public void setProspectCampaignSpecificationInstanceAnalysisReport(Object prospectCampaignSpecificationInstanceAnalysisReport) {
    this.prospectCampaignSpecificationInstanceAnalysisReport = prospectCampaignSpecificationInstanceAnalysisReport;
  }


}

