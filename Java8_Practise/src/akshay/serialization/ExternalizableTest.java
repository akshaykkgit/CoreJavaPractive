package akshay.serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ExternalizableTest {
	
	public static void main(String[] args) {
		
		
		    UserSettings settings = new UserSettings();
	        settings.setDoNotStoreMe("Sensitive info");
	        settings.setFieldOne(10000);
	        settings.setFieldTwo("HowToDoInJava.com");
	        settings.setFieldThree(false);
	         
	        //Before
	        System.out.println(settings);
	        storeUserSettings(settings);
	        UserSettings loadedSettings = loadUserSettings();
	         System.out.println(loadedSettings);
	    }
	
	
	
	
	public static void storeUserSettings(UserSettings userSettings) {
		
		try {
			FileOutputStream fileOutputStream =new FileOutputStream("file.ser");
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(userSettings);
			objectOutputStream.close();
			fileOutputStream.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static UserSettings loadUserSettings() {
		UserSettings settings=null;
		try {
		FileInputStream fileInputStream =new FileInputStream("file.ser");
		ObjectInputStream  inputStream=new ObjectInputStream(fileInputStream);
	    settings=(UserSettings)inputStream.readObject();
		
		
		} catch (IOException |  ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return settings;
		
		
		
	}
	
	
	}




