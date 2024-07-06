package core_java_topics.exceptionHandling;

public class ExceptionExm1 {

	public static void main(String[] args) {
		System.out.println("Important code 1");
		System.out.println("Important Code 2");
		try {
			int a = 20/0;
			System.out.println("Number after division : " + a);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Important Code 3");
		System.out.println("Important Code 4");
	}

}
