/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProspectCampaignDesignApiServiceImpl implements ProspectCampaignDesignApiService {

	public SDProspectCampaignDesignActivateOutputModel activate(SDProspectCampaignDesignActivateInputModel request){
		return JsonReader.read("activate-SDProspectCampaignDesignActivateOutputModel.json",new TypeReference<SDProspectCampaignDesignActivateOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRProspectCampaignSpecificationCaptureOutputModel.json",new TypeReference<CRProspectCampaignSpecificationCaptureOutputModel>(){});
	}
	
	public SDProspectCampaignDesignConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignDesignConfigureInputModel request){
		return JsonReader.read("configure-SDProspectCampaignDesignConfigureOutputModel.json",new TypeReference<SDProspectCampaignDesignConfigureOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationControlInputModel request){
		return JsonReader.read("control-CRProspectCampaignSpecificationControlOutputModel.json",new TypeReference<CRProspectCampaignSpecificationControlOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationCreateOutputModel create(String sdReferenceId, CRProspectCampaignSpecificationCreateInputModel request){
		return JsonReader.read("create-CRProspectCampaignSpecificationCreateOutputModel.json",new TypeReference<CRProspectCampaignSpecificationCreateOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRProspectCampaignSpecificationExchangeOutputModel.json",new TypeReference<CRProspectCampaignSpecificationExchangeOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationExecuteInputModel request){
		return JsonReader.read("execute-CRProspectCampaignSpecificationExecuteOutputModel.json",new TypeReference<CRProspectCampaignSpecificationExecuteOutputModel>(){});
	}
	
	public SDProspectCampaignDesignFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignDesignFeedbackInputModel request){
		return JsonReader.read("feedback-SDProspectCampaignDesignFeedbackOutputModel.json",new TypeReference<SDProspectCampaignDesignFeedbackOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationRequestInputModel request){
		return JsonReader.read("request-CRProspectCampaignSpecificationRequestOutputModel.json",new TypeReference<CRProspectCampaignSpecificationRequestOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProspectCampaignSpecificationRetrieveOutputModel.json",new TypeReference<CRProspectCampaignSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProspectCampaignDesignRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProspectCampaignDesignRetrieveOutputModel.json",new TypeReference<SDProspectCampaignDesignRetrieveOutputModel>(){});
	}
	
	public CRProspectCampaignSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRProspectCampaignSpecificationUpdateOutputModel.json",new TypeReference<CRProspectCampaignSpecificationUpdateOutputModel>(){});
	}
	
}
