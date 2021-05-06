package business.validationTools;

public interface Validation<T> {
 
	boolean validate(T entity);
}
