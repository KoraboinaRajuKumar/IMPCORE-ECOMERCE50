package core_java_topics.exceptionHandling.ATMProject.customExceptions;

public class InvalidCardException extends Exception{

	public InvalidCardException(String errorMsg) {
		super(errorMsg);
	}
}
