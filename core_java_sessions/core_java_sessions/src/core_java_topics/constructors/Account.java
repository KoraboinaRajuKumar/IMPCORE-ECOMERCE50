package core_java_topics.constructors;

public class Account {

	public void method() {
		System.out.println("This example is without constructor");
	}
	public static void main(String[] args) {
		
		Account account = new Account();
		account.method();
	}
}
