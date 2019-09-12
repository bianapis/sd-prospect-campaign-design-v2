/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProspectCampaignDesignApiService {

	SDProspectCampaignDesignActivateOutputModel activate(SDProspectCampaignDesignActivateInputModel request);
	
	CRProspectCampaignSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationCaptureInputModel request);
	
	SDProspectCampaignDesignConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignDesignConfigureInputModel request);
	
	CRProspectCampaignSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationControlInputModel request);
	
	CRProspectCampaignSpecificationCreateOutputModel create(String sdReferenceId, CRProspectCampaignSpecificationCreateInputModel request);
	
	CRProspectCampaignSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationExchangeInputModel request);
	
	CRProspectCampaignSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationExecuteInputModel request);
	
	SDProspectCampaignDesignFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignDesignFeedbackInputModel request);
	
	CRProspectCampaignSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationRequestInputModel request);
	
	CRProspectCampaignSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProspectCampaignDesignRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProspectCampaignSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationUpdateInputModel request);
	
}
