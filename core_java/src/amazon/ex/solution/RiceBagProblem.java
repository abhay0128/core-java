package amazon.ex.solution;

import java.util.*;

public class RiceBagProblem {

	public static void main(String[] args) {
		List<Integer> riceBag = Arrays.asList(3, 9, 4, 2, 16, 7, 256);
		//getMaxSize(riceBag);
		getPerfectSet(riceBag);
	}

	private static List<Set<Integer>> getPerfectSet(List<Integer> riceBag) {
		Collections.sort(riceBag);				// {2,3,4,9,16}
		List<Set<Integer>> perfectSetList = new ArrayList<>();
		
		int size = riceBag.size();
		for(int n : riceBag) {
			int temp = 0;
			HashSet<Integer> perfectSet = new HashSet<>();
			for(int i=1; i<size; i++) {
				if(n*n==riceBag.get(i)) {
					perfectSet.add(n);
					perfectSet.add(riceBag.get(i));
					temp = riceBag.get(i);
				}
				if(temp*temp==riceBag.get(i)) {
					perfectSet.add(riceBag.get(i));
					temp = riceBag.get(i);
				}
			}
			if(!perfectSet.isEmpty())
				perfectSetList.add(perfectSet);
			//System.out.println("set: "+perfectSet);
		}
		System.out.println("list: "+perfectSetList);
		int count = 0;
		for(Set<Integer> set : perfectSetList) {
			if(set.size()>count) {
				count = set.size();
			}
		}
		System.out.println("max perfect set size: "+count);
		return perfectSetList;
	}

	private static void getMaxSize(List<Integer> riceBag) {
		Collections.sort(riceBag);				// {2,3,4,9,16}
		HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for(int i: riceBag){
           int tmp = 0;
           tmp = map.getOrDefault(i, 0)+1;
           map.put(i*i,tmp); 
           max = Math.max(tmp, max);
           System.out.println(map);
        }    
        System.out.println(max);
		
	}

}
// Solution: 1. sort the list
// 2. saving square of each value in a map( as key and value as 1) and before storing in map checking that 
//    if that key is already in the map(using getOrDefault(key, defaultValue) ), if yes increase the value by 1 
//    and if not store with default value 1.