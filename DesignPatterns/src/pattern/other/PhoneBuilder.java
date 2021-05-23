package pattern.other;

public class PhoneBuilder {
	
	private String brand;
	private String ram;
	private String color;
	public String getBrand() {
		return brand;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public String getRam() {
		return ram;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public String getColor() {
		return color;
	}
	public PhoneBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(brand, ram, color);
	}
	
	

}
