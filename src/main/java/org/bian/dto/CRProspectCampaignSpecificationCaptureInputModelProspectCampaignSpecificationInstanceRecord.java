package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord
 */
public class CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecord   {
  private CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord = null;


  /**
   * Get prospectCampaignPerformanceRecord
   * @return prospectCampaignPerformanceRecord
  **/

  public CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord getProspectCampaignPerformanceRecord() {
    return prospectCampaignPerformanceRecord;
  }

  public void setProspectCampaignPerformanceRecord(CRProspectCampaignSpecificationCaptureInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord) {
    this.prospectCampaignPerformanceRecord = prospectCampaignPerformanceRecord;
  }


}

