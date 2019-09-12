package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord
 */
public class CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceReportRecord   {
  private String prospectCampaignSpecificationInstanceReportData = null;

  private String prospectCampaignSpecificationInstanceReportType = null;

  private Object prospectCampaignSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return prospectCampaignSpecificationInstanceReportData
  **/

  public String getProspectCampaignSpecificationInstanceReportData() {
    return prospectCampaignSpecificationInstanceReportData;
  }

  public void setProspectCampaignSpecificationInstanceReportData(String prospectCampaignSpecificationInstanceReportData) {
    this.prospectCampaignSpecificationInstanceReportData = prospectCampaignSpecificationInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return prospectCampaignSpecificationInstanceReport
  **/

  public Object getProspectCampaignSpecificationInstanceReport() {
    return prospectCampaignSpecificationInstanceReport;
  }

  public void setProspectCampaignSpecificationInstanceReport(Object prospectCampaignSpecificationInstanceReport) {
    this.prospectCampaignSpecificationInstanceReport = prospectCampaignSpecificationInstanceReport;
  }


}

