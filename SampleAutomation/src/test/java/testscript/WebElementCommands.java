package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	
	
	public void webElementCommands()
	{
		
	WebElement showMessagebutton =	driver.findElement(By.id("button-one"));
	WebElement className=           driver.findElement(By.className("clearfix"));
	WebElement name=                driver.findElement(By.name("viewport"));
	WebElement tagName=             driver.findElement(By.tagName("header"));
	WebElement linkTextsample=      driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialLinkvariable= driver.findElement(By.partialLinkText("Checkbox"));
	
	
	WebElement userNameswag=    driver.findElement(By.id("user-name"));
	WebElement loginButtonswag= driver.findElement(By.id("login-button"));
	WebElement singleInputfield= driver.findElement(By.id("single-input-field"));
	WebElement enterValuetexta= driver.findElement(By.id("value-a"));
	WebElement getTotal =driver.findElement(By.id("button-two"));
	
	
	WebElement loginClassname=driver.findElement(By.className("btn_action"));
	WebElement loginPasswordclass=driver.findElement(By.className("login_password"));
	WebElement menuBarclassname =driver.findElement(By.className("navbar-toggler-icon"));
	WebElement obsquraClass =driver.findElement(By.className("header-top"));
	WebElement obsquraClassname=driver.findElement(By.className("mb-sec"));
	
	WebElement menuBartag=driver.findElement(By.tagName("span"));
	WebElement getTotaltag=driver.findElement(By.tagName("button"));
	WebElement toataltag=driver.findElement(By.tagName("div"));
	WebElement enterValuetag=driver.findElement(By.tagName("input"));
	WebElement jqueryTag=driver.findElement(By.tagName("a"));
	
	
	WebElement singleFormlink=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement radioButtonlink=driver.findElement(By.linkText("Radio Buttons Demo"));
	WebElement selectInputlink=driver.findElement(By.linkText("Select Input"));
	WebElement jqueryLink=driver.findElement(By.linkText("Jquery Select2"));
	WebElement showMessagelink=driver.findElement(By.linkText("Show Message"));
	
	
	WebElement singleFormpartial=driver.findElement(By.partialLinkText("Simple"));
	WebElement radioButtonlinkpartial=driver.findElement(By.partialLinkText("Radio"));
	WebElement selectInputlinkpartial=driver.findElement(By.partialLinkText("Select"));
	WebElement jqueryLinkpartial=driver.findElement(By.partialLinkText("Jquery"));
	WebElement showMessagelinkpartial=driver.findElement(By.partialLinkText("Show"));
	
	}
	
	

	public static void main(String[] args)
	{
		
		WebElementCommands webelementscommands=new WebElementCommands();
		webelementscommands.initialiseBrowser();
		webelementscommands.webElementCommands();
		webelementscommands.driverQuit();

	}

}
