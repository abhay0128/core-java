package core;

public class Staircase {
	
	public static void staircas(int n) {
        String space = " ";
        String hash = "#";
        int spacelopcount = n-1;
        int hashcount = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<spacelopcount; j++){
                System.out.print(space);
            }
            spacelopcount--;
            for(int k=0; k<hashcount; k++) {
            	System.out.print(hash);
            }
            hashcount++;
            System.out.println();
        }

    }
	
	public static void main(String[] args) {
		staircas(4);

	}

}
