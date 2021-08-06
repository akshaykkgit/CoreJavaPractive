package akshay.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx {
	
	private void mian() {
		ArrayList<Student2> al=new ArrayList<Student2>();  
		al.add(new Student2(101,"Vijay",23));  
		al.add(new Student2(106,"Ajay",27));  
		al.add(new Student2(105,"Jai",21));  
		Collections.sort(al, new Student2AgeComparator());
		al.forEach((s)->{
			System.out.println(s.rollNo+","+s.name+","+s.age);
		});
		

	}

}
