package akshay.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Unit1ExciseSolution {
	
	public static void main(String[] args) {
		List<Person> persons =Arrays.asList(
				new Person("akshay", "kk", 29),
				new Person("rahul", "a", 27),
				new Person("shilpa", "remesh", 28)
				
				);
		
		
		persons.forEach(p-> System.out.println(p));
		persons.forEach(System.out::println);
		
		
		List<Person> persons2 =persons.stream().filter(p->p.getAge()>28).collect(Collectors.toList());
		System.out.println("Age>28");
		System.out.println(persons2);
		System.out.println("Name only");
		List<String> persons3 =persons.stream().filter(p->p.getAge()>28).map(p->p.getFirstName()).collect(Collectors.toList());
		System.out.println(persons3);
		
	
		
		
		
		
		
		
		System.out.println("style 1");
		PrintCondirionally(persons, new Condition() {
			
			@Override
			public boolean test(Person person) {
				
				return person.getFirstName().startsWith("a");
			}
		});
		
		
		Collections.sort(persons, (p1,p2) ->p1.getLastName().compareTo(p2.getLastName()) );//less code
		
		
		System.out.println("lambda style");
		PrintCondirionally(persons, p-> p.getFirstName().startsWith("a"));
		
		System.out.println("------------------------------------");
		System.out.println("print all");
		
		PrintCondirionally(persons, p ->true);
		
		
		
PrintCondirionally(persons, new Condition() {
			
			@Override
			public boolean test(Person person) {
				
				return person.getFirstName().startsWith("r");
			}
		});
	}
	
	
	
	
	public static void PrintCondirionally(List<Person> persons,Condition condition) {
		
		for(Person person :persons) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}

}

interface Condition {
	
	boolean test(Person person);
	
}
