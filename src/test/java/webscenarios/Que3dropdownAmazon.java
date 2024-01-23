package webscenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que3dropdownAmazon {

	public static void main(String[] args) 
	{
		//launch Session
				WebDriver d1 =new ChromeDriver();
				d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//launch web Application
				d1.get("https://www.amazon.in");
				System.out.println("The Title is :"+d1.getTitle());
				
				// open the search box of Amazon Application
				
			       WebElement e1 = d1.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			       Select dd =new Select(e1);
			       
				// first check whether we are able to select option by visible text.
				dd.selectByVisibleText("Electronics");
				
			    //Find out how many options are there in dropdown
				List <WebElement> alloptions = dd.getOptions();
				System.out.println("Total Options in Dropdown are :"+alloptions.size());
				
				//select an option based on specific criteria. by using contains method 
				for (WebElement i :alloptions) 
				{
					System.out.println(i.getText());
					if (i.getText().contains("Amazon Fresh")) 
					{
						i.click();
						break;
					}
				}
	
		
	}

}
