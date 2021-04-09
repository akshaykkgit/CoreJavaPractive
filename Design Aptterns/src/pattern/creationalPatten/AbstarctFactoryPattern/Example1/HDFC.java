package pattern.creationalPatten.AbstarctFactoryPattern.Example1;

public class HDFC implements Bank {
	private final String BNAME;
	 public HDFC(){  
         BNAME="HDFC BANK";  
      }  
	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
