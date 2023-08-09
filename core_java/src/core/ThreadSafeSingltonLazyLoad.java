package core;

public class ThreadSafeSingltonLazyLoad {

	private static ThreadSafeSingltonLazyLoad singletonInst;
    
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private ThreadSafeSingltonLazyLoad() {
        System.out.println("Singleton instance created.");
    }
     
    // the method which gives access to the only instance of SingletonCls, is thread safe
    public static synchronized ThreadSafeSingltonLazyLoad getInstance(){
        if(singletonInst==null){
            singletonInst = new ThreadSafeSingltonLazyLoad();
            System.out.println("ThreadSafeSingltonLazyLoad instance created for the first time.");
        }
        return singletonInst;
    }
 
    // getter for the variable message
    public String getMessage() {
        return message;
    }
 
    // setter for the variable message
    public void setMessage(String message) {
        this.message = message;
    }
}
