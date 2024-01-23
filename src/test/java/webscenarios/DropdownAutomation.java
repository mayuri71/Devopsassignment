package webscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1 =new ChromeDriver ();
		
		d1.get("https://www.Amazon.in");
		
		System.out.println(d1.getTitle());
		
		WebElement ele =d1.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select dd =new Select(ele);
		
		dd.selectByIndex(2);  //select by index
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Amazon Fresh");
		Thread.sleep(2000);
		
		dd.selectByValue("search-alias=appliances");
		
		// print all options from dropdown
		
		List<WebElement> alloptions =dd.getOptions();
		
		System.out.println("All Options are:"+alloptions.size());
		
		for (WebElement i:alloptions) {
			System.out.println(i.getText());
			if (i.getText().contains("Video Games")) {
				i.click();
				break;
			}
		}
}

}
