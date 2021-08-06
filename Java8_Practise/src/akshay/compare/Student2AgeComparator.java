package akshay.compare;

import java.util.Comparator;

public class Student2AgeComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.age==o2.age) {
		  return 0;
		}
		else if (o1.age>o2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
