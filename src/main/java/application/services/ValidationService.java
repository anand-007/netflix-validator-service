package application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.data.StatsGenerator;
import application.evaluator.EvaluatorFactory;
import application.evaluator.IEvaluator;
import application.models.Device;
import application.models.IValidateModel;
import application.models.Member;
import application.models.Viewable;
import application.requests.DeviceRequest;
import application.requests.IModelRequest;
import application.requests.MemberRequest;
import application.requests.ValidateRequest;
import application.requests.ViewableRequest;
import application.responses.EvaluationResponse;
import application.responses.ValidateResponse;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

@Service
public class ValidationService {
	
    @Autowired private MemberService memberService;
    @Autowired private DeviceService deviceService;
    @Autowired private ViewService viewService;
    
    private final String[] validatorTypes= new String[] {"member","device","view"};
    private StatsGenerator statsGenerator = StatsGenerator.getInstance();
	
	public ValidateResponse isValid(ValidateRequest validateData) {
		
		// Retrieve the Member, Device and Playback video related data
	
		Member memberDetails = memberService.findMemberById(validateData.getMemberId());
		Device deviceDetails = deviceService.findDeviceByType(validateData.getDeviceId());
		Viewable playBackViewDetails = viewService.findViewById(validateData.getPlayBackId());
		
		if(memberDetails==null || deviceDetails==null || playBackViewDetails==null) {
			return new ValidateResponse(false, "INVALID INPUT DATA");
		}
		
		boolean evaluatedResult = true;
		
		List<IValidateModel> modelList = new ArrayList<IValidateModel>();
		modelList.add(memberDetails);
		modelList.add(deviceDetails);
		modelList.add(playBackViewDetails);
		
		List<IModelRequest> requestList = new ArrayList<IModelRequest>();
		MemberRequest memberRequest = new MemberRequest();
		DeviceRequest deviceRequest = new DeviceRequest();
		deviceRequest.setViewResolution(playBackViewDetails.getMinimumSupportedResolution());
		ViewableRequest viewRequest = new ViewableRequest();
		viewRequest.setCountry(memberDetails.getUserCountry());
		viewRequest.setMaturityLevel(memberDetails.getLevel());
		viewRequest.setPinMaturityLevel(memberDetails.getPinMaturityLevel());
		viewRequest.setUserPin(memberDetails.getPin());
		viewRequest.setActualPin(validateData.getUserPin());
		
		requestList.add(memberRequest);
		requestList.add(deviceRequest);
		requestList.add(viewRequest);
		
		EvaluationResponse response = null;
		
		// Dynamic enable and disable of validator Types.
		
		for(String validatorType: validatorTypes) {
			if(validateData.getExcludeTypes()!=null && validateData.getExcludeTypes().contains(validatorType)) {
				continue;
			} else {				
				IEvaluator evaluator = EvaluatorFactory.getEvaluator(validatorType, modelList, requestList);
				response = evaluator.evaluateSpecifications();
				evaluatedResult = evaluatedResult & response!=null && response.isSuccess();
				if(!evaluatedResult) {
					break;
				}
			}
		}
		
		if(response==null) {
			statsGenerator.updateStatsCount(true);
			return new ValidateResponse(true, null);
		} else {	
			if(response.isSuccess()) {
				statsGenerator.updateStatsCount(response.isSuccess());
			}
			return new ValidateResponse(response.isSuccess(), response.getMessage());
		}
	}

}
