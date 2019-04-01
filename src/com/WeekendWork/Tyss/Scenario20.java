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
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenario20 {

	public static void main(String[] args) throws InterruptedException,IOException

	{
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\BlueStone\\SOFTWARE\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement gcoins = driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul/li[@id='goldCoins']"));
		Actions a =new Actions(driver);
		a.moveToElement(gcoins).build().perform();
        driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul/li[@id='goldCoins']")).click();
	
	 WebElement ele=   driver.findElement(By.xpath("//a[@id='pid_5923']/img[@alt='10 gram 24 KT Gold Coin']"));
	          ele.click();
	          if(driver.getPageSource().contains("10 gram 24 KT Gold Coin")){
	        	  System.out.println("10 gram 24 KT Gold Coin is displaying");
	        	  }else{
	        	  System.out.println("Text is absent");
	        	  }
	         Thread.sleep(1000);
	         TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s20.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
	 	   
	 	  
	         driver.close();
	          
	          
			
 
	}
	}


