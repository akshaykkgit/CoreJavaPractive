package pattern.creationalPatten.AbstarctFactoryPattern.Example1;

public class ICICI implements Bank {
	
	 private final String BNAME;  
     ICICI(){  
              BNAME="ICICI BANK";  
      }  
      public String getBankName() {  
                return BNAME;  
     }  

}
