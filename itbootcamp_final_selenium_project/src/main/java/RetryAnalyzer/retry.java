package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {

    private int count = 0;
    private int maxRetry = 3;


    @Override
    public boolean retry (ITestResult iTestResult) {
        if (count < maxRetry){
            count++;
            return true;
        }
        return false;
    }
}
