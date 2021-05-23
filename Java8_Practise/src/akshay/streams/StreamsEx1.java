package akshay.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
			
		//Using Stream and Lambda expression .
		long count = names.stream().filter(str-> str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");
		
		
		List<Integer> l=names.stream().map(n->n.length()).collect(Collectors.toList());
		l.forEach(System.out::println);

	}

}
