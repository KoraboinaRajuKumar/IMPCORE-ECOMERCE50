package core_java_topics.innerClasses.nonstaticInnerClass.anonymousInnerClass;

public class TestAnonymousInnerClass{

	public static void main(String[] args) {
		
		ITransferService service = new ITransferService() {
			
			@Override
			public void thirdPartyPayment() {
				System.out.println("This is third party paymner method.....");
				
			}
			
			@Override
			public void impsTransfer() {
				System.out.println("This is IMPS Transfer method.....");
				
			}
		};
		service.thirdPartyPayment();
		service.impsTransfer();

	}

}
