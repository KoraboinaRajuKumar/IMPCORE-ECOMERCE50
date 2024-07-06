package core_java_topics.abstraction.coupling.looseCoupling.realtimeExm;

public class DTHRecharge implements IRechargeService{

	@Override
	public void recharge() {
		System.out.println("This is DTH Recharge...");
	}

}
