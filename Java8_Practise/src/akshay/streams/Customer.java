package akshay.streams;

public class Customer {
	String customeName;
	String customeType;
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public String getCustomeType() {
		return customeType;
	}
	public void setCustomeType(String customeType) {
		this.customeType = customeType;
	}
	public Customer(String customeName, String customeType) {
		super();
		this.customeName = customeName;
		this.customeType = customeType;
	}
	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [customeName=" + customeName + ", customeType=" + customeType + "]";
	}
	
	
	
	
	

}
