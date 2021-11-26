package akshay.lambda.collections;

import java.util.Arrays;
import java.util.List;

public class ArryAsList {

	public static void main(String[] args) {
		
		String a[]= {"a","b"};
		
		List<String>  list =Arrays.asList(a);
		System.out.println(list.stream().count());
		list.forEach((item) -> {System.out.println(item);});
		

	}

}
