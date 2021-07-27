package akshay.java8.collection_api_impruved;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachInMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
	    map.put("C", "c");
	    map.put("B", "b");
	    map.put("Z", "z");
	    List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
	        .collect(Collectors.toList());
	    sortedByKey.forEach(System.out::println);
	    
	    
	 
	    map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	    
	    
	    map.putIfAbsent("B", "x");
	    System.out.println(map.get("B"));// prints "b"
	    
	    map.compute("B", (k, v) -> v.concat(" - new "));
	    System.out.println(map.get("B")); // prints "b - new"
	    
	    
	    map.merge("B", "NEW", (v1, v2) -> v1 + v2);
	    System.out.println(map.get("B")); 

	}

}
