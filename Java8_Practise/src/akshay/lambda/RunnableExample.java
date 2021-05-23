package akshay.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread =new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1");
				
			}
		});
		thread.run();
		
		Thread thread2 =new Thread( () ->System.out.println("Thread 2") );
		thread2.run();
		
		

	}

}
