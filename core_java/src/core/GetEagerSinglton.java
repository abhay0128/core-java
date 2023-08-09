package core;

public class GetEagerSinglton {

	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
        instance.setMessage("This message is set in main of GetEagerSinglton");
        displayMsg();
    }
     
    public static void displayMsg(){
    	EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance.getMessage());
    }

}
