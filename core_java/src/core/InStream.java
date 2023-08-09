package core;

import java.util.Optional;
import java.util.stream.Stream;

public class InStream {

	public static void main(String[] args) {
//		Stream<Integer> ins=Stream.iterate(0,i->i+2).limit(100);
		Stream<Integer> in = Stream.of(12,34,11,23,12,345,67,784,9,7,67,45,34,23,23,45,32,54);
		
		Stream<String> st = Stream.of("sdf","sdf","tyh","rthr");
		
		//st.sorted().forEach(System.out::println);
//		in.forEach(System.out::println);
		Optional<Integer> f=in.sorted().findFirst();
		System.out.println(f.get());
	}

}
