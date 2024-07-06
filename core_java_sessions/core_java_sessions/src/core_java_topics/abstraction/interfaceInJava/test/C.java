package core_java_topics.abstraction.interfaceInJava.test;

public class C implements A,B{

	@Override
	public void m() {
		System.out.println("this is m() method");
	}
	

	public static void main(String[] args) {
		
		C c = new C();
		c.m();
		
	}

	
}
