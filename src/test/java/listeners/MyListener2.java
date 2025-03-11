package listeners;

import org.testng.TestListenerAdapter;

public class MyListener2 extends TestListenerAdapter {
    //override methods from TestListenerAdapter for
    //custom implementation
    //like OnTestSuccess()-->send email to stake holders
    // or log this event in a log file, etc..
}
