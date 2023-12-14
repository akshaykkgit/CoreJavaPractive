package akshay.patterns.generator;

public class ShapeFactory {
	
	public Shape getShape(String type) {
		
		if(type.equals("CIRCLE")) {
			return new Circle();
		}
		else if (type.equals("CUBE")) {
			return new Cube();
		}
		else {
			return null;
		}
	}



}
