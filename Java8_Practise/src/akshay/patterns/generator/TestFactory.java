package akshay.patterns.generator;

public class TestFactory {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		Shape shape1=factory.getShape("CIRCLE");
		Shape shape2=factory.getShape("CUBE");
		shape1.draw();
		shape2.draw();

	}

}
