package core_java_topics.polymorphism.runtimePolymorphism.methodoverriding.basicExm;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle twoWheeler = new TwoWheeler();
		Vehicle fourWheeler = new FourWheeler();
		twoWheeler.start();
		twoWheeler.stop();
		
		fourWheeler.start();
		fourWheeler.stop();
	}

}
