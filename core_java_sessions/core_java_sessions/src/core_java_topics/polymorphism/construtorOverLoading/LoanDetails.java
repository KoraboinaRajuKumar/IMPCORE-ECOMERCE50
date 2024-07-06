package core_java_topics.polymorphism.construtorOverLoading;

public class LoanDetails {

	public static void main(String[] args) {
		
		ConsumerLoan loan1 = new ConsumerLoan(123456789l,"Harendra",50000.0d, "21-05-2024", 2, 9.75d, "Consumer Loan", "Bank Of America");
		ConsumerLoan loan2 = new ConsumerLoan(987654321l, "Vishnu", 30000.0d, "25-05-2024",3, 10.25d, "Consumer Loan", "Bank Of America",1500.0d);
		
		loan1.displayLoanInfo();
		loan2.displayLoanInfo();

	}

}
