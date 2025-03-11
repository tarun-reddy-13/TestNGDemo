package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestListenerDemo {
    @Test
    public void test1()
    {
        System.out.println("This is test 1");
        Assert.assertEquals("Apple", "Apple");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
        Assert.assertEquals("Apple", "Banana");
    }

    @Test
    public void test3(){
        System.out.println("This is test 3");
        Assert.assertEquals("Apple", "Apple");
        throw new SkipException("Skipping this case");
    }
}
