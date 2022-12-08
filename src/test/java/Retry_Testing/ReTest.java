package Retry_Testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTest implements IRetryAnalyzer
{

    private int retryCount = 0;
    private static final int maxRetryCount = 5;         // 3adad el marrat elle hy3ml feha retest fe 7alet el fail

    @Override
    public boolean retry(ITestResult result)
    {
        if (retryCount < maxRetryCount)
        {
            retryCount++;
            return true;
        }
        return false;
    }
}
