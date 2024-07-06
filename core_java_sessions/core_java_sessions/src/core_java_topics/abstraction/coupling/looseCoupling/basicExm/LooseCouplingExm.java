package core_java_topics.abstraction.coupling.looseCoupling.basicExm;

public class LooseCouplingExm {

	public static void main(String[] args) {
		
		Show b = new B();
		Show c = new C();
		Show d = new D();
		Show e = new E();
		Show f = new F();
		
		A a = new A(b);
		a.display();
		
		A a2 = new A(c);
		a2.display();
		
		A a3 = new A(d);
		a3.display();
		
		A a4 = new A(e);
		a4.display();
		
		A a5 = new A(f);
		a5.display();
	}

}
