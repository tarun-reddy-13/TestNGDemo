import org.testng.annotations.Test;

public class DataProviderDemo {

    //@Test(dataProvider = "loginData") if data provider is in same class

    //if in different package -- use fully qualified class name.

    //if in another class -- use classname.class
    @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtil.class)
    public void testLogin(String email, String password){
        System.out.println("Email is "+email+" Password is "+password);
    }
}
