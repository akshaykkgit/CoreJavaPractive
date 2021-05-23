package akshay.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample1 {

	public static void main(String[] args) {
		List<Integer> integers =Arrays.asList(11,88,77,66,33);
		System.out.println(integers);
		
		Collections.sort(integers, (o1,o2)-> (o1> o2) ? -1 :(o1<o2)? 1:0);
		System.out.println("agter sorting");
		System.out.println(integers);
	}

}
