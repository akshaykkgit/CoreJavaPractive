package akshay.thread;

public class ThreadVsRunnable {
	
	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass();
		t1.start();
		
		ThreadClass t2=new ThreadClass();
		t2.start();
		

		ThreadClass t3=new ThreadClass();
		t3.start();
		
		RunnableClass r1=new RunnableClass();
		
		Thread rt1=new Thread(r1);
		rt1.start();
		
		Thread rt2=new Thread(r1);
		rt2.start();
		
		Thread rt3=new Thread(r1);
		rt3.start();
		
		
	}
	
		

	

}
class ThreadClass extends Thread{
	int counter=0;
	
	public void run() {
		counter++;
		System.out.println(counter);
	}
	
}
class RunnableClass implements Runnable{
	int counter=0;

	@Override
	public void run() {
		
		counter++;
		System.out.println(counter);
	}
	
}
