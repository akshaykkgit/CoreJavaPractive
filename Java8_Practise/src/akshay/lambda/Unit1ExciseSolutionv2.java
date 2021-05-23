package akshay.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Unit1ExciseSolutionv2 {
	
	public static void main(String[] args) {
		List<Person> persons =Arrays.asList(
				new Person("akshay", "kk", 29),
				new Person("rahul", "a", 27),
				new Person("shilpa", "remesh", 28)
				
				);
		
	
		
		
		
		
		
		
		System.out.println("style 1");
		/*PrintCondirionally(persons, new Condition() {
			
			@Override
			public boolean test(Person person) {
				
				return person.getFirstName().startsWith("a");
			}
		});*/             //   THIS will fail but lambda will not
		
		
		Collections.sort(persons, (p1,p2) ->p1.getLastName().compareTo(p2.getLastName()) );//less code
		
		
		System.out.println("lambda style");
		PrintCondirionally(persons, p-> p.getFirstName().startsWith("a"));
		
		System.out.println("------------------------------------");
		System.out.println("print all");
		
		PrintCondirionally(persons, p ->true);
		
		
		
/*PrintCondirionally(persons, new Condition() {
			
			@Override
			public boolean test(Person person) {
				
				return person.getFirstName().startsWith("r");
			}
		});
	*/
		
	}
	
	
	
	
	public static void PrintCondirionally(List<Person> persons,Predicate<Person> condition) {
		
		for(Person person :persons) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}

}


