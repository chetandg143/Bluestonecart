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

public class Scenrio27 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul/li/a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
		
		driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
		driver.findElement(By.xpath("//div[@class='tooltip-gms hidden']/following::ul/li")).toString();
		Thread.sleep(2000);
		 if(driver.getPageSource().contains("Amount is required")){
       	  System.out.println("Amount is required  msg is displayed");
       	  }else{
       	  System.out.println("Amount is required msg  is not displayed ");
       	  }
		  if(driver.getPageSource().contains("Email is required")){
       	  System.out.println("Email is required msg displayed");
       	  }else{
       	  System.out.println("Email is required msg  is not displaying ");
       	  }
		  TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s27.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
	 	    Thread.sleep(2000);
		  
	}

}
