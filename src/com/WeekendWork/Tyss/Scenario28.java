package com.WeekendWork.Tyss;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Scenario28 {

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
        Thread.sleep(2000);
    //  WebElement email= driver.findElement(By.xpath("//input[@value='3sl14cs009@gmail.com']"))
    		  if(driver.getPageSource().contains("3sl14cs009@gmail.com")){
	        	  System.out.println("3sll14cs009@gmail.com");
	        	  }else{
	        	  System.out.println("email  is not displaying ");
	        	  }
    		  if(driver.getPageSource().contains("4500")){
	        	  System.out.println("4500 displaying");
	        	  }else{
	        	  System.out.println("4500  is not displaying ");
	        	  }
    		  TakesScreenshot ts =(TakesScreenshot)driver;
  	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
  	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s28.png");
  	 	    Files.copy(srcfile,desfile);
  	 	    System.out.println("Testcase is Pass");
    		  
      
        

	}

}
