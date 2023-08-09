package test;

public class T1 {

	T1(int a, int b){
		System.out.println("a = "+a+" b = "+b);
	}
	T1(int a, float b){
		System.out.println("a = "+a+" b = "+b);
	}
	public static void main(String[] args) {
		byte a = 10;
		byte b = 15;
		T1 t1 = new T1(a,b);

	}

}
