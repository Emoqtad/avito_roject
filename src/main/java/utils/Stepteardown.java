package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Stepteardown {
    public static WebDriver driver;
    String chromepath ="C:\\chromedriver\\chromedriver_win32\\chromedriver.exe";

    @BeforeTest
    public void launchtest(){
        System.out.println("Test Suite started");
    }

    @AfterTest
    public void terminatetest(){
        driver.close();
        System.out.println("browser is closed");
    }

    @BeforeMethod
    public void launchbrowser() throws InterruptedException {
        System.out.println("Browser is opening");
        System.setProperty("webdriver.chrome.driver", chromepath);
        driver = new ChromeDriver();
        driver.get("https://www.avito.ma");
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }

    @AfterMethod void closebrower(){
        driver.close();
        System.out.println("browser is closed");
    }

}
