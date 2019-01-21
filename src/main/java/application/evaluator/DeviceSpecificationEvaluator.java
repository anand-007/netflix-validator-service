package application.evaluator;
import java.util.List;

import application.models.Device;
import application.models.IValidateModel;
import application.requests.IModelRequest;
import application.specifications.ISpecification;

public class DeviceSpecificationEvaluator implements IEvaluator {
	
	List<ISpecification<IValidateModel, IModelRequest>> deviceSpecifications;
	
	IValidateModel device;
	
	IModelRequest deviceRequest;

	DeviceSpecificationEvaluator(IValidateModel deviceModel, IModelRequest deviceRequest){
		this.device = deviceModel;
		this.deviceRequest = deviceRequest;
	}
	
	@Override
	public boolean evaluateSpecifications() {
		// TODO Auto-generated method stub
		
		boolean evaluatedResult = true;
		
		for(ISpecification<IValidateModel, IModelRequest> specification: deviceSpecifications) {
			evaluatedResult = evaluatedResult & specification.isSatisfiedBy(this.device, this.deviceRequest);
		}
		
		return evaluatedResult;
	}

}
