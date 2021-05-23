package pattern.other;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.List;

interface Component {
	public void showPrice();
}


class Leaf implements Component{
	
	int price;
	String name;
	
	

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}



	@Override
	public void showPrice() {
		System.out.println("price :"+price);
		
	}
	
}

class Composite implements Component{

	
	List<Component> components=new ArrayList<Component>();
	String name;
	@Override
	public void showPrice() {
		
		for (Component c:components) {
			c.showPrice();
		}
		
		
	}
	
	
	
	
	



	public Composite(String name) {
		super();
		this.name = name;
	}








	public void addComponent(Component comp) {
		components.add(comp);
	}
	
}

