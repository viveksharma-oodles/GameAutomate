package org.example;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileTest {

    public static AndroidDriver driver;
    @BeforeTest
    public static void init() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("TestDevice");
        options.setApp(System.getProperty("user.dir")+"/testApps/app2.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Viéw menù']")).click();
    }

    @Test
    public static void testAndroidFlow() {

    }

    @AfterTest
    public static void quit() {
        driver.quit();
    }
}
