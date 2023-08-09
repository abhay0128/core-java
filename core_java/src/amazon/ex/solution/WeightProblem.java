package amazon.ex.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeightProblem {

	
	public static List<Integer> minimalHeaviestSetA(List<Integer> wt) {
        // arr = [3,7,5,6,2]
        List<Integer> result = new ArrayList<>();
        Collections.sort(wt);
        System.out.println(wt);
        
        List<Integer> awt = new ArrayList<>();
        awt.add(wt.get(wt.size()-1));
        List<Integer> bwt = new ArrayList<>();
        bwt.addAll(wt);
        bwt.remove(wt.size()-1);
        int aw=0;
        int bw=0;
        for(int i=0; i<bwt.size();i++) {
        	bw = bw+ bwt.get(i);
        }
        System.out.println("bw:"+bw);
        System.out.println("bwt:"+bwt);
        
        for(int i=wt.size()-1; i>1; i--) {
        	aw = wt.get(i);
        	if(aw<bw) {
        		aw = aw+wt.get(i);
        		bw = bw-wt.get(i);
        		awt.add(wt.get(i));
        		bwt.remove(wt.get(i));
        	}
        	
        }
        
        result.addAll(awt);
        System.out.println("aw:"+aw);
        System.out.println(result);
        return result;
    }
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3,7,5,6,2);
		minimalHeaviestSetA(arr);

	}

}

