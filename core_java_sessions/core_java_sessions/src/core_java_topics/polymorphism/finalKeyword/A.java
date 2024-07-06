package core_java_topics.polymorphism.finalKeyword;

public class A{

	final static int method1(int a , int b) {
		return a+b;
	}
	
	final static int method1(int a, int b, int c) {
		return a+b+c;
	}
	final static double method1(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Addition of 2 numbers : " + A.method1(10, 20));
		System.out.println("Addition of 3 numbers : " + A.method1(10, 20, 30));
		System.out.println("Addition of 2 double numbers : " + A.method1(10.5, 10.5));
	}
}
