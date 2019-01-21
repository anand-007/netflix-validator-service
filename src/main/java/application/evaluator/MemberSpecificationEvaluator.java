package application.evaluator;

import java.util.List;

import application.models.IValidateModel;
import application.models.Member;
import application.requests.IModelRequest;
import application.specifications.ISpecification;

public class MemberSpecificationEvaluator implements IEvaluator{
	
	List<ISpecification<IValidateModel, IModelRequest>> memberSpecifications;
	
	IValidateModel member;
	IModelRequest memberRequest;

	MemberSpecificationEvaluator(IValidateModel memberModel, IModelRequest memberRequest){
		this.member = memberModel;
		this.memberRequest = memberRequest;
	}

	@Override
	public boolean evaluateSpecifications() {
		// TODO Auto-generated method stub
		boolean evaluatedResult = true;
		
		for(ISpecification<IValidateModel, IModelRequest> specification: memberSpecifications) {
			evaluatedResult = evaluatedResult & specification.isSatisfiedBy(this.member, this.memberRequest);
		}
		
		return evaluatedResult;
	}


}
