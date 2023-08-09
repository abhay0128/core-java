package core;

import java.util.*;
import java.util.Map;

public class StringDup {

	public static void main(String[] args) {
		String str = "Programminggmm";
		
		String[] arr=str.split("");
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					if(count>1)
						map.put(arr[i], count);
				}
			}
		}
		
		System.out.println(map);
		
	}

}
