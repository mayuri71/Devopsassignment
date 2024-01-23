package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testdemo1 {
  @Test (priority=1,description="first test case")
  public void registertest() 
  {
	  System.out.println("This is register test");
  }
  @Test(priority=2,description ="second test case")
  public void searchproducttest() 
  {
	  System.out.println("This is search product test");
  }
  @Test(priority=3,description="last test case",invocationCount=2)
  public void addtocartrtest() 
  {
	  System.out.println("This is Add to cart test");
  }
  @Test
  public void HardAssertion() 
  {
	  String a ="Welcome";
	  String b ="Wlcome";
	  
	 Assert.assertEquals(a, b,"Fil");
	 System.out.println("Strings are Equal");
  }
}
