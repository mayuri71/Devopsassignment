package pageobjectmodel.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver driver;
	
	public Loginpage (WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators 
	
	private By email =By.id("email-id");
	private By pass =By.id("password");
	private By checkbox =By.id("remember");
	private By sbtn =By.id("submit-id");

	
	//Methods  --->Actions
	
	public void dologin(String emailID ,String Password) 
	{
		driver.findElement(email).sendKeys("emailID");
		driver.findElement(pass).sendKeys("Password");
		driver.findElement(checkbox).click();
		driver.findElement(sbtn).click();
	}
	
	public String geturl() 
	{
		return driver.getCurrentUrl();
	}
	
	public String  getAppTitle() 
	{
		return driver.getTitle();
	}
		
}
