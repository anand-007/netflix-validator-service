package application.specifications;

import application.models.Member;
import application.models.MemberStatus;
import application.requests.MemberRequest;
import application.responses.EvaluationResponse;

/**
 * Member Specifications/Rules
 * @author ecom-anandraj.t
 *
 */

public class MemberSpecification implements ISpecification<Member, MemberRequest>{

	@Override
	public EvaluationResponse isSatisfiedBy(Member candidate, MemberRequest memberRequest) {
		// TODO Auto-generated method stub
		EvaluationResponse response = new EvaluationResponse();
		if(candidate.getStatus()!=MemberStatus.ACTIVE) {
			response.setSuccess(false);
			response.setMessage("USER IS NOT ACTIVE");
			return response;
		}
		if((candidate.getActiveStreams().size()+1)>candidate.getPlanDetails().getNumberOfStreams()) {
			response.setSuccess(false);
			response.setMessage("NUMBER OF STREAMS EXCEEDED SUPPORTED BY PLAN");
			return response;
		}
		
		
		response.setSuccess(true);

		return response;
	}

}
