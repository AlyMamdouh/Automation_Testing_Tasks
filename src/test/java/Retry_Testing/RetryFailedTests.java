package Retry_Testing;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class RetryFailedTests
{
    @Test
    public void Test1_Retry()
    {
        System.out.println("I'm inside Test1");
    }


    @Test ( retryAnalyzer = ReTest.class )
    public void Test2_Retry()
    {
        System.out.println("I'm inside Test2");
        Assert.assertTrue(0>1);
    }

}
