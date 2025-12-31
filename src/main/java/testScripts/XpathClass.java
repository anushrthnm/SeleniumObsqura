package testScripts;

import org.openqa.selenium.*;

public class XpathClass extends Base
{
	public void relativexpath()
	{
		//xpath  //tag[@attribute='value']
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Naruto Uzumaki");
	}
	
	public void containsxpath()
	{
		//contains   //tag[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@fdprocessedid,'r8xegv')]")).sendKeys("Sasuke Uchiha");
	}
	
	public void startswithxpath()
	{
		//startsWith()  //tag[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'single')]")).sendKeys("Sakura Haruno");
	}
	
	public void textxpath()
	{
		//text()     //tag[text()='text']
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
	}
	
	public void andxpath()
	{
		//and()    //tag[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@id='single-input-field' and @fdprocessedid='r8xegv']")).sendKeys("Hinata Hyuga");
	}
	
	public void orxpath()
	{
		//or()    //tag[@attribute='value' or @attribute='value']
		driver.findElement(By.xpath("//input[@id='single-input-field' or @fdprocessedid='r8xegv']")).sendKeys("Shikamaru Nara");
	}

	public static void main(String[] args) 
	{
		XpathClass xp=new XpathClass();
		xp.browserInit();
		xp.relativexpath();
		xp.closeSession();
	}

}
