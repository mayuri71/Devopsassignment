package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Capturescreenshot {
  @Test
  public void capturess() throws IOException 
  {
	//Launch the web Application
	  
	 WebDriver driver =new ChromeDriver();  
	  driver.get("https://www.youtube.com/");  
	  
	  //Create object
	  
	 TakesScreenshot ts =(TakesScreenshot) driver;
	  
	  // temporary file to store screenshot taken
	  
	 File temporary = ts.getScreenshotAs(OutputType.FILE);
	  
	  //permanent location to store screenshot 
	  
	  File Finalloaction =new File("./"+"\\Screenshots\\youtube1.png");
	  
	  //Copy the screenshot from temporary to final location with file handler class
	  
	  FileHandler.copy(temporary, Finalloaction);
  }
  
}
