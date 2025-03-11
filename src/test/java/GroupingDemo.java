import org.testng.annotations.Test;

public class GroupingDemo {

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("Test1 executed.... ");
    }

    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("Test2 executed.... ");
    }

    @Test(groups = {"smoke", "regression"})
    public void test3(){
        System.out.println("Test3 executed.... ");
    }

    @Test(groups = {"regression"})
    public void test4(){
        System.out.println("Test4 executed.... ");
    }
}
