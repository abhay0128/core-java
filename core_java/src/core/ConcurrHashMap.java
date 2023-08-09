package core;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		chm.put("abc", "xyz");
		chm.put("rfv", "wsx");
		
	}

}
