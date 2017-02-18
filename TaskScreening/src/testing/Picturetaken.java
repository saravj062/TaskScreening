package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Picturetaken extends Login
{
	
	
	public void pic(int i)
	{
		
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(src,new File("D:\\Shanthi_Selenium\\Cucumber_Maven\\TaskScreening\\src\\testing\\screenshot"+i+".png"));
	} 
	catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
		}	
	}


}