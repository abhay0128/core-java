package Java11;

import java.util.*;
import java.util.stream.Collectors;

public class StringLine {

	public static void main(String[] args) {
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank()).map(String::strip)
				.collect(Collectors.toList());
		System.out.println(lines);
		
		String line = multilineString.lines().filter(l -> !l.isBlank()).map(String::strip)
				.collect(Collectors.toList()).toString();
		System.out.println(line);
		
		
		String s = "          ";
		//s = s.repeat(4);
		System.out.println(s.repeat(4));
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
	}

}
