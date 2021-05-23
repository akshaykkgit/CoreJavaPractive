package akshay.functionalpgm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExPredicate {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("akshay","shilpa","arun");
		Predicate<String> data =(s) ->s.startsWith("a");
		for(String str:data) {
			if(str.test(str)) {
				
			}
		}

	}

}
