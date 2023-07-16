package org.example.stepDefs;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.http.ConnectionFailedException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver ;
    @Before
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        {
            Thread.sleep(1500);
            driver.close();
        }
    }
}
