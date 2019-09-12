package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignMetrics;
import org.bian.dto.CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecification;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord
 */
public class CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecord   {
  private String prospectCampaignType = null;

  private String prospectCampaignDescription = null;

  private CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignMetrics prospectCampaignMetrics = null;

  private CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecification prospectCampaignSpecification = null;

  private CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of prospect campaign (e.g. direct acquisition, product discount incentive) 
   * @return prospectCampaignType
  **/

  public String getProspectCampaignType() {
    return prospectCampaignType;
  }

  public void setProspectCampaignType(String prospectCampaignType) {
    this.prospectCampaignType = prospectCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return prospectCampaignDescription
  **/

  public String getProspectCampaignDescription() {
    return prospectCampaignDescription;
  }

  public void setProspectCampaignDescription(String prospectCampaignDescription) {
    this.prospectCampaignDescription = prospectCampaignDescription;
  }


  /**
   * Get prospectCampaignMetrics
   * @return prospectCampaignMetrics
  **/

  public CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignMetrics getProspectCampaignMetrics() {
    return prospectCampaignMetrics;
  }

  public void setProspectCampaignMetrics(CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignMetrics prospectCampaignMetrics) {
    this.prospectCampaignMetrics = prospectCampaignMetrics;
  }


  /**
   * Get prospectCampaignSpecification
   * @return prospectCampaignSpecification
  **/

  public CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecification getProspectCampaignSpecification() {
    return prospectCampaignSpecification;
  }

  public void setProspectCampaignSpecification(CRProspectCampaignSpecificationCreateOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignSpecification prospectCampaignSpecification) {
    this.prospectCampaignSpecification = prospectCampaignSpecification;
  }


  /**
   * Get prospectCampaignPerformanceRecord
   * @return prospectCampaignPerformanceRecord
  **/

  public CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord getProspectCampaignPerformanceRecord() {
    return prospectCampaignPerformanceRecord;
  }

  public void setProspectCampaignPerformanceRecord(CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord) {
    this.prospectCampaignPerformanceRecord = prospectCampaignPerformanceRecord;
  }


}

