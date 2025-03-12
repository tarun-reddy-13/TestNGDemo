package listeners;

import org.testng.annotations.Test;

public class TestNGMiscConceptsDemo {
    @Test(invocationCount = 10)
    public void test1(){
        System.out.println("hello");
    }

    @Test(timeOut = 2000)
    public void test2(){
        int i=0;
        while(true)
            i++;
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void test3(){
        String s = "90%";
        System.out.println(Integer.parseInt(s));
    }
}
