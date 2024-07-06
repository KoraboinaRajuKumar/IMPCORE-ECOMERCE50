package core_java_topics.exceptionHandling.customException;

public class TestAge {

	public static void main(String[] args) {
		
		try {
			validateAge(12);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Your age is not valid");
		}else {
			System.out.println("Your age is valid");
		}
	}
}
