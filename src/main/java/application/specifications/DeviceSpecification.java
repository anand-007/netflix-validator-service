package application.specifications;

import application.models.Device;

import application.requests.DeviceRequest;
import application.responses.EvaluationResponse;

/**
 * Device Specifications
 * @author ecom-anandraj.t
 *
 */

public class DeviceSpecification implements ISpecification<Device, DeviceRequest>{	

	@Override
	public EvaluationResponse isSatisfiedBy(Device candidate, DeviceRequest deviceRequest) {
		// TODO Auto-generated method stub
		
		EvaluationResponse response = new EvaluationResponse();
		
		if(candidate.getMaxSupportedResolution()<deviceRequest.getViewResolution()) {
			response.setMessage("DEVICE RESOLUTION NOT SUPPORTED");
			response.setSuccess(false);
			return response;
		}	
		
		response.setSuccess(true);
		
		return response;
	}
	
	

}
