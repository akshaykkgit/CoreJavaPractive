package akshay.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExMatchAndFilter {

	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(70,80,90,100,30);
		boolean res1= integers.stream().anyMatch(n-> n%6==0);
		boolean res11= integers.stream().anyMatch(n-> {return n%6==0 ;});
		System.out.println(res1);
		
		boolean res2= integers.stream().allMatch(n->n%2==0);
		System.out.println(res2);
		boolean res3= integers.stream().noneMatch(n->n<0);
		System.out.println(res3);
		
		List<Integer> sortedintegers= integers.stream().sorted().collect(Collectors.toList());
		
		System.out.println("ascending");
		System.out.println(sortedintegers);
		List<Integer> sorteddescintegers= integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("descending");
		System.out.println(sorteddescintegers);
		
		

	}

}
