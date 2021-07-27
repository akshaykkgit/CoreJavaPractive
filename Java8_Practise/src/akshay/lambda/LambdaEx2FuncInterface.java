package akshay.lambda;
@FunctionalInterface
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);
   
  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}
public class LambdaEx2FuncInterface {

	public static void main(String[] args) {
		
		FuncInterface funcInterface = (int x)->System.out.println(2*x);
		funcInterface.abstractFun(5);
		funcInterface.normalFun();
		
		FuncInterface funcInterface2 = (int x)->{if(x>0) { 
			int result=0;
			for(int i =0;i<x;i++) {
				
				result+= i;
				
			}
			System.out.println(result);
			
		}};
		
		funcInterface2.abstractFun(4);
	}
	
	

}
