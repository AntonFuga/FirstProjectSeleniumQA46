package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
//        driver.findElement(By.tagName("h1"));
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());



    WebElement a = driver.findElement(By.tagName("a"));
    System.out.println(a.getText());

    //Find list of elements
        List<WebElement> a1 = driver.findElements(By.tagName("a"));
        System.out.println(a1.size());


    }

    @Test
    public void findElementBySimpleLocators() {
        driver.findElement(By.id("city"));

        //by className
        driver.findElement(By.className("mobile-header"));
        //by LinkText

        driver.findElement(By.linkText("Let the car work"));
        System.out.println(driver.findElement(By.linkText("Let the car work")));

        //by.partiaLinkText

        driver.findElement(By.partialLinkText("car"));


    }


    @Test
    public void findElementByCssSelector() {
        //tagName == css
        driver.findElement(By.cssSelector("h1"));


//        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector(".mobile-header"));
        //[attr='value']
        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        //contains->*

        driver.findElement(By.cssSelector("[href*='/login']"));

        //star->^

        driver.findElement(By.cssSelector("[href^='/log']"));

        driver.findElement(By.cssSelector("[href$='search']"));
    }


}
//city