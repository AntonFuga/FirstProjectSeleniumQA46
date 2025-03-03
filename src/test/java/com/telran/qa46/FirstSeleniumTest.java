package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp(){
       driver = new ChromeDriver();
//        driver.get("https://www.google.com");

        // maximaze browser to window
        driver.manage().window().maximize();

        driver.navigate().to("https://www.trello.com");

        //wait for all elements on the to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
   @Test
   public void openGoogle(){
        System.out.println("GoogleOpened");
   }
    // After -  tearDown

    @AfterMethod(enabled = true)
    public void tearDown(){
//        driver.quit();
        driver.close();
    }

}
