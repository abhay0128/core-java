package core;

public class Child extends Parent{
	
	public String car="SUVCar";
	public long bankBalance=500000000;
	public String house="BigHouse";
	
	public Child() {
		System.out.println("child default consturctor");
	}
	
	@Override
	public void useBasics() {
		System.out.println("child all basic facilities");
	}
	
	private void wallet() {
		System.out.println("childwallet");
	}
	
//	@Override
//	protected void getParentBike() {
//		System.out.println("child bike access");
//	}
	
//	@Override
//	void getParentCar() {
//		System.out.println("child car access");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
