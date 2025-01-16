package Flipkart_readers;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;




public class PropertyReaders {
	private static Properties prop = null;
	FileReaders fileReaders;

	public PropertyReaders() throws IOException {

		prop = new Properties();
		fileReaders = new FileReaders();
		String filePath = fileReaders.getMainResourcesFilepath("config", "properties");
		Reader file = fileReaders.readFile(filePath);
		prop.load(file);
	}

	public String getBrowserName() {
		return (String) prop.get("browser");
	}

	public String getApplicationUrl() {
		return (String) prop.get("url");
	}

	public int getHardWait() {
		return (int) prop.get("hardWait");
	}

	public int getImplicitWait() {
		return Integer.parseInt((String) prop.get("implicitWait"));
	}
	
	public int getExplicitWait() {
		return Integer.parseInt((String) prop.get("explicitWait"));
	}
	
	public String getsearchbartext() {
		return(String) prop.get("text");
	}
	
	public String getsearchbartextforflipkart() {
		return(String) prop.get("searchbartext");
	}
	
	public String getfromDate() {
		return (String) prop.get("From");
	}
		
	public String getToDate() {
		return(String) prop.get("To");
	}
		
	public String getwait() {
		return(String) prop.get("wait"); 
	}

}
