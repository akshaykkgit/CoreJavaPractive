package pattern.creationalPatten.factoryMehodPattern.Example1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) {
		try {
		GetPlanFactory planFactory = new GetPlanFactory();  
	    System.out.print("Enter the name of plan for which the bill will be generated: "); 
	    BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
	    String planName=bufferedReader.readLine();  
	    System.out.print("Enter the number of units for bill will be calculated: ");
	    int units=Integer.parseInt(bufferedReader.readLine());  
	    Plan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	    System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	    p.getRate();  
	    p.calculateBill(units);  
	    
		}
		catch (Exception e) {
			
		}
	    

	}

}
