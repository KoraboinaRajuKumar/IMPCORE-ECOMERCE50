package core_java_topics.constructors.parameterizedConstructor;

public class BOFAStudentCheckingAccountDetails {

	public static void main(String[] args) {
		
		BOFAStudentCheckingAccount account1 = new BOFAStudentCheckingAccount(123456789l,"Samapath", "Chennai Branch", "Chennai City","sampath@gmail.com", 10000.0d, 
				5.70d, "Land Mark 1", "Land Mark 2","CH5345TN", 45000.0d);
		BOFAStudentCheckingAccount account2 = new BOFAStudentCheckingAccount(987654321l,"Sai", "Hyderabad Branch", "Hyderabad City","sai@gmail.com", 5000.0d, 
				7.70d, "Land Mark 1", "Land Mark 2","HY8967TN", 62500.0d);
		
		account1.displayBSCAInfo();
		account2.displayBSCAInfo();
	}
}
