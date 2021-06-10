package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;


public class ForEachIterators {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("Skype", "Facebook", "Instagram", "Twitter");   
		 Spliterator<String> namesSpliterator = names.spliterator();
		 System.out.println("Next Element Present?"+namesSpliterator.tryAdvance(n->
		 {
			 System.out.println(n);
		 }) );
		 
		 //Example 2
		 
		 System.out.println("Looping...........");
		 while(namesSpliterator.tryAdvance(n->{ System.out.println(n); })    );
		
		 

	}

}
