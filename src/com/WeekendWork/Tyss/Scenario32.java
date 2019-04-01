package com.WeekendWork.Tyss;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Scenario32
{
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//li[@class='visit-our-stores']/a")).click();
	
List<WebElement> lst =	driver.findElements(By.xpath("//div[@class='store-location']"));
  for(WebElement we : lst)
  {
	 int  count=lst.size();
	 for(int i=0;i<=count;i++)
	 {
	System.out.println("count of location :"+i);
	  System.out.println(we.getText());
	 }
	 
	  
		 TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s32.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
		
 
}
}
}