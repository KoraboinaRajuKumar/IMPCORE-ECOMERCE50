package core_java_topics.polymorphism.staticPolymorphism.methodOverLoading.basicExm;

public class Addition {

	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Addition of two number : " + Addition.add(10, 20));
		System.out.println("Addition of two number : " + Addition.add(10.5,10));
	}
}
