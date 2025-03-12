package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
    int attemptCounter = 0;
    int maxTryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult){
        if(!iTestResult.isSuccess()){
            if(attemptCounter<maxTryCount){
                attemptCounter++;
                return true;
            }
            else{
                iTestResult.setStatus(ITestResult.FAILURE);
                return false;
            }
        }else{
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }
}
