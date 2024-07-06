package core_java_topics.encapsulation.package2;

import core_java_topics.encapsulation.package1.RetailCustomerCreditLimit;

public class TestProtected extends RetailCustomerCreditLimit{

	public static void main(String[] args) {
		
		TestProtected limit = new TestProtected();
		limit.displayCCLimit();
	}
}
