package pattern.other;

public class CompositeTest {

	public static void main(String[] args) {
		
		
		Component comp1=new Leaf(100, "comp1");
		Component comp2=new Leaf(200, "comp2");
		
		Composite c1=new Composite("Cabinet");
		c1.addComponent(comp1);
		c1.addComponent(comp2);
		c1.showPrice();
		System.out.println();
		comp2.showPrice();
		

	}

}
