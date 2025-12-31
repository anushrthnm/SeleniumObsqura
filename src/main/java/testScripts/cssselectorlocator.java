package testScripts;

import org.openqa.selenium.*;

public class cssselectorlocator extends Base
{
	
	public void tagandid()
	{
		WebElement tid= driver.findElement(By.cssSelector("input#single-input-field"));
		tid.isDisplayed();
		tid.click();
		tid.sendKeys("Text1");
	}
	
	public void tagandclass()
	{
		WebElement tid= driver.findElement(By.cssSelector("input.form-control"));
		tid.isDisplayed();
		tid.click();
		tid.clear();
		tid.sendKeys("Text2");
	}
	public void tagandattribute()
	{
		WebElement tid= driver.findElement(By.cssSelector("input[id='single-input-field']"));
		tid.isDisplayed();
		tid.click();
		tid.clear();
		tid.sendKeys("Text3");
	}
	
	public void tagandclassattribute()
	{
		WebElement tid= driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		tid.isDisplayed();
		tid.click();
		tid.clear();
		tid.sendKeys("Text4");
	}
	

	public static void main(String[] args) 
	{
		cssselectorlocator css =new cssselectorlocator();
		css.browserInit();
		css.tagandid();
		css.tagandclass();
		css.tagandattribute();
		css.tagandclassattribute();
		css.closeSession();
	}

}
