package core_java_topics.exceptionHandling.ATMProject.cards;

import java.util.ArrayList;
import java.util.Collections;

import core_java_topics.exceptionHandling.ATMProject.customExceptions.InsufficientBalanceException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InsufficientMachineBalanceException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InvalidAmountException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.NotAOperatorException;
import core_java_topics.exceptionHandling.ATMProject.interfaces.IATMService;

public class AxisDebitCard implements IATMService{

	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type = "user";
	int chances;
	
	public AxisDebitCard(long debitCardNumber,String name, double accountBalance, int pinNumber) {
		super();
		chances = 3;
		this.name = name;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement = new ArrayList<>();
	}
	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		if(wthAmount<=0 || wthAmount%10!=0) {
			throw new InvalidAmountException("You cant enter zero(0) amount to withdraw. Please enter valid amount in multiple of 10");
		}else if(wthAmount>accountBalance) {
			throw new InsufficientBalanceException("You don't have sufficient balance to withdraw. Please check your balance");
		}else {
			accountBalance = accountBalance - wthAmount;
			statement.add("Debited : " + wthAmount);
			return wthAmount;
		}
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {

		if(dptAmount<=0 || dptAmount%10!=0) {
			throw new InvalidAmountException("Please deposit multiple of 100.");
		}else {
			accountBalance = accountBalance + dptAmount;
			statement.add("Credited : " + dptAmount);
		}
	}

	@Override
	public double checkAccountBalance() {
		return accountBalance;
	}
	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public int getPinNumber() {
		return pinNumber;
	}
	@Override
	public String getUserName() {
		return name ;
	}

	@Override
	public void decreaseChances() {
		--chances;
	}
	@Override
	public int getChances() {
		return chances;
	}

	@Override
	public void resetPinChances() {
		chances = 3;
	}

	@Override
	public void generateMiniStatement() {
		int count = 5;
		if(statement.size()==0) {
			System.out.println("There are no transaction happened to your account");
			return;
		}
		System.out.println("======== Last Five transactions =========");
		Collections.reverse(statement);
		for(String trans : statement) {
			if(count==0) {
				break;
			}
			System.out.println(trans);
			count--;
		}
		Collections.reverse(statement);
	}
}
