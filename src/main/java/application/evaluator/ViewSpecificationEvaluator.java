package application.evaluator;

import java.util.List;

import application.models.IValidateModel;
import application.requests.IModelRequest;
import application.specifications.ISpecification;

public class ViewSpecificationEvaluator implements IEvaluator {

	List<ISpecification<IValidateModel, IModelRequest>> viewSpecifications;
	
	IValidateModel view;
	IModelRequest viewRequest;

	ViewSpecificationEvaluator(IValidateModel viewModel, IModelRequest viewRequest){
		this.view = viewModel;
		this.viewRequest = viewRequest;
	}

	@Override
	public boolean evaluateSpecifications() {
		boolean evaluatedResult = true;
		
		for(ISpecification<IValidateModel, IModelRequest> specification: viewSpecifications) {
			evaluatedResult = evaluatedResult & specification.isSatisfiedBy(this.view, this.viewRequest);
		}
		
		return evaluatedResult;
	}

}
