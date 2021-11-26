package akshay.lambda.collections;

import java.util.LinkedList;

public class LinkedListTest {

	
	public static void main(String[] args) {
		
		
		  LinkedList<String> object
          = new LinkedList<String>();

      // Adding the elements to the
      // linked list
      object.add("A");
      object.add("B");
      object.addLast("C");
      object.addLast("D");
      object.addLast("E");

      System.out.println(object);

      // Removing elements from the
      // list
      
      object.removeFirst();

      System.out.println("Linked list after "
                         + "deletion: " + object);
      object.remove("D");
      System.out.println(object);
	}
}
