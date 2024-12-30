package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest {
    public static WebDriver driver;
    @BeforeTest
    public static void init() {
//        System.setProperty("webdriver.chrome.driver", "//moonshinedevs-interview_repo-efa2ec0b570d//chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @Test
    public static void testWebFlow() {
        try {
        	
            driver.findElement(By.xpath("//span[@text='Refrigerators']")).click();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        driver.quit();
    }

    @AfterTest
    public static void quit() {
        try {
            driver.quit();
        }
        catch(Exception e){

        }
    }
}
