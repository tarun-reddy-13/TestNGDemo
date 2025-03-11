import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider(name = "loginData")
    public Object[][] emailData(){
        return new Object[][]
                {
                        {"tarun@gmail.com", "tarun"},
                        {"karan@gmail.com", "karan"},
                        {"arun@gmail.com", "arun"}
                };
    }
}
