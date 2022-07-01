package IO_Classes_New;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
 
public class properties_example {
  public static void main(String[] args) {
 
	
 
	try {
		Properties prop = new Properties();
		
 
		
 
		// set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "nidhi");
		prop.setProperty("dbpassword", "12345");
 
		FileOutputStream output = new FileOutputStream("db1.properties");
		// save properties to project root folder
		
		prop.store(output, null);
		output.close();
 
	} catch (IOException io) {
		io.printStackTrace();
	} 
	
  }
}