package pageobjectmodel.Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginpagetest extends Baseclass
{
  @Test(priority=1)
  public void verifyURL() 
  {
	  String url = loginp.geturl();
	  Assert.assertTrue(url.contains("automationplayground.com"),"Incorrect URL");
	  System.out.println("Correct URL");  
  }
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String Title = loginp.getAppTitle();
	  Assert.assertTrue(Title.contains("Service"),"Incorrect Title");
	  System.out.println("Correct Title");
	  
  }
  @Test(priority=3)
  public void verifylogin() 
  {
	  loginp.dologin("test1@gmail.com","Test@1234");
	  Assert.assertTrue(driver.getCurrentUrl().contains("automationplayground.com"));
	  System.out.println("Login Successfull");
  }
   
}
