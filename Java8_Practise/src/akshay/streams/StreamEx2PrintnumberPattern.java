package akshay.streams;

import java.util.stream.Stream;

public class StreamEx2PrintnumberPattern {

	public static void main(String[] args) {
		
		
		Stream.iterate(1, n->n+1).filter(n->n%3==0).limit(6).forEach(System.out ::println);
		
		

	}

}
