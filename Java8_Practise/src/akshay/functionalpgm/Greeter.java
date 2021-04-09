package akshay.functionalpgm;

public class Greeter {

	
	public void greeter(Greeting greeting) {
		
		greeting.perform();
	}
	public static void main(String[] args) {
		
		Greeter greeter=new Greeter();
		GreetingImpl impl=new GreetingImpl();
		
		greeter.greeter(impl);
		

	}

}
