package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

public class ConfigPage {
	
		

		Properties propObj;
		
	
	public ConfigPage()
	{
		try {
	
			
			FileInputStream inputFile = new FileInputStream("C:\\Users\\prane\\Documents\\testing classes\\RallyThe4th\\configs\\browserConfig.properties");
			
			propObj = new Properties();
			
			propObj.load(inputFile);
			
		} catch (Exception exp) {
			
			System.out.println("file is not found");
		} 
	}
	public String testInitialize()
	{
		String path = propObj.getProperty("ChromeDriver");
		System.out.println(path);
		
		return path;
	}
	public String userNameDetails()
	{
		String userEmailId = propObj.getProperty("userName");
		return userEmailId;
		
	}
	
	public String passwordDetails()
	{
		String userPassword = propObj.getProperty("Password");
		return userPassword;
		
	}

}

