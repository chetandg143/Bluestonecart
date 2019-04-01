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

public class Scenario31 {

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
        driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Virat kohli");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("#2238 Gajendragada");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='postcode_delivery']")).sendKeys("582114");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Next']")).click();
        /* payment page */
        driver.findElement(By.xpath("//input[@id='nomineeName']")).sendKeys("Saroja");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='nomineeRelationship']/option[@value='Mother']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='nomineeNationality']/option[@value='Indian']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Next']")).click();
        Thread.sleep(1000);
      
       
          if(driver.getPageSource().contains("Payment Details")){
       	  System.out.println(" Payment Details  page is  displayed");
       	  }else{
       	  System.out.println(" Payment Details  page is not displayed");
       	  }
          TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("E:\\SeleniumProject\\BlueStone\\Captureimages\\s31.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
		

	}

}
