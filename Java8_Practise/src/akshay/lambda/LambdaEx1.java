package akshay.lambda;

import java.util.ArrayList;

public class LambdaEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        
        arrL.forEach(n->System.out.println("All numbers \n"+n));
        System.out.println("printing event Numbers");
        arrL.forEach(n-> {if(n%2 == 0) System.out.println(n);});
	}

}
