package core_java_topics.exceptionHandling.ATMProject.cards;

import core_java_topics.exceptionHandling.ATMProject.customExceptions.*;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InsufficientMachineBalanceException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InvalidAmountException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.NotAOperatorException;
import core_java_topics.exceptionHandling.ATMProject.interfaces.IATMService;

public class OperatorCard implements IATMService{

	private int pinNumber;
	private long id;
	private String name;
	private final String type ="operator";// declared as final as this can't be changed
	
	public OperatorCard(long idn, int pin, String name) {
		id = idn;
		pinNumber = pin;
		this.name = name;
	}
	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
	
	}
	@Override
	public double checkAccountBalance() {
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void decreaseChances() {
		
	}

	@Override
	public int getChances() {
		return 0;
	}

	@Override
	public void resetPinChances() {
		
	}

	@Override
	public void generateMiniStatement() {
		
	}

}
