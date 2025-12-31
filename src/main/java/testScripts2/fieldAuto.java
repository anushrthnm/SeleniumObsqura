package testScripts2;
import org.openqa.selenium.*;

import testScripts.Base;

public class fieldAuto extends Base {
	
	public void fieldVal()
	{
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys("20");
		
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
		String val= driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		String[] next=val.split(":");
    	System.out.println(next[1].trim().equalsIgnoreCase("30"));
	}

	public static void main(String[] args) 
	{
		fieldAuto field=new fieldAuto();
		field.browserInit();
        field.fieldVal();
        field.closeSession();
	}

}
