package pattern.creationalPatten.AbstarctFactoryPattern.Example1;

abstract class AbstractFactory {
	
	  public abstract Bank getBank(String bank);  
	  public abstract Loan getLoan(String loan);  

}
