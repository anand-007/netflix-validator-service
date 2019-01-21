package application.evaluator;

import java.util.List;

import application.models.IValidateModel;
import application.requests.IModelRequest;
import application.responses.EvaluationResponse;
import application.specifications.ISpecification;

/**
 * Performing validation for View Rules
 * @author ecom-anandraj.t
 *
 */

public class ViewSpecificationEvaluator implements IEvaluator {

	public List<ISpecification> getViewSpecifications() {
		return viewSpecifications;
	}

	public void setViewSpecifications(List<ISpecification> viewSpecifications) {
		this.viewSpecifications = viewSpecifications;
	}

	List<ISpecification> viewSpecifications;
	
	IValidateModel view;
	IModelRequest viewRequest;

	ViewSpecificationEvaluator(IValidateModel viewModel, IModelRequest viewRequest){
		this.view = viewModel;
		this.viewRequest = viewRequest;
	}

	@Override
	public EvaluationResponse evaluateSpecifications() {
		boolean evaluatedResult = true;
		EvaluationResponse evaluatedResponse = null;

		for(ISpecification<IValidateModel, IModelRequest> specification: viewSpecifications) {
			evaluatedResponse = specification.isSatisfiedBy(this.view, this.viewRequest);
			evaluatedResult = evaluatedResult & evaluatedResponse!=null && evaluatedResponse.isSuccess();
			if(!evaluatedResult) {
				break;
			}
		}
		
		return evaluatedResponse;
	}

}
