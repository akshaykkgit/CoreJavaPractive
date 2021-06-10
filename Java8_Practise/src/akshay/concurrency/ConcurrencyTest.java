package akshay.concurrency;


class Counter {
	int count;
	public synchronized void increment() {
		count++;
	}
	
}

public class ConcurrencyTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		Counter counter=new Counter();
		
		Thread thread =new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <1000; i++) {
					counter.increment();
				}
				
			}
		});
		

		Thread thread2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <1000; i++) {
					counter.increment();
				}
				
			}
		});
		
		
		thread.start();
		thread2.start();
		thread.join();//if this code removed Count value will will inconsistent.becouse before completing thread task main thread will execute
		//join method tells main thread to wait for thread
		thread2.join();
		
		System.out.println("Count :"+counter.count);
	}

}
