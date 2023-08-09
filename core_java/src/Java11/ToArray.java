package Java11;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		
		List<Integer> sampleList2 = Arrays.asList(23, 45, 56);
		Integer[] sampleArray2 = sampleList2.toArray(Integer[]::new);
		
	}

}
