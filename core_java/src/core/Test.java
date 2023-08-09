package core;

import java.util.ArrayList;
import java.util.List;

public abstract class Test {

	public static void main(String[] args) {
		List<String> logs = new ArrayList<>();
		logs.add("88 88 200");
		logs.add("99 99 300");
		logs.add("12 12 15");
		logs.add("88 99 500");
		logs.add("99 12 700");
		logs.add("99 12 700");
		logs.add("12 88 150");
		
		/*
		 * logs.forEach(e->{ String[] sarr = e.split(" "); if(sarr[0].length()>9 ||
		 * sarr[1].length()>0 || sarr[2].length()>9) { throw new
		 * RuntimeException("validation failed!"); }
		 * 
		 * });
		 */
		
		int x = 3 & 5;
		int y = 3 | 5;
		System.out.println(x+" : "+ y);
	}

}
