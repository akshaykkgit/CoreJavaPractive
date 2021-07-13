package akshay.abstraction;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape cirShape= new Circle("White",5);
		Shape recShape = new  Recatngle("Red",2.5,3);
		
		System.out.println(cirShape.toString());
		System.out.println(recShape.toString());
		cirShape.area();
		
	}


}

abstract class Shape {
    String color;
 
    // these are abstract methods
    abstract double area();
    public abstract String toString();
 
    // abstract class can have constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
 
    // this is a concrete method
    public String getColor() { return color; }
}

class Circle extends Shape {
	
	double radius;

	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called");
	    this.radius = radius;
		
	}

	@Override
	double area() {
		 return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor()
        + "and area is : " + area();
    }
}


class Recatngle extends Shape {
	double length;
    double width;
    
    
	public Recatngle(String color, double length, double width) {
		super(color);
		System.out.println("Reactangle Constructor called");
		this.length = length;
		this.width = width;
	}


	@Override
	double area() {
		 return length * width;
	}


	@Override
	public String toString() {
		return "Rectangle color is " + super.getColor()
        + "and area is : " + area();
	}
    
    
}
	

