package core_java_topics.polymorphism.staticPolymorphism.methodOverLoading.realtimeExm;

public class PhonePayApp {

	public static void main(String[] args) {
		
		BillAndRecharge.makePayment("KA 36 T 5109", "Mohammed Kamran", 5010005463l);
		BillAndRecharge.makePayment(7207513883l, "AirTel", 450, "16-07-204");
		BillAndRecharge.makePayment(123456789l, "HDFC Bank", 45000.0d, "20-05-2024", "20-06-2024");
		BillAndRecharge.makePayment(987654321l,453467l,7207513883l, "AirTel", 850.0d,"25-06-2024");
		PhonePayApp.main(100);
		PhonePayApp.main("Mohammed Kamran");
	}
	
	//we can overload main method as well. by just changing the parameter
	public static void main(int number) {
		System.out.println("The number is : " + number);
	}
	
	public static void main(String name) {
		System.out.println("Name is : " + name);
	}

}
