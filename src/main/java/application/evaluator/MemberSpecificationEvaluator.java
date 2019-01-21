package application.evaluator;

import java.util.List;

import application.models.IValidateModel;
import application.requests.IModelRequest;
import application.responses.EvaluationResponse;
import application.specifications.ISpecification;

/**
 * Performing validation for Member Rules
 * @author ecom-anandraj.t
 *
 */


public class MemberSpecificationEvaluator implements IEvaluator{
	
	private List<ISpecification> memberSpecifications;
	
	public List<ISpecification> getMemberSpecifications() {
		return memberSpecifications;
	}

	public void setMemberSpecifications(List<ISpecification> specificationList) {
		this.memberSpecifications = specificationList;
	}

	IValidateModel member;
	IModelRequest memberRequest;

	MemberSpecificationEvaluator(IValidateModel memberModel, IModelRequest memberRequest){
		this.member = memberModel;
		this.memberRequest = memberRequest;
	}

	@Override
	public EvaluationResponse evaluateSpecifications() {
		// TODO Auto-generated method stub
		boolean evaluatedResult = true;
		
		EvaluationResponse evaluatedResponse = null;
		for(ISpecification<IValidateModel, IModelRequest> specification: memberSpecifications) {
			evaluatedResponse = specification.isSatisfiedBy(this.member, this.memberRequest);
			evaluatedResult = evaluatedResult & evaluatedResponse!=null && evaluatedResponse.isSuccess();
			if(!evaluatedResult) {
				break;
			}
		}
		
		return evaluatedResponse;
	}


}
