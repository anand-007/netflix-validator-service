package application.evaluator;

import java.util.List;

import application.models.Device;
import application.models.IValidateModel;
import application.models.Member;
import application.models.Viewable;
import application.requests.DeviceRequest;
import application.requests.IModelRequest;
import application.requests.MemberRequest;
import application.requests.ViewableRequest;
import application.specifications.ISpecification;
import application.specifications.SpecificationFactory;

/**
 * Factory 
 * @author ecom-anandraj.t
 *
 */

public class EvaluatorFactory {
	
	public static IEvaluator getEvaluator(String evaluatorType, List<IValidateModel> modelList, List<IModelRequest> requestList) {
		
		List<ISpecification> specificationList = SpecificationFactory.getSpecifications(evaluatorType);

		if(evaluatorType=="member") {
			IValidateModel memberModel = getModel(modelList, evaluatorType);
			IModelRequest request = getRequest(requestList, evaluatorType);
			MemberSpecificationEvaluator memberEvaluator = new MemberSpecificationEvaluator(memberModel,request);
			memberEvaluator.setMemberSpecifications(specificationList);
			return memberEvaluator;
		} else if(evaluatorType=="device") {
			IValidateModel deviceModel = getModel(modelList, evaluatorType);
			IModelRequest request = getRequest(requestList, evaluatorType);
			DeviceSpecificationEvaluator deviceEvaluator = new DeviceSpecificationEvaluator(deviceModel,request);
			deviceEvaluator.setDeviceSpecifications(specificationList);
			return deviceEvaluator;
		} else if(evaluatorType=="view") {
			IValidateModel viewModel = getModel(modelList, evaluatorType);
			IModelRequest request = getRequest(requestList, evaluatorType);
			ViewSpecificationEvaluator viewEvaluator = new ViewSpecificationEvaluator(viewModel,request);
			viewEvaluator.setViewSpecifications(specificationList);
			return viewEvaluator;
		} else {
			return null;
		}	
	}
	
	private static IValidateModel getModel(List<IValidateModel> modelList, String memberType) {
		
		IValidateModel validatedModel = null;
		
		for(IValidateModel model: modelList) {
			if(model instanceof Member && memberType=="member") {
				validatedModel = model;
			}else if(model instanceof Device && memberType=="device") {
				validatedModel = model;
			}else if(model instanceof Viewable && memberType=="view") {
				validatedModel = model;
			}
		}
		
		
		return validatedModel;
		
	}
	
	private static IModelRequest getRequest(List<IModelRequest> requestList, String memberType) {
		
		IModelRequest validatedRequest = null;
		
		for(IModelRequest request: requestList) {
			if(request instanceof MemberRequest && memberType=="member") {
				validatedRequest = request;
			}else if(request instanceof DeviceRequest && memberType=="device") {
				validatedRequest = request;
			}else if(request instanceof ViewableRequest && memberType=="view") {
				validatedRequest = request;
			}
		}
		
		
		return validatedRequest;
		
	}
	

}
