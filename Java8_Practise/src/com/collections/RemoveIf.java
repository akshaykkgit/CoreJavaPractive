package com.collections;

import java.util.ArrayList;

public class RemoveIf {

	public static void main(String[] args) {
		 // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
  
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
  
        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));
  
        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }

	}

}
