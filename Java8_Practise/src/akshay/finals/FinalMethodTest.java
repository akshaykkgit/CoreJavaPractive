package akshay.finals;

public class FinalMethodTest extends Protected {
	
	/*
	 * public void whoamI() {  //Not possible
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		final int i=1;
		//i++;//Not possible
		
		

	}

}

class Protected{
	
	protected final void whoamI() {
		System.out.println("HIIII");
	}
}
