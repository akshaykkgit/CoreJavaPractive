package pattern.other;

public class Phone {

	private String brand;
	private String ram;
	private String color;
	public String getBrand() {
		return brand;
	}
	
	public Phone(String brand, String ram, String color) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", ram=" + ram + ", color=" + color + "]";
	}

	
	
	
	
}
