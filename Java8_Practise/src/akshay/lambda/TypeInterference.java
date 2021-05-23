package akshay.lambda;

public class TypeInterference {
	
	public static void main(String[] args) {
		
		StringLambdaLength stringLambda = (String str) -> str.length() ;

		System.out.println(stringLambda.getlength("akshay"));
		printlambda(s->s.length());
		
		
		
	}
	
	public static void  printlambda(StringLambdaLength StringLambdaLength) {
		System.out.println(StringLambdaLength.getlength("akshay kk"));
	}
	
	
	
	interface StringLambdaLength{
		int getlength(String s);
	}

}
