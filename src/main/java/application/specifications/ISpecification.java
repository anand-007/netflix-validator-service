package application.specifications;

public interface ISpecification<T, V> {
	
	boolean isActive();
	boolean isSatisfiedBy(T candidate, V modelRequest);

}
