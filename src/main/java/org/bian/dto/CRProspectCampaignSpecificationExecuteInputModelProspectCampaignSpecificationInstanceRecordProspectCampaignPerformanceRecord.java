package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord
 */
public class CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord   {
  private CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference = null;


  /**
   * Get prospectCampaignProcedureInstanceReference
   * @return prospectCampaignProcedureInstanceReference
  **/

  public CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(CRProspectCampaignSpecificationExecuteInputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
  }


}
