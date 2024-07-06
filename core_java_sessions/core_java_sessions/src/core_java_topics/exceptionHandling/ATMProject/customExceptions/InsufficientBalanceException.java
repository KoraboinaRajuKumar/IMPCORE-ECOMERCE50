package core_java_topics.exceptionHandling.ATMProject.customExceptions;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String errorMsg) {
		super(errorMsg);
	}
}
