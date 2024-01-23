package pageobjectmodel.Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageobjectmodel.Page.Loginpage;

public class Baseclass
{
    public WebDriver driver;
	public Loginpage loginp;
	@BeforeClass 
	public void launchset()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //manage timeouts
		driver.get("https://automationplayground.com/crm/login.html");    //Launch webApplication
		loginp = new Loginpage(driver);
	}
	
	@AfterClass
	public void exit()
	{
		driver.quit();
	}	
}
