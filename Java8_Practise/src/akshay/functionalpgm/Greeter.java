package akshay.functionalpgm;

public class Greeter {

	
	public void greeter(Greeting greeting) {
		
		greeting.perform();
	}
	public static void main(String[] args) {
		
		Greeter greeter=new Greeter();
		GreetingImpl impl=new GreetingImpl();
		greeter.greeter(impl);
		
		
		Greeting impl2 = () -> System.out.println("Second way");
		impl2.perform();
		
		Greeting impl4 = new Greeting() { //anonimous inner class
			
			@Override
			public void perform() {
				
				System.out.println("Implementation 3");
				
			}
		};
		impl4.perform();
		
		
		System.out.println("----------------------------------------------");
		
		
		greeter.greeter(impl2);
		greeter.greeter(impl4);
		
		

	}

}
