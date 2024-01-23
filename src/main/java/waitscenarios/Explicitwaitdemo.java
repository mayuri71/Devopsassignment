package waitscenarios;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo 
{
	public static WebElement waitForPresenceOfElement(WebDriver d1 ,By loc) 
	{
		//Reusable Script 
		WebDriverWait obj = new WebDriverWait (d1 ,Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
		
	}
	
	public static void main(String[] args) 
	{
		
	WebDriver d1 =new ChromeDriver();
	
		d1.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//by locator 
		
		By email =By.id("input-email");
		
		By pass = By.name("password");
		
		By btn = By.xpath("//input[@value='Login']");
		
		
		WebElement ele1 =waitForPresenceOfElement(d1 ,email); 
		
		ele1.sendKeys("test@gmail.com");
		
		WebElement ele2 =waitForPresenceOfElement(d1 ,btn); 
				
		ele2.click();
		
	
		
		
		
	}

}
