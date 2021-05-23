package akshay.funinterface;

import java.io.PrintWriter;

public interface SampleFunInterface {
	
	public void execute();
	public default void print(String txt) {
		System.out.println(txt);
	}
	public static void print(String txt,PrintWriter printWriter) {
		System.out.println(txt);
	}
	SampleFunInterface interface1 = ()->{
		System.out.println("");
	};
	

}
