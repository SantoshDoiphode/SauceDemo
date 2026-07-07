package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private Properties prop;
	public String getProperty(String key) throws IOException
	{
		String path =System.getProperty("user.dir")+"\\src\\main\\java\\configurationLayer\\config.properties";
		FileInputStream fis;
		try {
			 fis = new FileInputStream(path);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String PropValue = prop.getProperty(key);
		return PropValue;
	}

}
