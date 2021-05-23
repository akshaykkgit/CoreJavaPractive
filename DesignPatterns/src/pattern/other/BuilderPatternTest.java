package pattern.other;

public class BuilderPatternTest {

	public static void main(String[] args) {
		
		
		Phone phone =new PhoneBuilder().setBrand("Nokia").setColor("Red").setRam("2").getPhone();
		System.out.println(phone);
		
		Phone phone2 =new PhoneBuilder().setBrand("mi").setColor("Red").getPhone();
		System.out.println(phone2);

	}

}
