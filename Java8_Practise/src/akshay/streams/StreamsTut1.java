package akshay.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTut1 {

	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(12,13,14,15);
		
		List<Integer> square = numbers.stream().map(x-> x*x).collect(Collectors.toList());

		System.out.println(square);
		
		
		
		Stream.iterate(0, n-> n+2).peek(num -> System.out.println("Peak Number at One : "+num)).limit(5).forEach(System.out::println);
	}

}
