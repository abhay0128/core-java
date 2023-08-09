package core;

public class GetLazySinglton {
	
	public static void main(String[] args) {
        System.out.println("Starting of GetLazySinglton..");
        LazySingleton instance = LazySingleton.getInstance();
        instance.setMessage("This message is set in main of GetLazySinglton");
        displayMsg();
    }
     
    public static void displayMsg(){
        // SingletonCls.getInstance() gets the instance that is already created during the call in main() method, for the first time.
    	LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance.getMessage());
    }
}
