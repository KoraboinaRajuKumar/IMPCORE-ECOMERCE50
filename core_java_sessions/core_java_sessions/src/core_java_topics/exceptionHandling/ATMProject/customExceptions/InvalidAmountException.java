package core_java_topics.exceptionHandling.ATMProject.customExceptions;

public class InvalidAmountException extends Exception{

	public InvalidAmountException(String errorMsg) {
		super(errorMsg);
	}
}
