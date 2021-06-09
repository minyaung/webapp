package com.simplilearn.webapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebappApplicationTests {

    private static String Base_Url = "http://172.16.93.5:8080/webapp/";
    private WebDriver driver;
    // private FirefoxOptions options;

    @Before
    public void setUp()
    {
        // System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	// options = FirefoxOptions();
	// options.addArguments("--headless");
        // driver = new FirefoxDriver(options);
        // driver.get(Base_Url);

        // Path chrome = Paths.get("/usr/bin/chromedriver");
        // chrome.toFile().setExecutable(true);
        // System.setProperty("webdriver.chrome.driver", chrome.toAbsolutePath().toString());

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions); 
	driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }

    @Test
    public void testCasePassed()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Welcome to Tomcat Maven Application Home Page!')]")).isDisplayed());
    }
}
