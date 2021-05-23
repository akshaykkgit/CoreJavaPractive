package akshay.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateEx1 {

	public static void main(String[] args) {
	
		
		List<String> strings = Arrays.asList("a","b","a","d","b");
		List<String> distinct =strings.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinct);
		
		long count = strings.stream().distinct().count();
		System.out.println("total="+count);
		
		//limit
		List<String> limited = strings.stream().limit(2).collect(Collectors.toList());
		System.out.println(limited);
		
		//min
		
		List<Integer> intgrs = Arrays.asList(1,2,55,33);
		Optional<Integer> min=intgrs.stream().min((v1,v2) -> v1.compareTo(v2));
		System.out.println("min value=" +min.get());
		
		Optional<Integer> max=intgrs.stream().max((v1,v2) -> v1.compareTo(v2));
		System.out.println("min value=" +max.get());
		
		Optional<Integer> reduced=intgrs.stream().reduce((value, accumulator) ->{return accumulator +value; });
		System.out.println("min value=" +reduced.get());
		
		
		
		
		
		
		
		

	}

}
