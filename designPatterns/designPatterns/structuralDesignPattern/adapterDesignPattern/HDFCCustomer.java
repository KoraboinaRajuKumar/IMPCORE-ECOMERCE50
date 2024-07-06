package designPatterns.structuralDesignPattern.adapterDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HDFCCustomer extends HDFCCustomerAccount implements BankOfAmericaCreditCard{
	
	@Override
	public void giveCustomerDetails() {
		try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please enter the account number");
				Long acc_num = Long.parseLong(reader.readLine());
				System.out.println("Please enter bank name");
				String b_name = reader.readLine();
				System.out.println("Please enter account holder name");
				String ac_cust_name = reader.readLine();
				System.out.println("Please enter address line 1");
				String a_line1 = reader.readLine();
				System.out.println("Please enter address line 2");
				String a_line2 = reader.readLine();
				System.out.println("Please enter city");
				String city = reader.readLine();
				System.out.println("Please enter state");
				String state = reader.readLine();
				System.out.println("Please enter your mobile number");
				Long m_num = Long.parseLong(reader.readLine());
				System.out.println("Please enter account balance");
				Double balance = Double.parseDouble(reader.readLine());
				
				setAcc_number(acc_num);
				setBank_name(b_name);
				setAcc_holder_name(ac_cust_name);
				setAddress_line1(a_line1);
				setAddress_line2(a_line2);
				setCity(city);
				setState(state);
				setPrimaryPhoneNumber(m_num);
				setAcc_balance(balance);
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String issueCreditCard() {
		double balance = getAcc_balance();
		String customerName = getAcc_holder_name();
		if(balance > 100000.0d) {
			return "Please issue Customized Cash Rewards credit card  to : " + customerName;
		}else {
			return "As per the bank policy, your balance is low and sorry for inconvinience.";
		}
	}

}
