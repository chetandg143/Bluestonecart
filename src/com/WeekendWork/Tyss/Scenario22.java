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

public class Scenario22 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(100);
		WebElement price = driver.findElement(By.xpath("//section[@id='Delivery Time-form']/span/i"));
		Actions a =new Actions(driver);
		a.moveToElement(price).build().perform();
		WebElement ge = driver.findElement(By.xpath("//span[@class='prcs-dlh']"));
				ge.click();
		//System.out.println(ge.getText());
		driver.getClass().getName();
		 TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s22.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
		driver.close();
	}

	}


