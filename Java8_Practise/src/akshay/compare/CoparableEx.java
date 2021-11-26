package akshay.compare;

import java.util.ArrayList;
import java.util.Collections;

public class CoparableEx {
	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		Collections.sort(al,new  Student2AgeComparator());

		al.forEach((s)->{
			System.out.println(s.rollNo+","+s.name+","+s.age);
		});
	}

}
