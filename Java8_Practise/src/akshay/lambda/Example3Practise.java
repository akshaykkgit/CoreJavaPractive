package akshay.lambda;

public class Example3Practise {

	
	public static void main(String[] args) {
		MyLambda fun1 = () -> System.out.println("\n Hellow World.");
		MyLambda fun2 = () -> {
			for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		};
		fun1.foo();
		fun2.foo();
		System.out.println("Done");
	}
}


interface MyLambda {
	void foo();
}