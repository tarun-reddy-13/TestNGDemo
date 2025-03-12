package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Base {
    private WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void takeSnapshot(WebDriver webDriver, String fileWithPath) throws Exception{
        //convert web driver object to TakeScreenShot
        TakesScreenshot screenshot = ((TakesScreenshot) webDriver);
        //Call getScreenshot As method to create image file
        File ScrFile = screenshot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile = new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(ScrFile, DestFile);
    }

    public void tearDown(){
        if(driver != null)
            driver.close();
    }

    protected WebDriver getDriver(){
        return driver;
    }

}
