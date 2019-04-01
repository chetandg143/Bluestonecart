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

public class Scenario24 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumProject\\Ass23\\SOFTWARE\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(1000);
		 TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s24.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");

	}

}
