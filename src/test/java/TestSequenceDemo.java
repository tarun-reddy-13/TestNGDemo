import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//if order of execution is not configured,
// then test cases executes alphabetically

public class TestSequenceDemo {

    //priority used to assign order of execution (low to high)
    @Test(priority = 1)
    public void c(){
        System.out.println("C test case called");
    }

    @Test(priority = 2, enabled = false)
    public void a(){
        System.out.println("A test case called");
    }

    @Test(priority = 3)
    public void b(){
        System.out.println("B test case called");
    }

    @Test(enabled = false)
    public void t1(){

    }
}
