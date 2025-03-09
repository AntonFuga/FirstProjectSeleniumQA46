package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SimpleLocatorsExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementsWithSimpleLocators() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        System.out.println(registerLink.getText());
        //Поиск ссылки "Register" по тексту ссылки

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        System.out.println(loginLink.getText());
        //Поиск ссылки "Log in" по тексту ссылки

        WebElement wishListLink = driver.findElement(By.linkText("Wishlist"));
        System.out.println(wishListLink.getText());
        //Поиск ссылки "Wishlist" по тексту ссылки

        WebElement cartLink = driver.findElement(By.linkText("Shopping cart"));
        System.out.println(cartLink.getText());
        //Поиск ссылки "Shopping cart" по тексту ссылки

        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        System.out.println(searchBox.getAttribute("placeholder"));
        //Поиск поля ввода поиска по id

        WebElement searchButton = driver.findElement(By.className("search-box-button"));
        System.out.println(searchButton.getAttribute("value"));
        //Поиск кнопки поиска по имени класса

        WebElement booksLink = driver.findElement(By.linkText("Books"));
        System.out.println(booksLink.getText());
        //Поиск ссылки "Books" из верхнего меню

        WebElement computersLink = driver.findElement(By.linkText("Computers"));
        System.out.println(computersLink.getText());
        //Поиск ссылки "Computers" из верхнего меню

        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        System.out.println(electronicsLink.getText());
        // Поиск ссылки "Electronics" из верхнего меню

        WebElement jewelryLink = driver.findElement(By.linkText("Jewelry"));
        System.out.println(jewelryLink.getText());
        //Поиск ссылки "Jewelry" из верхнего меню
    }

    @Test
    public void findElementsByCssSelectors() {
        WebElement registerLink = driver.findElement(By.cssSelector("a.ico-register"));
        System.out.println(registerLink.getText());

        WebElement loginLink = driver.findElement(By.cssSelector("a.ico-login"));
        System.out.println(loginLink.getText());

        WebElement wishListLink = driver.findElement(By.cssSelector("a.ico-wishlist"));
        System.out.println(wishListLink.getText());

        WebElement cartLink = driver.findElement(By.cssSelector("a.ico-cart"));
        System.out.println(cartLink.getText());

        WebElement searchBox = driver.findElement(By.cssSelector("input#small-searchterms"));
        System.out.println(searchBox.getAttribute("placeholder"));

        WebElement searchButton = driver.findElement(By.cssSelector("input.search-box-button"));
        System.out.println(searchButton.getAttribute("value"));

        WebElement booksLink = driver.findElement(By.cssSelector("ul.top-menu > li > a[href='/books']"));
        System.out.println(booksLink.getText());

        WebElement computersLink = driver.findElement(By.cssSelector("ul.top-menu > li > a[href='/computers']"));
        System.out.println(computersLink.getText());

        WebElement electronicsLink = driver.findElement(By.cssSelector("ul.top-menu > li > a[href='/electronics']"));
        System.out.println(electronicsLink.getText());

        WebElement jewelryLink = driver.findElement(By.cssSelector("ul.top-menu > li > a[href='/jewelry']"));
        System.out.println(jewelryLink.getText());
    }
}
