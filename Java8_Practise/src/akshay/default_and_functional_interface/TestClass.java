package akshay.default_and_functional_interface;

class TestClass implements TestInterface1{
	
	 public void show()
	    {
	        // use super keyword to call the show
	        // method of TestInterface1 interface
	        TestInterface1.super.show();
	    }
	 
	 public static void main(String[] args) {
		 TestClass d = new TestClass();
	     d.show();
	}
	
}