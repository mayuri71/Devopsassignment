package docker_seleniumGrid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DevopsAssignmnt_crossbrowser 
{
public WebDriver driver;

  @Test(priority=1)
  public void chrome() throws MalformedURLException, InterruptedException 
  {
	    ChromeOptions opt =new ChromeOptions();
	    driver =new RemoteWebDriver(new URL("http://localhost:4444"),opt);
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in");
	    System.out.println("Amazon opened on Chrome Browser");
  }
  @Test(priority=2)
  public void edge() throws MalformedURLException, InterruptedException 
  {
	    EdgeOptions Eopt =new EdgeOptions();
	    driver =new RemoteWebDriver(new URL("http://localhost:4444"),Eopt);
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in");
	    System.out.println("Amazon opened on Edge Browser");
  }
  @Test(priority=3)
  public void firefox() throws MalformedURLException, InterruptedException 
  {
	    FirefoxOptions fopt =new FirefoxOptions();
	    driver =new RemoteWebDriver(new URL("http://localhost:4444"),fopt);
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in");
	    System.out.println("Amazon opened on Firefox Browser"); 
		 
  }	 	  
  
  
}
