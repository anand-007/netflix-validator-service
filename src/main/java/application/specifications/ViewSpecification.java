package application.specifications;

import application.models.Viewable;
import application.requests.ViewableRequest;
import application.responses.EvaluationResponse;

/**
 * View(PlayBackVideo) Specifications
 * @author ecom-anandraj.t
 *
 */

public class ViewSpecification implements ISpecification<Viewable, ViewableRequest>{

	@Override
	public EvaluationResponse isSatisfiedBy(Viewable candidate, ViewableRequest modelRequest) {
		// TODO Auto-generated method stub
		EvaluationResponse response = new EvaluationResponse();
		if(candidate.getCountry().getCountryId()!=modelRequest.getCountry().getCountryId()) {
			response.setSuccess(false);
			response.setMessage("CONTENT NOT SUPPORTED FOR YOUR COUNTRY");
			return response;
		}
		
		if(candidate.getMaturityLevel()!=null &&  modelRequest.getMaturityLevel()!=null && candidate.getMaturityLevel().getType().ordinal()>modelRequest.getMaturityLevel().getType().ordinal()) {
			response.setSuccess(false);
			response.setMessage("YOU ARE NOT AUTHORIZED TO VIEW THE CONTENT");
			return response;
		}
		
		if(candidate.getMaturityLevel()!=null && modelRequest.getPinMaturityLevel()!=null) {
			if(candidate.getMaturityLevel().getType().ordinal()>modelRequest.getPinMaturityLevel().getType().ordinal()) {
				if(modelRequest.getUserPin()!=null && modelRequest.getActualPin()!=null) {
					if(!modelRequest.getUserPin().equals(modelRequest.getActualPin())) {
						response.setSuccess(false);
						response.setMessage("PIN ENTERED DOES NOT MATCH");
						return response;
					}
				}
			}
			
			if(modelRequest.getUserPin()!=null && modelRequest.getActualPin()==null) {
				response.setSuccess(false);
				response.setMessage("PIN IS REQUIRED TO VIEW THIS CONTENT");
				return response;
			}
			
		}
		
		response.setSuccess(true);

		return response;
	}

}
