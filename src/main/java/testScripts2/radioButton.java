package testScripts2;
import org.openqa.selenium.*;
import testScripts.Base;

public class radioButton extends Base 
{
    public void radio()
    {
	   driver.findElement(By.partialLinkText("Radio Buttons")).click();
	   WebElement button= driver.findElement(By.xpath("//input[@value='Female' and @id='inlineRadio2']"));
	   button.click();
	   String radtext= driver.findElement(By.xpath("//label[@for='inlineRadio2']")).getText();
			 
	   driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
	   String message= driver.findElement(By.xpath("//div[@id='message-one']")).getText(); 
	   System.out.println(radtext.equalsIgnoreCase(message.split("'")[1].trim()));
	   
	   if(button.isSelected())
	   {
		   System.out.println("Is selected");
	   }
	   else
	   {
		   System.out.println("Not Selected");
		   button.click();
	   }
    }
    
	public static void main(String[] args) 
	{
		radioButton rad =new radioButton();
		rad.browserInit();
        rad.radio();
		rad.closeSession();
	}

}
