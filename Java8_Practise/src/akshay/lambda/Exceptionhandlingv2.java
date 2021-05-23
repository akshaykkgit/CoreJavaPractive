package akshay.lambda;

import java.util.function.BiConsumer;

public class Exceptionhandlingv2 {

	public static void main(String[] args) {
  int  arr[] = {1,2,3,4,5};
  int key=2;
  processkey(arr, key,(v,k) ->System.out.println(v/k));
	}
	
	
	
	
	public static void processkey(int[] arr,int key,BiConsumer<Integer, Integer> biConsumer) {
		
		for(int a: arr ) {
			//System.out.println(a);
			biConsumer.accept(arr, key);
		}
		
	}

	
	public static BiConsumer<Integer, Integer> wrapperlambda(BiConsumer<Integer, Integer> consumer){
		
		return (v,k) -> {
			consumer.accept(v, k);;
		};
		
	}
	
	
	
}
