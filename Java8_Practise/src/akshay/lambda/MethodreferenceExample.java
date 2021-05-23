package akshay.lambda;

public class MethodreferenceExample {
	
	public static void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		Thread thread =new  Thread(()->print());
		thread.start();
		
		Thread thread2 =new  Thread(MethodreferenceExample::print);
		

	}

}
