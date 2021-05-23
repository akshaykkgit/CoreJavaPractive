package akshay.functionalpgm;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;

public class TestFunctionInterface {

	public static void main(String[] args) {


		Function<Integer, Double> fun = (data)-> data/2.0; 
		System.out.println(fun.apply(100));
		
		
		IntFunction<String> getdayofweek = (day)-> {
			Map<Integer, String> map =new HashMap<>();
			map.put(1, "sun");
			map.put(2, "mon");
			map.put(3, "tue");
			map.put(4, "wed");
			
			if(map.get(day)!=null) {
				return  map.get(day);
			}else {
				return "inavlid";
			}
			
			
			
		
			
			
		};

		
		System.out.println("day:" + getdayofweek.apply(2) );
	}

}
