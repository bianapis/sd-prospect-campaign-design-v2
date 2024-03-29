package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord
 */
public class CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecord   {
  private CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference = null;


  /**
   * Get prospectCampaignProcedureInstanceReference
   * @return prospectCampaignProcedureInstanceReference
  **/

  public CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(CRProspectCampaignSpecificationRetrieveOutputModelProspectCampaignSpecificationInstanceRecordProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
  }


}

