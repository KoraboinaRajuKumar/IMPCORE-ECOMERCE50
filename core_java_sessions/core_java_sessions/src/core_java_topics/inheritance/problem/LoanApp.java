package core_java_topics.inheritance.problem;

public class LoanApp {

	public static void main(String[] args) {
		BusinessLoan businessLoan = new BusinessLoan();
		ConsumerLoan consumerLoan = new ConsumerLoan();
		GoldLoan goldLoan = new GoldLoan();
		TwoWheelerLoan twoWheelerLoan = new TwoWheelerLoan();
		
		businessLoan.setLoan_number(123456789l);
		businessLoan.setApplicant_name("Manish");
		businessLoan.setAddress("Pune Address");
		businessLoan.setLoan_type("Business Loan");
		businessLoan.setProcessing_fee(2.0d);
		businessLoan.setDisbursal_date("13-05-2024");
		businessLoan.setLoan_amount(500000.0d);
		businessLoan.setRate_of_interest(12.75);
		businessLoan.setTenure(3);
		
		consumerLoan.setLoan_number(987654321l);
		consumerLoan.setApplicant_name("Avinash");
		consumerLoan.setAddress("Mumbai Address");
		consumerLoan.setLoan_type("Consumer Loan");
		consumerLoan.setDisbursal_date("13-05-2024");
		consumerLoan.setLoan_amount(25000.0d);
		consumerLoan.setRate_of_interest(10.75);
		consumerLoan.setTenure(2);
		
		goldLoan.setLoan_number(764590634l);
		goldLoan.setApplicant_name("Geeta");
		goldLoan.setAddress("Hyderabad Address");
		goldLoan.setDisbursal_date("13-05-2024");
		goldLoan.setLoan_amount(200000.0d);
		goldLoan.setRate_of_interest(7.50);
		
		twoWheelerLoan.setLoan_number(674093497l);
		twoWheelerLoan.setApplicant_name("Harendra");
		twoWheelerLoan.setAddress("Chennai Address");
		twoWheelerLoan.setLoan_amount(150000.0d);
		twoWheelerLoan.setRate_of_interest(9.0);
		twoWheelerLoan.setTenure(3);

		System.out.println("===================== Business Loan =====================");
		System.out.println("Loan Number : " + businessLoan.getLoan_number());
		System.out.println("Applicant Name : " + businessLoan.getApplicant_name());
		System.out.println("Address : " + businessLoan.getAddress());
		System.out.println("Loan Type : " + businessLoan.getLoan_type());
		System.out.println("Disbursal Date : " + businessLoan.getDisbursal_date());
		System.out.println("Rate Of Interest : " + businessLoan.getRate_of_interest());
		System.out.println("Tenure : " + businessLoan.getTenure());
		System.out.println("Processing Fee : " + businessLoan.getProcessing_fee());
		System.out.println("Loan Amount : " + businessLoan.getLoan_amount());
		
		System.out.println("===================== Consumer Loan =====================");
		System.out.println("Loan Number : " + consumerLoan.getLoan_number());
		System.out.println("Applicant Name : " + consumerLoan.getApplicant_name());
		System.out.println("Address : " + consumerLoan.getAddress());
		System.out.println("Loan Type : " + consumerLoan.getLoan_type());
		System.out.println("Disbursal Date : " + consumerLoan.getDisbursal_date());
		System.out.println("Rate Of Interest : " + consumerLoan.getRate_of_interest());
		System.out.println("Tenure : " + consumerLoan.getTenure());
		System.out.println("Loan Amount : " + consumerLoan.getLoan_amount());
		
		System.out.println("===================== Gold Loan =====================");
		System.out.println("Loan Number : " + goldLoan.getLoan_number());
		System.out.println("Applicant Name : " + goldLoan.getApplicant_name());
		System.out.println("Address : " + goldLoan.getAddress());
		System.out.println("Disbursal Date : " + goldLoan.getDisbursal_date());
		System.out.println("Rate Of Interest : " + goldLoan.getRate_of_interest());
		System.out.println("Loan Amount : " + goldLoan.getLoan_amount());
		
		System.out.println("===================== Two Wheeler Loan =====================");
		System.out.println("Loan Number : " + twoWheelerLoan.getLoan_number());
		System.out.println("Applicant Name : " + twoWheelerLoan.getApplicant_name());
		System.out.println("Address : " + twoWheelerLoan.getAddress());
		System.out.println("Rate Of Interest : " + twoWheelerLoan.getRate_of_interest());
		System.out.println("Loan Amount : " + twoWheelerLoan.getLoan_amount());
		System.out.println("Tenure : " + twoWheelerLoan.getTenure());
	}

}
