package akshay.statics;

public class StaticClass {
	
	private static String str= "Edureka";
	 String aa="akshay";
			//Static class
	static class MyNestedClass{
	//non-static method
		public void disp(){
		   System.out.println(str);
		   
		   
		}
	}
	public static void main(String args[]){
		StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
	obj.disp();
			 

}
}
