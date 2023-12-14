package akshay.interview;

import java.util.Scanner;

public class AtmTest {

	    public static void main(String[] args) {
	        int notes[]={1000,500,100};
	        int counts[]={0,0,0};
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the amount :");
	        int amt=scanner.nextInt();
	        for(int i=0;i<notes.length;i++){
	            counts[i]=amt/notes[i];
	            amt=amt% notes[i];
	        }
	        System.out.println("1000*"+counts[0]+"\n"+"500*"+counts[1]+"\n"+"100*"+counts[2]);
	    }
	

}
