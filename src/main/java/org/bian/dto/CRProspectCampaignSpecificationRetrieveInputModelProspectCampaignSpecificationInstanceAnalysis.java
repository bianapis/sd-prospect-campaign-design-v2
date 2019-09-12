package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis
 */
public class CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceAnalysis   {
  private String prospectCampaignSpecificationInstanceAnalysisReference = null;

  private String prospectCampaignSpecificationInstanceAnalysisReportType = null;

  private String prospectCampaignSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return prospectCampaignSpecificationInstanceAnalysisReference
  **/

  public String getProspectCampaignSpecificationInstanceAnalysisReference() {
    return prospectCampaignSpecificationInstanceAnalysisReference;
  }

  public void setProspectCampaignSpecificationInstanceAnalysisReference(String prospectCampaignSpecificationInstanceAnalysisReference) {
    this.prospectCampaignSpecificationInstanceAnalysisReference = prospectCampaignSpecificationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return prospectCampaignSpecificationInstanceAnalysisParameters
  **/

  public String getProspectCampaignSpecificationInstanceAnalysisParameters() {
    return prospectCampaignSpecificationInstanceAnalysisParameters;
  }

  public void setProspectCampaignSpecificationInstanceAnalysisParameters(String prospectCampaignSpecificationInstanceAnalysisParameters) {
    this.prospectCampaignSpecificationInstanceAnalysisParameters = prospectCampaignSpecificationInstanceAnalysisParameters;
  }


}

