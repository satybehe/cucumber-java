package org.example.common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass implements ITestListener {

    ExtentTest test;
    ExtentReports report;
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test case Started--"+iTestResult.getMethod().getMethodName());
        test =  report.startTest(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        test.log(LogStatus.PASS,iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test case Failed--"+iTestResult.getMethod().getMethodName()+"Taking Screenshot--");
        try{
            WebDriver driver = (WebDriver) iTestResult.getTestClass().getRealClass().getDeclaredField("driver").get(iTestResult.getInstance());
            String path = takeScreenShot(iTestResult.getMethod().getMethodName(), driver);
            System.out.println("Path is :"+path);
            test.log(LogStatus.FAIL,iTestResult.getThrowable());
            test.log(LogStatus.FAIL,test.addScreenCapture(path));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        report =  new ExtentReports(System.getProperty("user.dir")+"/src/ExtentReportResults.html");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        report.endTest(test);
        report.flush();
    }
}
