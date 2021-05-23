package akshay.lambda;

public class ThisRefExample {
	
	public void doprocess(int i,Process p) {
		p.process(i);
		
	}
	
	public static void main(String[] args) {
		
		
		ThisRefExample thisRefExample =new ThisRefExample(10, new Process() {
			
			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
				
			}
		})
	}
	


	 

}
