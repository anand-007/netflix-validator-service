package application.specifications;

import application.responses.EvaluationResponse;

/**
 * 
 * @author ecom-anandraj.t
 *
 * @param <T>
 * @param <V>
 */

public interface ISpecification<T, V> {
	
	EvaluationResponse isSatisfiedBy(T candidate, V modelRequest);

}
