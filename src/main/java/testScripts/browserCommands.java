package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands extends Base
{
	
	public static void main(String[] args) 
	{
		browserCommands browse=new browserCommands();
		browse.browserInit();
		browse.browserCommands();
		browse.closeSession();
	}
	
	public void browserCommands()
	{
		String title =driver.getTitle();
		System.out.println("Page Title is:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is:"+url);
		String page=driver.getPageSource();
		System.out.println("Page Source is:"+page);
	}

}
