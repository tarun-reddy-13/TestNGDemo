package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Base;

@Listeners(MyListener.class)
public class TestListenerDemo1 extends Base {

    @BeforeMethod
    public void setUp(){
        super.setUp();
    }

    @Test
    public void test1(){
        System.out.println("This is Test 1");
        getDriver().get("https://www.bbc.com");
        Assert.assertEquals("Apple", "apple");
    }

    @Test
    public void test2(){
        System.out.println("This is Test 2");
        getDriver().get("https://www.google.com");
        Assert.assertEquals("Apple", "Apple");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("This is Test 3");
        Assert.assertEquals("Apple", "Apple");
        throw new SkipException("Skipping this test case");
    }

    @AfterMethod
    public void tearDown(){
        super.tearDown();
    }

}
