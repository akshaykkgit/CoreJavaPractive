package akshay.lambda;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class UnitOneExcise {

	public static void main(String[] args) {
		List<Person> people =Arrays.asList(
				new Person("akshay", "kk", 29),
				new Person("rahul", "a", 27),
				new Person("shilpa", "remesh", 28)
				
				);
	for(Person person :people) {
			System.out.println(person);
	}
		
	System.out.println("Sort list by last name");
	
	Collections.sort(people, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			
			return o1.getLastName().compareTo(o2.getLastName());
		}
	});
	
	
	for(Person person :people) {
		System.out.println(person);
	}
	
	
	
	
	System.out.println("print name start with 'A'");
	

	for(Person person :people) {
		if(person.getFirstName().startsWith("a")) {
			System.out.println(person);
		}
	}
	// using lambda
	
	Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
	
	
	
	
	
	
	
	
	

	}
	
public static void PrintAllData(List<Person> list, Condition condition) {
	
	for(Person person :list) {
		
	}
		
}
	

}
