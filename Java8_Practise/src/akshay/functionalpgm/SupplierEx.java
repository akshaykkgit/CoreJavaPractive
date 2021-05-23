package akshay.functionalpgm;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () ->
		new Integer((int)(Math.random()*1000D));
		System.out.println(supplier);

	}

}
