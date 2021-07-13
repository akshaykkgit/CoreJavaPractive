package akshay.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	 public static void main(String args[]) {
		 
	       BookTransient narnia = new BookTransient(1024, "Narnia", "unknown", 2);
	       System.out.println("Before Serialization: " + narnia);
	     
	        try {
	            FileOutputStream fos = new FileOutputStream("narnia.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(narnia);

	            System.out.println("Book is successfully Serialized ");

	            FileInputStream fis = new FileInputStream("narnia.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            BookTransient oldNarnia = (BookTransient) ois.readObject();
	         
	            System.out.println("Book successfully created from Serialized data");
	            System.out.println("Book after seriazliation : " + oldNarnia);
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	 
	 
	}

