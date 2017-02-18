package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Boastates {
	
	WebDriver driver;
	@Test
	public void boa() throws Exception
	
	{
		driver = new FirefoxDriver();
		driver.get("https://www.bankofamerica.com");
		Select selstate= new Select(driver.findElement(By.id("pick_state")));
		List<WebElement> state = selstate.getOptions();
		
		for(int i=0;i<state.size();i++)
		{
			
			String statename = state.get(i).getText();
			if(statename.equalsIgnoreCase("Florida"))
			
			{
				
				System.out.println(statename);
				System.out.println("The index of Florida is "+ i);
				/*selstate.selectByVisibleText("New Jersey");
				
				System.out.println(selstate.getFirstSelectedOption().getText());
				selstate.selectByIndex(9);
				System.out.println(selstate.getFirstSelectedOption().getText());
				System.out.println(selstate.getClass().getName());*/
								
			}
			
		}
		/*driver.findElement(By.xpath("//a[@name = 'global_wealthmanagement']")).click();
		driver.findElement(By.linkText("Businesses & Institutions")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Solutions")).click();
		*//*
	*/
	
	}

}
