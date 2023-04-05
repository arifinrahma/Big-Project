package com.karunia.step_definition;

import com.mashape.unirest.http.exceptions.UnirestException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    //public static WebDriver driver;
    public static AndroidDriver<AndroidElement> driver;

    @Before
    public void openBrowser() throws MalformedURLException, InterruptedException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "a5f797340511");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Thread.sleep(5000);
    }

    @After
    public void closeBrowser(Scenario scenario) throws UnirestException, IOException {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", scenario.getName());
        }
        //driver.quit();


    }
}
