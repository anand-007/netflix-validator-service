package application.evaluator;
import java.util.List;

import application.models.IValidateModel;
import application.requests.IModelRequest;
import application.responses.EvaluationResponse;
import application.specifications.ISpecification;

/**
 * Performing validation for Device Rules
 * @author ecom-anandraj.t
 *
 */

public class DeviceSpecificationEvaluator implements IEvaluator {
	
	List<ISpecification> deviceSpecifications;
	
	public List<ISpecification> getDeviceSpecifications() {
		return deviceSpecifications;
	}

	public void setDeviceSpecifications(List<ISpecification> deviceSpecifications) {
		this.deviceSpecifications = deviceSpecifications;
	}

	IValidateModel device;
	
	IModelRequest deviceRequest;

	DeviceSpecificationEvaluator(IValidateModel deviceModel, IModelRequest deviceRequest){
		this.device = deviceModel;
		this.deviceRequest = deviceRequest;
	}
	
	@Override
	public EvaluationResponse evaluateSpecifications() {
		// TODO Auto-generated method stub
		
		boolean evaluatedResult = true;
		EvaluationResponse evaluatedResponse = null;

		for(ISpecification<IValidateModel, IModelRequest> specification: deviceSpecifications) {
			evaluatedResponse = specification.isSatisfiedBy(this.device, this.deviceRequest);
			evaluatedResult = evaluatedResult & evaluatedResponse!=null && evaluatedResponse.isSuccess();
			if(!evaluatedResult) {
				break;
			}
		}
		
		return evaluatedResponse;
	}

}
