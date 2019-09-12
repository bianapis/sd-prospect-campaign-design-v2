package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord
 */
public class CRProspectCampaignSpecificationRetrieveInputModelProspectCampaignSpecificationInstanceReportRecord   {
  private String prospectCampaignSpecificationInstanceReportReference = null;

  private String prospectCampaignSpecificationInstanceReportType = null;

  private String prospectCampaignSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return prospectCampaignSpecificationInstanceReportReference
  **/

  public String getProspectCampaignSpecificationInstanceReportReference() {
    return prospectCampaignSpecificationInstanceReportReference;
  }

  public void setProspectCampaignSpecificationInstanceReportReference(String prospectCampaignSpecificationInstanceReportReference) {
    this.prospectCampaignSpecificationInstanceReportReference = prospectCampaignSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return prospectCampaignSpecificationInstanceReportType
  **/

  public String getProspectCampaignSpecificationInstanceReportType() {
    return prospectCampaignSpecificationInstanceReportType;
  }

  public void setProspectCampaignSpecificationInstanceReportType(String prospectCampaignSpecificationInstanceReportType) {
    this.prospectCampaignSpecificationInstanceReportType = prospectCampaignSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return prospectCampaignSpecificationInstanceReportParameters
  **/

  public String getProspectCampaignSpecificationInstanceReportParameters() {
    return prospectCampaignSpecificationInstanceReportParameters;
  }

  public void setProspectCampaignSpecificationInstanceReportParameters(String prospectCampaignSpecificationInstanceReportParameters) {
    this.prospectCampaignSpecificationInstanceReportParameters = prospectCampaignSpecificationInstanceReportParameters;
  }


}

