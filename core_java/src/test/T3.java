package test;

public class T3 {

	int id,age;
	String name, address;
	
	public T3(int age) {
		this.age = age;
		
	}
	public T3(int id, int age) {
		this(age);
		this.id = id;
	}
	public T3(int id, int age, String name, String address) {
		this(id,age);
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
		T3 t = new T3(105,22,"vikas","delhi");
		System.out.println("ID: "+t.id+" Name: "+t.name+" Age: "+t.age+" Address: "+t.address);
	}

}
