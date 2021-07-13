package akshay.sorting;

import java.util.Arrays;
import java.util.Collections;


public class AscendingAndDescending {
	
	public static void main(String[] args) {
		Integer[] a = {3,6,1,88,5};
		System.out.println("before sort");
		for(int val:a) {
			System.out.println(val);
		}
		
		System.out.println("after the sort");
		Arrays.sort(a);
		for(int val:a) {
			System.out.println(val);
		}
		System.out.println("after descending sort");
		Arrays.sort(a, Collections.reverseOrder());
		for(int val:a) {
			System.out.println(val);
		}
		
		
		
	    String s[] = {"akshay","shivil","arun","Preeju","Shilpa"};
	    
	    System.out.println("BEFORE SORT");
		 for(String str:s) {
		       System.out.println(str);
	    }
		Arrays.sort(s);
		System.out.println("AFER SORT");
	    for(String str:s) {
		       System.out.println(str);
	    }
	    System.out.println("DESCENDING OREDR");
	    Arrays.sort(s, Collections.reverseOrder());
	    for(String str:s) {
		       System.out.println(str);
	    }
	   
		
	}

}
