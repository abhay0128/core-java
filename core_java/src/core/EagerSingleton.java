package core;

public class EagerSingleton {

	// singleton instance, this instance is created in JVM during start of the application
	private static final EagerSingleton singletonInst = new EagerSingleton();
    
    private String message = "";
     
    private EagerSingleton() {
    	System.out.println("Eager Singleton instance created.");
    }
     
    public static EagerSingleton getInstance(){
        return singletonInst;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
}
