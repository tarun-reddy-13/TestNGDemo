package listeners;

import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Base;

public class  MyListener extends Base implements ITestListener{

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Starting execution of test "+iTestResult.getName());
    }

    @SneakyThrows
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("On successful execution of test "+iTestResult.getName());
        String path = System.getProperty("user.dir")+"\\Screenshots\\"+iTestResult.getMethod().getMethodName()+".png";
        System.out.println("Path: "+path);
        takeSnapshot(getDriver(), path);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On failure execution of test "+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("On skipping test "+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("On Test Failed But With in Success Percentage "+iTestResult.getName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Started executing test batch "+iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Started executing test batch "+iTestContext.getName());
    }
}
