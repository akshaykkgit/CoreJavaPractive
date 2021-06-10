package com.collections;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
        
        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);
              
        // Obtain a Stream to the array list.
        Stream<Integer> str = al.stream();
        
        Spliterator<Integer> splitr1 =str.spliterator();
        
        // estimateSize method
       // Spliterators can provide an estimate of the number of remaining elements via the estimateSize() method
        System.out.println("estimate size : " + splitr1.estimateSize());
        
     // getExactSizeIfKnown method
       // Convenience method that returns estimateSize() if this Spliterator is SIZED
        System.out.println("exact size : " + splitr1.getExactSizeIfKnown());
        
        // hasCharacteristics and characteristics method
        System.out.println(splitr1.hasCharacteristics(splitr1.characteristics()));
        
        System.out.println("Content of arraylist :");
        // forEachRemaining method    
        splitr1.forEachRemaining((n) -> System.out.println(n));
        
     // Obtaining another  Stream to the array list.
        Stream<Integer> str1 = al.stream();
        splitr1 = str1.spliterator();
        
        // trySplit() method
        Spliterator<Integer> splitr2 = splitr1.trySplit();
        
        // If splitr1 could be split, use splitr2 first.
        if(splitr2 != null) {
        System.out.println("Output from splitr2: ");
        splitr2.forEachRemaining((n) -> System.out.println(n));
        
        // Now, use the splitr
        System.out.println("\nOutput from splitr1: ");
        splitr1.forEachRemaining((n) -> System.out.println(n));
              
        }
  
          
        
        
	}

}
