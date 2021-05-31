package common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader extends Openbrowser {
	private Properties p;
	public Propertyreader() throws IOException
	{
		FileReader reader = new FileReader("./propertyfiles/browsername.properties");
				 p = new Properties();
		p.load(reader);
	}
	
	public String getbrowsername()
	{
		String browser = p.getProperty("browsername");
				if(browser!=null)
				
				return browser;
				
				else
					throw new RuntimeException("The browser name is not presented in the property file");
				
	}
	
	public String getusername()
	{
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password = p.getProperty("password");
		return password;
	}
	
	
		
}

/*
 *private Properties p;

 * public Propertyreader() throws IOException { FileReader reader = new
 * FileReader("./propertyfiles/browsername.properties"); p = new Properties();
 * p.load(reader); }
 * 
 * 
 * public String getbrowsername() { String browsername =
 * p.getProperty("browsername"); if(browsername!=null) return browsername; else
 * throw new RuntimeException("The error occured in browsername reader file");
 * 
 * }
 */