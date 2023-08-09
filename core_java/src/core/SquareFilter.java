package core;

import java.util.ArrayList;
import java.util.List;

public class SquareFilter {

	public static void main(String[] args) {
		List<Integer> sq = new ArrayList<>();
		for(int i=1; i<=100; ++i) {
			sq.add(i);
		}
//		sq.stream().map(n->Math.sqrt(n)).filter(m->m%1==0).forEach(n->System.out.println(n));
		sq.stream().filter(m->Math.sqrt(m)%1==0).forEach(n->System.out.println(n));
	}

}
