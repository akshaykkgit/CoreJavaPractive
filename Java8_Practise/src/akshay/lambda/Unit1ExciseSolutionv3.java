package akshay.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Unit1ExciseSolutionv3 {
	
	public static void main(String[] args) {
		List<Person> persons =Arrays.asList(
				new Person("akshay", "kk", 29),
				new Person("rahul", "a", 27),
				new Person("shilpa", "remesh", 28)
				
				);
		
	
		
		
		
		
		
		
		System.out.println("style 1");

		
		Collections.sort(persons, (p1,p2) ->p1.getLastName().compareTo(p2.getLastName()) );//less code
		
		
		System.out.println("lambda style");
		PrintCondirionally(persons, p-> p.getFirstName().startsWith("a"),p->System.out.println(p));
		
		System.out.println("------------------------------------");
		System.out.println("print all");
		
		PrintCondirionally(persons, p ->true,p->System.out.println(p));
		
		
	}
	
	
	
	
	public static void PrintCondirionally(List<Person> persons,Predicate<Person> condition,Consumer<Person> consumer) {
		
		for(Person person :persons) {
			if(condition.test(person)) {
				//System.out.println(person);
				consumer.accept(person);
			}
		}
		
	}

}


