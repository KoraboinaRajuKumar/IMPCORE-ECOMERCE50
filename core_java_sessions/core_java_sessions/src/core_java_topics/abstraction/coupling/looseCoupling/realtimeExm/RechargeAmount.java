package core_java_topics.abstraction.coupling.looseCoupling.realtimeExm;

public class RechargeAmount {

	IRechargeService rechargeService;
	
	public RechargeAmount(IRechargeService rechargeService) {
		this.rechargeService = rechargeService;
	}
	
	public void rechargeBill(long number, double amount) {
		rechargeService.recharge();
		System.out.println("The amount " + amount +  " is recharged..." + number);
	}
}
