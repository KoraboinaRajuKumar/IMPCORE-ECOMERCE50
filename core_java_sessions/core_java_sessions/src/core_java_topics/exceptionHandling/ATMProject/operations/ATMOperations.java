package core_java_topics.exceptionHandling.ATMProject.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import core_java_topics.exceptionHandling.ATMProject.cards.AxisDebitCard;
import core_java_topics.exceptionHandling.ATMProject.cards.HDFCDebitCard;
import core_java_topics.exceptionHandling.ATMProject.cards.OperatorCard;
import core_java_topics.exceptionHandling.ATMProject.cards.SBIDebitCard;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.IncorrectPinLimitReachedException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InsufficientBalanceException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InsufficientMachineBalanceException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InvalidAmountException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InvalidCardException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.InvalidPinException;
import core_java_topics.exceptionHandling.ATMProject.customExceptions.NotAOperatorException;
import core_java_topics.exceptionHandling.ATMProject.interfaces.IATMService;

public class ATMOperations {

	public static double ATM_MACHINE_BALANCE = 100000.0d;
	public static ArrayList<String> ACTIVITY = new ArrayList<>();
	public static HashMap<Long,IATMService> dataBase = new HashMap<>();
	public static boolean MACHINE_ON = true;
	public static IATMService card;
	
	//to validate the inserted card
	public static IATMService validateCard(long cardNumber) throws InvalidCardException{
		if(dataBase.containsKey(cardNumber)) {
			return dataBase.get(cardNumber);
		}else {
			ACTIVITY.add("Accessed by : " + cardNumber + " is not compatible");
			throw new InvalidCardException("This is not a valid card");
		}
	}
	
	// To check the activities performed on the ATM Machine
	public static void checkATMMachineActivities() {
		System.out.println("================ Activities Performed =====================");
		for(String activity : ACTIVITY) {
			System.out.println("====================================================================");
			System.out.println(activity);
			System.out.println("=====================================================================");
		}
	}
	
	//To reset number of attempts chances
	public static void resetUserAttempts(IATMService operatorCard) {
		IATMService card = null;
		long number;
		int pin;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your card");
		number = scanner.nextLong();
		try {
			card = validateCard(number);
			card.resetPinChances();
		}catch(InvalidCardException ive) {
			System.out.println(ive.getMessage());
		}
		ACTIVITY.add("Accessed by : " + operatorCard.getUserName() + " to reset number of chances for user.");
	}
	//to validate the normal user credentials
	public static  IATMService validateCredentials(long cardNumber,int pinNumber) 
			throws InvalidCardException,IncorrectPinLimitReachedException, InvalidPinException{
		if(dataBase.containsKey(cardNumber)) {
			card = dataBase.get(cardNumber);
		}else {
			throw new InvalidCardException("This card is not valid card..");
		}try {
			if(card.getUserType().equals("operator")) {
				if(card.getPinNumber()!=pinNumber) {
					throw new InvalidPinException("Dear operator please enter correct PIN Number");
				}else {
					return card;
				}
			}
		}catch (NotAOperatorException noe) {
			noe.printStackTrace();
		}if(card.getChances()<=0) {
			throw new IncorrectPinLimitReachedException("You have reached wrong limit of PIN Number, which is 3 attempts");
		}if(card.getPinNumber()!=pinNumber) {
			card.decreaseChances();
			throw new InvalidPinException("You have entered wrong pin number");
		}else {
			return card;
		}
	}
	//to check the balance/cash in the ATM Machine
	public static void validateAmount(double amount) throws InsufficientMachineBalanceException{
		if(amount>ATM_MACHINE_BALANCE) {
			throw new InsufficientMachineBalanceException("Insufficient cash in the Machine..");
		}
	}
	//this is to validate deposit amount in the ATM Machine
	public static void validateDepositAmount(double amount) throws InsufficientMachineBalanceException{
		if(amount+ATM_MACHINE_BALANCE>200000.0d) {
			ACTIVITY.add("Unable to deposit the cash in the Machine..");
			throw new InsufficientMachineBalanceException("You cant deposit cash as the limit of Machine is reached..");
		}
	}
	
	//this is for Operator activities
	public static void operatorMode(IATMService card) {
		Scanner scanner = new Scanner(System.in);
		double amount;
		boolean flag = true;
		while(flag) {
			System.out.println("OPERATOR MODE : Operator Name : " + card.getUserName());
			System.out.println("==================================================================");
			System.out.println("||               0. Switch Off The Machine                       ||");
			System.out.println("||               1. To check the ATM Machine Balance             ||");
			System.out.println("||               2. Deposit cash in the Machine                  ||");
			System.out.println("||               3. Reset The User PIN Attempts                  ||");
			System.out.println("||               4. To check Acitivites performed on the Machine ||");
			System.out.println("||               5. Exit Operator Mode                           ||");
			
			System.out.println("Please enter the choice");
			int option = scanner.nextInt();
			switch(option) {
			case 0 :
				     MACHINE_ON = false;
				     ACTIVITY.add("Accessed by " + card.getUserName() + " Acitvity Performed is : Switching Off the ATM Machine");
				     flag = false;
				     break;
			case 1 :
					ACTIVITY.add("Accessed by " + card.getUserName() + " Acitvity Performed is : Checking ATM Machine Balance");
					System.out.println("The Balance of ATM Machine is : " + ATM_MACHINE_BALANCE + " is avaialable");
					break;
			case 2 :
					System.out.println("Please enter the amount to deposit");
					amount = scanner.nextDouble();
					ATM_MACHINE_BALANCE = ATM_MACHINE_BALANCE+amount;
					ACTIVITY.add("Accessed by " + card.getUserName() + " Acitvity Performed is : Depositing Cash in the ATM Machine");
					System.out.println("===========================================================================================");
					System.out.println("=========================== Cash added in the ATM =========================================");
					System.out.println("===========================================================================================");
					break;
			case 3 :
					resetUserAttempts(card);
					System.out.println("========================================================");
					System.out.println("========= user pin attempts is reset ===================");
					System.out.println("========================================================");
					ACTIVITY.add("Accessed by " + card.getUserName() + " Acitvity Performed is : Reset the PIN attempts of User");
					break;
			case 4 :
				    checkATMMachineActivities();
				    break;
				    
			case 5 :
				    flag = false;
				    break;
		    default :
		    	    System.out.println("You have entered wrong option");
			}
		}
	}
	public static void main(String[] args) {
		
		dataBase.put(222222222l, new AxisDebitCard(222222222l, "Yashas", 50000.0d, 2222));
		dataBase.put(333333333l, new SBIDebitCard(333333333l, "Das", 45000.0d, 3333));
		dataBase.put(444444444l, new AxisDebitCard(444444444l, "Aravind", 32500.0d, 4444));
		dataBase.put(555555555l, new HDFCDebitCard(555555555l, "Akshay", 71000.0d, 5555));
		dataBase.put(111111111l, new OperatorCard(111111111l, 1111, "Operator 1"));

		int option = 0;
		String nextOption = null;
		long cardNumber = 0;
		double depositAmount = 0.0d;
		double withdrawAmount = 0.0d;
		int pin = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(MACHINE_ON) {
			System.out.println("Please enter the debit card");
			cardNumber = scanner.nextLong();
			try {
				    System.out.println("Please enter pin number");
				    pin = scanner.nextInt();
				    card = validateCredentials(cardNumber, pin);
				    ACTIVITY.add("Accessed By : " + card.getUserName() + " Status : Accessed Approved");
			}catch (InvalidPinException ine) {
				ACTIVITY.add("Accessed By : " + card.getUserName() + " Status : Accessed Denied");
				System.out.println(ine.getMessage());
				continue;
			}catch (InvalidCardException ice) {
				ACTIVITY.add("Accessed By : " + card.getUserName() + " Status : Accessed Denied due to invalid card");
				System.out.println(ice.getMessage());
				continue;
			}catch (IncorrectPinLimitReachedException ipe) {
				ACTIVITY.add("Accessed By : " + card.getUserName() + " Status : Reached Maximum attempts to login");
				System.out.println(ipe.getMessage());
				continue;
			}
			try {
				   if(card.getUserType().equals("operator")) {
					   operatorMode(card);
					   continue;
				   }
				   start : while(true) {
					    System.out.println("==================================================================");
						System.out.println("||               1. Withdraw Amount                             ||");
						System.out.println("||               2. Deposit Amount                              ||");
						System.out.println("||               3. Check Balance                               ||");
						System.out.println("||               4. Change Pin                                  ||");
						System.out.println("||               5. Mini Statement                              ||");
						System.out.println("==================================================================");
						System.out.println("Please enter the choice");
						option = scanner.nextInt();
						try {
							 switch(option) {
							 case 1 :
								  	System.out.println("Please enter the amount to withdraw");
								  	withdrawAmount = scanner.nextDouble();
								  	validateAmount(withdrawAmount);
								  	card.withdrawAmount(withdrawAmount);
								  	ATM_MACHINE_BALANCE = ATM_MACHINE_BALANCE - withdrawAmount;
								  	ACTIVITY.add("Accessed By " + card.getUserName() + " Activity : Amount Withdrawn " + withdrawAmount + " From the Machine");
								  	break;
							 case 2 :
								  	System.out.println("Please enter the amount to deposit");
								  	depositAmount = scanner.nextDouble();
								  	validateDepositAmount(depositAmount);
								  	ATM_MACHINE_BALANCE = ATM_MACHINE_BALANCE + depositAmount;
								  	card.depositAmount(depositAmount);
								  	ACTIVITY.add("Accessed By " + card.getUserName() + " Activity : Amount deposited " + depositAmount + " in the Machine");
								  	break;
							 case 3 :
								  	System.out.println("Your Account Balance is : " + card.checkAccountBalance());
								  	ACTIVITY.add("Accessed By " + card.getUserName() + " Activity : Checking the balance ");
								  	break;
							 case 4:
								    System.out.println("Enter a new Pin");
								    pin = scanner.nextInt();
								    card.changePinNumber(pin);
								    ACTIVITY.add("Accessed By " + card.getUserName() + " Activity : Change PIN Number ");
								    break;
							 case 5 :
								    ACTIVITY.add("Accessed By " + card.getUserName() + " Activity : Generating Mini Statement ");
								    card.generateMiniStatement();
								    break;
						    default :
						    	   System.out.println("You have entered wrong option");
						    	   break;
								  	
							 }
							 System.out.println("Do you want to continue");
							 nextOption = scanner.next();
							 if(nextOption.equalsIgnoreCase("N")) {
								 break start;
							 }
						}catch (InvalidAmountException iae) {
							System.out.println(iae.getMessage());
						}catch (InsufficientBalanceException ise) {
							System.out.println(ise.getMessage());
						}catch (InsufficientMachineBalanceException ime) {
							System.out.println(ime.getMessage());
						}
				   }
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("======================================================================================");
			System.out.println("====================== Thanks For using ICICI ATM Machine ============================");
			System.out.println("=======================================================================================");
		}
	}
}