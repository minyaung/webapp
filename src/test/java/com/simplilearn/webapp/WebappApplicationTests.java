package com.simplilearn.webapp;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// @SpringBootTest
public class WebappApplicationTests {

    private static String Base_Url = "http://172.16.93.5:8080/webapp/";
    private WebDriver driver;

    @Before
    public void setUp()
    {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
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

    @Test
    public void testCasePassed()
    {
        // Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Hello World')]")).isDisplayed());
        // Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Hello World')]")).isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("//form[@id='failed case']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Hello World!')]")).isDisplayed());
    }

    // @Ignore
    // @Test
    // public void testCaseIgnored()
    // {
    //     Assert.assertTrue(driver.findElement(By.xpath("//form[@id='ignored case']")).isDisplayed());
    // }

}
