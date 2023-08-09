package core;

import anotherPackage.CousinChild;

public class Ovrride {

	public static void main(String[] args) {
		
		Child ch = new Child();
//		Parent p = new Parent();
		Parent pRef = new Child();
		
		CousinChild cc = new CousinChild();
		Parent cp = new CousinChild();
		
		System.out.println(cp.car);
		System.out.println(cp.bankBalance);
		System.out.println(cp.house);
		cp.getParentBike();
		cp.getParentCar();
	}

}
