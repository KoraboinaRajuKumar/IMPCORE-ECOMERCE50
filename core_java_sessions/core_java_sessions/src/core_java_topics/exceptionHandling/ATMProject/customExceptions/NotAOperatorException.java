package core_java_topics.exceptionHandling.ATMProject.customExceptions;

public class NotAOperatorException extends Exception{

	public NotAOperatorException(String errorMsg) {
		super(errorMsg);
	}
}
