package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void browserInit()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	
	public void closeSession()
	{
		driver.close();
	}

	public static void main(String[] args) 
	{
		Base base=new Base();
		base.browserInit();
	}

}
