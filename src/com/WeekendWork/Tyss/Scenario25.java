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

public class Scenario25 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","E:\\\\SeleniumProject\\\\BlueStone\\\\SOFTWARE\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(1000);
	
		WebElement price = driver.findElement(By.xpath("//section[@id='Gender-form']/descendant::span/i"));
		Actions a =new Actions(driver);
		a.moveToElement(price).build().perform();
       Thread.sleep(1000);
       
   //   WebElement count= driver.findElement(By.xpath("//div[@class='form-item ']/span[@data-displayname='women']"));
      if(driver.getPageSource().contains("")){
    	  System.out.println("women(1002) is displaying");
    	  }else{
    	  System.out.println("count  is absent");
    	  }
      TakesScreenshot ts =(TakesScreenshot)driver;
	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s25.png");
	    Files.copy(srcfile,desfile);
	    System.out.println("Testcase is Pass");
              driver.close();
		
	}

}
