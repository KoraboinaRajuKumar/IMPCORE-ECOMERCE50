package core_java_topics.exceptionHandling.ATMProject.customExceptions;

public class InvalidPinException extends Exception{

	public InvalidPinException(String errorMsg) {
		super(errorMsg);
	}
}
