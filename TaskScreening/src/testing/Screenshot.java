package testing;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;




public class Screenshot extends Login {
	
	
	@Test(priority = 1)
	
	public void takescreenshotgmail() throws Exception
	{		
				
		Login ln = new Login();
		Properties prop = ln.OB();
		
		if(prop!=null){
			driver = new FirefoxDriver();
			driver.get("https://www.gmail.com");
			driver.getTitle();
			
			WebElement Username = driver.findElement(By.xpath(prop.getProperty("email.xpath")));
			Username.sendKeys("saravj062@gmail.com");
			Username.sendKeys(Keys.ENTER);

			WebDriverWait wait = new WebDriverWait(driver,35);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("passwd.xpath"))));

			WebElement Password = driver.findElement(By.xpath(prop.getProperty("passwd.xpath")));
			Password.sendKeys("Rohan4us");
			Password.sendKeys(Keys.ENTER);

			driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
			
			
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Shanthi_Selenium\\Cucumber_Maven\\TaskScreening\\src\\testing\\screenshot.png"));
		*/
		
			
		/*	
			Alert alert = driver.switchTo().alert();
			alert.accept();
			alert.dismiss();
			alert.authenticateUsing(arg0);
			alert.getText();*/
		
		
			/*driver.switchTo().defaultContent();*/
		
			/*Actions action = new Action(driver);
			action.dragAndDrop(source, target);*/
		
		/*driver.manage().window().getPosition().getX();
		
		driver.manage().window().getPosition().getY();
		
		driver.manage().window().getPosition();
		
		Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();*/
		
			/*String Exp = "dsfsdf"
			String Act = "dsfjdf"
			Assert.assertEquals(Act, Exp);
			if(Exp.equalsIgnoreCase(Act)){
				
			}*/
			
			
		}
		driver.quit();
	} 

}