package akshay.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	
	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,5,6,8,9);
	List<Integer> flist=list.stream().filter(v->v>4).collect(Collectors.toList());
	System.out.println(flist);
	
	List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    
    List<Product> plist = productsList.stream().filter(p->p.price>30000).collect(Collectors.toList());
	plist.forEach(p->{System.out.println(p.name+","+p.price);});
	
	}

}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 
