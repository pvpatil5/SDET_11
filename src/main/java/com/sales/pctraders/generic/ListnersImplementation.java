package com.sales.pctraders.generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersImplementation implements ITestListener
{
	ExtentReports reports;
	ExtentTest test;


	@Override
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" got Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" got Failed");
		test.log(Status.FAIL, result.getThrowable());
		try {
			String path=BaseClass.takescreenshot(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" got Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context)
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./target/FW.html");
		reporter.config().setDocumentTitle("Name of App");
		reporter.config().setTheme(Theme.STANDARD);

		reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("QA", "Pavan");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Build No", "123");

	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
