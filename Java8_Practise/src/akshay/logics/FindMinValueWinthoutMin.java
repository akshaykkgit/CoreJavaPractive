package akshay.logics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinValueWinthoutMin {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(88,5,6,89,1);
		List <Integer> mins= list.stream().sorted().collect(Collectors.toList());
	    System.out.println(mins.get(0));

	}

}
