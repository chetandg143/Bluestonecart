package com.WeekendWork.Tyss;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Scenario30 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		   
				System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.bluestone.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
				driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("4500");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='col-xs-5 fl-wrap']/input[@id='Email']")).sendKeys("3sl14cs009@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
				driver.findElement(By.xpath("//input[@name='_eventId_savePersonalAddressDetails']")).click();
		        if(driver.getPageSource().contains("Name is required"))
		        {
		        	System.out.println("Name is required msg displayed");
		        }
		        else
		        {
		        	System.out.println("Name is required msg  not displayed");
		        			
		        }
	

		       
	 if(driver.getPageSource().contains("Your address is required"))
     {
     	System.out.println("your address is required msg displayed");
     }
     else
     {
     	System.out.println("Your address is required msg  not displayed");
     			
     }


if(driver.getPageSource().contains("Enter Valid Pincode"))
{
	System.out.println("Enter valid pincode msg displayed");
}
else
{
	System.out.println("Enter valid pincode msg  not displayed");
			

	}

	 TakesScreenshot ts =(TakesScreenshot)driver;
	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s30.png");
	    Files.copy(srcfile,desfile);
	    System.out.println("Testcase is Pass");
}
}