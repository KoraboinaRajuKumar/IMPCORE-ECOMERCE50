package core_java_topics.abstraction.coupling.looseCoupling.realtimeExm;

public class MobileRecharge implements IRechargeService{

	@Override
	public void recharge() {
		System.out.println("This is Mobile Recharge...");
	}

}
