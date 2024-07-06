package core_java_topics.exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
        System.out.println("Important code 1");
		 try{
			 checkAge(10);
		 }catch (ArithmeticException ae) {
			 ae.printStackTrace();
		 }
		System.out.println("important code 2");
	}
	public static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("You are not eligible to cast vote");
		}else {
			System.out.println("You can cast your vote");
		}
	}

}
