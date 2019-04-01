package com.Extent.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sc31 {

	public static void main(String[] args)
	{

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\SeleniumProject\\BlueStone\\Reports\\sc31.html");
			
			reporter.config().setDocumentTitle("Automation Testing ");
			reporter.config().setTheme(Theme.DARK);
			reporter.config().setReportName("Regression Testing");
			
			ExtentReports ext = new ExtentReports();
			ext.attachReporter(reporter);
			ExtentTest test = ext.createTest("test1");
			
			ext.setSystemInfo("ENV", "Tester");
			ext.setSystemInfo("tester","chetan");
			ext.setSystemInfo("Project", "Bluestone_20");
			ext.setSystemInfo("Version", "0.3");
			test.log(Status.INFO,"Extent report is working fine ");
			test.log(Status.PASS, "test is passed");
			
			
			ext.flush();
			System.out.println("done ");
			
			


	}

}
