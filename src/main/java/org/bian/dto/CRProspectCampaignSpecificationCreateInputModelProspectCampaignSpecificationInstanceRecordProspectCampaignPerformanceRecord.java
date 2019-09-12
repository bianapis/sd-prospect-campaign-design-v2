package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord
 */
public class CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord   {
  private CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference = null;


  /**
   * Get prospectCampaignProcedureInstanceReference
   * @return prospectCampaignProcedureInstanceReference
  **/

  public CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(CRProspectCampaignSpecificationCreateInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
  }


}
