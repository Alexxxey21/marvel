package com.marvel.developer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Алексей on 26.06.2019.
 */
public class FirstTest {

    @Test
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://developer.marvel.com");
        driver.manage().window().maximize();


    }
}
