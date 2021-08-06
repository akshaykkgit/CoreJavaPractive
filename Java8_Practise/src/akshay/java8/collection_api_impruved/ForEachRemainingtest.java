package akshay.java8.collection_api_impruved;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingtest {
	
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        Iterator<String> iterator = fruits.iterator();
      //Before JAVA 8     
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator<String> iterator2 = fruits.iterator();
     //After JAVA 8    
        iterator2.forEachRemaining(fruit -> System.out.println(fruit));
        

	}

}
