package docker_seleniumGrid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class crossbrowser_devopsassignment {
	public WebDriver driver;

@Test
  public void browsertest(String bn) throws MalformedURLException, InterruptedException 
  {
	  if (bn.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions options =new ChromeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/ui"),options);
		  System.out.println("Chrome Browser opened");
	  }
	  else if(bn.equalsIgnoreCase("edge"))
	  {
		 EdgeOptions options =new EdgeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/ui"),options);
		  System.out.println("Edge Browser opened");
		  
	  }else if(bn.equalsIgnoreCase("firefox")) 
	  {
		  FirefoxOptions options =new FirefoxOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/ui"),options);
		  System.out.println("firefox Browser opened");
		    
	  }
	  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(5000);
	  System.out.println("cross browser test executing");
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
