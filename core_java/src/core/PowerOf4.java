package core;

public class PowerOf4 {
	
	public static boolean isPowerOf4(int n) {
		if(n==0) return false;
		while(n!=1) {
			if(n%4!=0) return false;
			n = n/4;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOf4(28));
	}

}
