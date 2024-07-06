package core_java_topics.innerClasses.nonstaticInnerClass.localInnerClass.basicExm;

public class LocalInnerClassExm {

	//declare private data members
	private int number = 432;
	private String name = "Mohammed Kamran";
	
	//declare a method
	public void display() {
		//declare local inner class
		class LocalInnerClass{
			public void displayPrivateData() {
				System.out.println("Number : " + number);
				System.out.println("Name : " + name);
			}
		}
		//instantiate local inner class
		LocalInnerClass obj = new LocalInnerClass();
		obj.displayPrivateData();
	}
	
	public static void main(String[] args) {
		
		LocalInnerClassExm exm = new LocalInnerClassExm();
		exm.display();
	}
}
