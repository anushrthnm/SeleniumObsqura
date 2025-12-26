package testScripts;

import java.util.List;

import org.openqa.selenium.*;

public class genlocators extends Base
{
    public void id()
    {
    	String input="Naruto Uzumaki";
    	
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	//WebElement el =driver.findElement(By.locator("locatorValue"));
    	
    	WebElement textfield1 =driver.findElement(By.id("single-input-field"));
    	textfield1.click();
    	textfield1.sendKeys(input);
    	
    	WebElement button= driver.findElement(By.id("button-one"));
    	button.click();
    	
    	WebElement msg1= driver.findElement(By.id("message-one"));
    	String msgtxt= msg1.getText();
    	String[] next=msgtxt.split(":");
    	System.out.println(next[1].trim().equalsIgnoreCase(input));  
    	
    	WebElement fieldA=driver.findElement(By.id("value-a"));
    	WebElement fieldB=driver.findElement(By.id("value-b"));
    	
    }
    
    public void name()
    {
    	WebElement name= driver.findElement(By.name("form-control"));
    }
    
    public void classname()
    {	
    	WebElement clsname= driver.findElement(By.className("form-control"));
    }  
    
    public void linkText()
    {	
    	WebElement ltext= driver.findElement(By.linkText("Radio Buttons Demo"));
    }
    
    public void partlinkText()
    {	
    	WebElement ltext= driver.findElement(By.partialLinkText("Radio Buttons"));
    }
    
    public void tagname()
    {
    	List <WebElement> tags= driver.findElements(By.tagName("a"));
    }
    
	public static void main(String[] args) 
	{
		genlocators loc=new genlocators();
		loc.browserInit();
		loc.id();
		loc.closeSession();
	}
}
