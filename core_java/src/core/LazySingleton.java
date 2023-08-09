package core;

public class LazySingleton {

	private static LazySingleton singletonInst;
    
    private String message = "";
     
    private LazySingleton() {
        System.out.println("Lazy Singleton instance created.");
    }
     
    public static LazySingleton getInstance(){
        if(singletonInst==null){
            singletonInst = new LazySingleton();
            System.out.println("LazySingleton instance created for the first time.");
        }
        return singletonInst;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

}
