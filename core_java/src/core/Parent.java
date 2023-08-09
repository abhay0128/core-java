package core;

public class Parent implements Intrfc, In2 {

	public Parent(){
		System.out.println("parent default constructor");
	}
	public String car="SmallCar";
	public long bankBalance=100000000;
	public String house="OldHouse";
	
	public void useBasics() {
		System.out.println("parents all basic facilities");
	}
	
	private void wallet() {
		System.out.println("parentwallet");
	}
	
	protected void getParentBike() {
		System.out.println("parent bike access");
	}
	
	void getParentCar() {
		System.out.println("parent car access");
	}
	
	@Override
	public void abstrctMeth() {
		// TODO Auto-generated method stub
		
	}

}
