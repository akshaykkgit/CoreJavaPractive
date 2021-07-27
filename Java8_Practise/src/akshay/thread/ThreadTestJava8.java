package akshay.thread;

public class ThreadTestJava8 {
	
	public static void main(String[] args) {
		
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("running thread!");
				
			}
		};
		
		
		
		new Thread(runnable).start();
		
		Runnable runnnbl= () ->{System.out.println("runningggg");};
		
		new Thread(runnable).start();
		
	}

}
