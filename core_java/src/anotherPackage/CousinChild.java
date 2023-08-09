package anotherPackage;

import core.Parent;

public class CousinChild extends Parent{

	public String car="SportsCar";
	public long bankBalance=700000000;
	public String house="VillaHouse";
	
	public CousinChild() {
		System.out.println("cousin child default consturctor");
	}
	
	@Override
	public void useBasics() {
		System.out.println("CousinChild all basic facilities");
	}
	
	private void wallet() {
		System.out.println("CousinChild wallet");
	}
	
	@Override
	protected void getParentBike() {
		System.out.println("CousinChild bike access");
	}
	
//	@Override
//	void getParentCar() {
//		System.out.println("CousinChild car access");
//	}
	
	public static void main(String[] args) {
		CousinChild cc = new CousinChild();
		Parent cp = new CousinChild();
		
		System.out.println(cc.car);
		System.out.println(cc.bankBalance);
		System.out.println(cc.house);
		cc.getParentBike();
	}
}
