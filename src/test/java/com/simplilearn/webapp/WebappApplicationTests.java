package com.simplilearn.webapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebappApplicationTests {

    private static String Base_Url = "http://172.16.93.5:8080/webapp/";
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }

    // @Test
    // public void testCasePassed()
    // {
    //     Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Welcome to Tomcat Maven Application Home Page!')]")).isDisplayed());
    // }
}
