package akshay.lambda;

public class ClosureExamplev2 {

	public static void main(String[] args) {
		

		int a=10;
		int b=20;
		
		doProcess(a,i-> System.out.println(i+b) );
		
	}
	
	public static void doProcess(int i,Processv2 p) {
		p.process(i);
	}

}


interface Processv2 {
	 
	
	void process(int i);
}