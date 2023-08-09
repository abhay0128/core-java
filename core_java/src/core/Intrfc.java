package core;

public interface Intrfc {

	public void abstrctMeth();
	
	public default void defltMeth() {
		System.out.println("its default method");
	}
	

}
