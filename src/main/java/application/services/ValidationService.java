package application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.evaluator.EvaluatorFactory;
import application.evaluator.IEvaluator;
import application.models.Device;
import application.models.IValidateModel;
import application.models.Member;
import application.models.Viewable;
import application.requests.IModelRequest;
import application.requests.ValidateRequest;
import application.responses.ValidateResponse;

@Service
public class ValidationService {
	
    @Autowired private MemberService memberService;
    @Autowired private DeviceService deviceService;
    @Autowired private ViewService viewService;
    
    private final String[] validatorTypes= new String[] {"member","device","view"};
	
	public ValidateResponse isValid(ValidateRequest validateData) {
	
		Member memberDetails = memberService.findMemberById("123");
		Device deviceDetails = deviceService.findDeviceByType("");
		Viewable playBackViewDetails = viewService.findViewById("");
		
		boolean evaluatedResult = true;
		
		List<IValidateModel> modelList = new ArrayList<IValidateModel>();
		modelList.add(memberDetails);
		modelList.add(deviceDetails);
		modelList.add(playBackViewDetails);
		
		List<IModelRequest> requestList = new ArrayList<IModelRequest>();

		
		for(String validatorType: validatorTypes) {
			IEvaluator evaluator = EvaluatorFactory.getEvaluator(validatorType, modelList, requestList);
			evaluatedResult = evaluatedResult & evaluator.evaluateSpecifications();
		}
		
		
		return new ValidateResponse();
	}

}
