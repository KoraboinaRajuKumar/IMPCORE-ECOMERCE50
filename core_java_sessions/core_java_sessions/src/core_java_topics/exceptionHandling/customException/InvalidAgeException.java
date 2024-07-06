package core_java_topics.exceptionHandling.customException;

public class InvalidAgeException extends Exception {

	//provide the constructor
	public InvalidAgeException(String errorMsg) {
		super(errorMsg);
	}
}
