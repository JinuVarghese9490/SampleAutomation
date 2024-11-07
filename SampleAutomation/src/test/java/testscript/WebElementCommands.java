package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	
	
	public void webElementCommands()
	{
		
	WebElement showMessagebutton=	driver.findElement(By.id("button-one"));
	
	}
	
	

	public static void main(String[] args)
	{
		
		WebElementCommands webelementscommands=new WebElementCommands();
		webelementscommands.initialiseBrowser();
		webelementscommands.webElementCommands();
		webelementscommands.driverQuit();

	}

}
