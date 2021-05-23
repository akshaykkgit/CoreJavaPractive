package akshay.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.stream.util.StreamReaderDelegate;

public class CustomerTest {

	public static void main(String[] args) {
		Customer ob1=new Customer("alshay", "boy");
		Customer ob2=new Customer("arun", "boy");
		Customer ob3=new Customer("shilpa", "girl");
		
		Stream<Customer> streamData =Stream.of(ob1,ob2,ob3);
		
		Map<String, List<Customer>> map =streamData.collect(Collectors.groupingBy(Customer::getCustomeType));
		
		
		
		System.out.println(map.get("girl"));
		
		List<Customer> boys=map.get("boy");
		
		
		List<List<Customer>> comCustomers =Arrays.asList(   (Arrays.asList(ob1,ob2)),(Arrays.asList(ob3))   ); 
		
		System.out.println(comCustomers);
		
		List<String> namelist = comCustomers.stream().flatMap(c->c.stream()).map(c->c.getCustomeName()).collect(Collectors.toList());
		System.out.println(namelist);
		
		List<Customer> custList =Arrays.asList(ob1,ob2,ob3);
		//normal stream
		custList.stream().filter(c->c.getCustomeType().equals("girl")).limit(1).forEach(System.out::println);
		//parallel stream
		custList.parallelStream().filter(c->c.getCustomeType().equals("girl")).limit(1).forEach(System.out::println);
		//parallel stream convertion
		custList.stream().parallel().filter(c->c.getCustomeType().equals("girl")).limit(1).forEach(System.out::println);
		
		

	}

}
