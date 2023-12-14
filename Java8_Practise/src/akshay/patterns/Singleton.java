package akshay.patterns;

public class Singleton {
	
	private static volatile Singleton singleton;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Singleton getInstance() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				singleton=new Singleton();
			}
		}
		return singleton;
		
	}

}
