import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_loading {

	public static void main(String[] args) throws IOException {
		//before using any class we have to create object of class
		Properties properites=new Properties();
		//the properties.load method needs inputstream to load 
		//using fileinputstream class we pass the path of the properties
		FileInputStream input=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Flipkart\\src\\test\\resources\\properties\\config.properties");
       //using load we load the properties file
		properites.load(input);
		//using getproperty method we read the properties from the properties file
       System.out.println(properites.getProperty("surname")); 
       
       
       
       
       
       //for Storing the properties in the properties file 
       
       FileOutputStream output =new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Flipkart\\\\src\\\\test\\\\resources\\\\properties\\\\config.properties");
       properites.setProperty("college", "bec");
       properites.store(output, null);
       
       
	}

}
