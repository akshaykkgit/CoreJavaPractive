package akshay.thread;


public class JoinTest {
	
	public static void main(String[] args) throws Exception {
		
		
		Thread t1 =new Thread( ()->{
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("HI");
				
				try {Thread.sleep(1000);} catch (Exception e) {}
				
			}
			
		});
		
       Thread t2 =new Thread( ()->{
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("HELLOW");
				
				try {Thread.sleep(1000);} catch (Exception e) {}
				
			}
			
		});

t1.start();
try {Thread.sleep(1000);} catch (Exception e) {}
t2.start();
System.out.println("IS t1 allive :"+t1.isAlive());
t1.join();
t2.join();
System.out.println("Bye");
System.out.println("IS t2 allive :"+t1.isAlive());

	}

}
