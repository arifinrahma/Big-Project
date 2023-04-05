package com.karunia.page_object.Checkin;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimePage {
    public AndroidDriver<AndroidElement> driver;

    public TimePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    MobileElement OKtimebtn;

    @AndroidFindBy(accessibility = "Switch to text input mode")
    MobileElement keyboardbtn;

    @AndroidFindBy(xpath = "//*[@text=\"9, Hour\"]")
    MobileElement numbernine;

    @AndroidFindBy(accessibility = "Enter a valid time")
    MobileElement alerttime;

    public void settime() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(OKtimebtn));
        OKtimebtn.click();
    }
    public void clickkeyboard() {
        keyboardbtn.click();
    }
    public void clicknumber(String nol) {
        numbernine.click();
        numbernine.sendKeys(nol);
    }
    public String getalerttime(){
        return alerttime.getAttribute("content-desc");
    }

}
