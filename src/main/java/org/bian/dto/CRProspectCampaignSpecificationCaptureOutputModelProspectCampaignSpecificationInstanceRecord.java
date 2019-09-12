package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord
 */
public class CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecord   {
  private CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord = null;


  /**
   * Get prospectCampaignPerformanceRecord
   * @return prospectCampaignPerformanceRecord
  **/

  public CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord getProspectCampaignPerformanceRecord() {
    return prospectCampaignPerformanceRecord;
  }

  public void setProspectCampaignPerformanceRecord(CRProspectCampaignSpecificationCaptureOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord) {
    this.prospectCampaignPerformanceRecord = prospectCampaignPerformanceRecord;
  }


}

