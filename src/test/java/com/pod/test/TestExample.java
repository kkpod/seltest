package com.pod.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Specify the path to the chromedriver.exe
//        System.setProperty("webdriver.chrome.driver", "C:\\test\\sel\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        // Specify the path to the chrome.exe
//        System.setProperty("webdriver.chrome.binary", "C:\\test\\sel\\chrome-win64\\chrome-win64\\chrome.exe");

        System.setProperty("webdriver.chrome.driver", "chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.binary", "chrome-win64\\chrome.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void exampleTest() {
        // Your test code here
        driver.get("https://www.example.com");
        // Add more test steps
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
