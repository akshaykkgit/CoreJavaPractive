package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForeachRemaining {
	
	public static void main(String[] args) {
		
		//Old Code
		 List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		 Iterator<Integer> itr =input.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //New Code
		 System.out.println("New Code");
		 List<Integer> input1 = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11,-5,-77);
		 Iterator<Integer> itr1 = input1.iterator();
		 itr1.forEachRemaining(num -> System.out.println(num));
		 

	}

}
