package com.WeekendWork.Tyss;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Scenario34 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
        
		driver.findElement(By.xpath("//a[@id='booking_engine_trains']")).click();
		Thread.sleep(1000);
	    WebElement from =	driver.findElement(By.xpath("//input[@id='BE_train_from_station']"));
		from.sendKeys("GADAG (JN) ",Keys.ENTER);
	  
	    
		WebElement to=driver.findElement(By.xpath("//input[@id='BE_train_to_station']"));
	    to.sendKeys("HUBLI JN (UBL)",Keys.ENTER);

		
		driver.findElement(By.xpath("//input[@id='BE_train_depart_date']")).sendKeys("27/03/2019");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).sendKeys("");
		 TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s34.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
	 	    Thread.sleep(2000);
	 	    driver.close();
	}

	}


