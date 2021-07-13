package akshay.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDemo {

	public static void main(String[] args) {
		  // Serialization 
		 Demo object = new Demo(1, "geeksforgeeks");
	     String filename = "D:\\file.ser";
	     
	     //Saving of object in a file
	     try {
			FileOutputStream fileOutputStream =new FileOutputStream(filename);
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
			// Method for serialization of object
			objectOutputStream.writeObject(object);
			objectOutputStream.close();
			fileOutputStream.close();
			
			 System.out.println("Object has been serialized");
			 
			 
			 
			 
			 Demo object1 = null;
			  
		     // Deserialization
		        
		     FileInputStream fileInputStream =new FileInputStream(filename);
		     ObjectInputStream inputStream =new ObjectInputStream(fileInputStream);
		     
		     // Method for deserialization of object
		     object1 = (Demo)inputStream.readObject();
		     inputStream.close();
		     fileInputStream.close();
		     
		     System.out.println("Object has been deserialized ");
	         System.out.println("a = " + object1.a);
	         System.out.println("b = " + object1.b);
		     
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     

	       
	        
	        
	        
	        

	}

}
