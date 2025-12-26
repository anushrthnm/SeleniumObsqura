package testScripts;

public class navigationMethods extends Base
{
    public void navigation()
    {
    	driver.navigate().to("https://www.maccaron.in/en/");
    	driver.navigate().back();
    	driver.navigate().forward();
    	driver.navigate().refresh();
    }
    
	public static void main(String[] args) 
	{
		navigationMethods navi=new navigationMethods();
		navi.browserInit();
		navi.navigation();
		navi.closeSession();
	}

}
