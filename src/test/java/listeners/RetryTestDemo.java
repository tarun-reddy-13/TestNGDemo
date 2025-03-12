package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//figure out how to configure this file with RetryAnnotationTransformer class
public class RetryTestDemo {
    static int count = 0;

    @Test
    //@Test(retryAnalyzer = listeners.RetryListener.class)
    public void test1() throws InterruptedException{
        count++;
        String actualOutput = "Today is Saturday";
        String expectedOutput = "Today is Sunday";
        System.out.println("Count is : "+count);
        Assert.assertEquals(actualOutput, expectedOutput);
    }

    @Test
   // @Test(retryAnalyzer = listeners.RetryListener.class)
    public void test2(){
        Assert.assertEquals("Today is Sunday", "Today is Monday");
    }
}
