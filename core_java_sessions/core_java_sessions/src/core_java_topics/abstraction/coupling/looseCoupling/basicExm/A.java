package core_java_topics.abstraction.coupling.looseCoupling.basicExm;

public class A {

	Show s;
	
	public A(Show s) {
		this.s = s;
	}
	
	public void display() {
		s.display();
	}
}
