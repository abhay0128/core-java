package z0_815;

public class Test {

	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
		System.out.println(x);
	}

	public static void main(String[] args) {
		var a = 15;
		var b = 10;
		Test.addToInt(a, b);
		System.out.println(a);
		
	}

}