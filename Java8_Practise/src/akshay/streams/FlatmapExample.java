package akshay.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {

	public static void main(String[] args) {
		
		List<Integer> lst1 =Arrays.asList(1,2);
		List<Integer> lst2 =Arrays.asList(3,4);
		List<Integer> lst3 =Arrays.asList(5,6);
		
		List<List<Integer>> complist =Arrays.asList(lst1,lst2,lst3);
		System.out.println(complist);
		List<Integer> finallist= complist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(finallist);
		
		List<Integer> finallist2= complist.stream().flatMap(x->x.stream()).map(n->n+10).collect(Collectors.toList());
		System.out.println(finallist2);
		
		

	}

}
