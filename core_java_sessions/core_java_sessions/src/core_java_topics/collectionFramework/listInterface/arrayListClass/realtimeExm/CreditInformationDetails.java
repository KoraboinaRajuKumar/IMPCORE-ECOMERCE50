package core_java_topics.collectionFramework.listInterface.arrayListClass.realtimeExm;

import java.util.ArrayList;

public class CreditInformationDetails {

	public static void main(String[] args) {
		
		ArrayList<CreditInformationReport> listOfCredit = new ArrayList<CreditInformationReport>();
		listOfCredit.add(new CreditInformationReport("Mohammed Kamran", 7207513883l, "12-12-86/2b", "kamran@gmail.com","Home Loan", "HL0006746","Co-applicant",
				0, 0, 2400000.0d, 50000.0d, 175000.0d));
		listOfCredit.add(new CreditInformationReport("Mohammed Kamran", 7207513883l, "12-12-86/2b", "kamran@gmail.com","Two Wheeler Loan", "TW65767","Individual",
				0, 0, 90000.0d, 2300.0d, 1850.0d));
		listOfCredit.add(new CreditInformationReport("Mohammed Kamran", 7207513883l, "12-12-86/2b", "kamran@gmail.com","Two Wheeler Loan", "TW36536","Individual",
				0, 0, 75000.0d, 1200.0d, 1950.0d));
		listOfCredit.add(new CreditInformationReport("Mohammed Kamran", 7207513883l, "12-12-86/2b", "kamran@gmail.com","Consumer Loan", "CL356464","Individual",
				0, 0, 27999.0d, 800.0d, 1100.0d));
		listOfCredit.add(new CreditInformationReport("Mohammed Kamran", 7207513883l, "12-12-86/2b", "kamran@gmail.com","Personal Loan", "HD65467","Individual",
				0, 0, 1000000.0d, 5000.0d, 7200.0d));
		
		for(CreditInformationReport report : listOfCredit) {
			System.out.println(report);
		}

	}

}
