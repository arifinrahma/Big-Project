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

public class CheckinPage {

    public AndroidDriver<AndroidElement> driver;

    public CheckinPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement addcheckinbtn;
    @AndroidFindBy(accessibility = "Create question successful")
    MobileElement getalertcheckin;

    //(//*[contains(@content-desc,'testing')]
    @AndroidFindBy(xpath = "(//*[contains(@content-desc,'testing')])[1]")
    MobileElement tetsingbar1;

    //
    public void clickaddbtn() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addcheckinbtn));
        addcheckinbtn.click();
    }
    public void getchecin() {
        getalertcheckin.click();
    }
    public void clicktetsingbar() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(tetsingbar1));
        tetsingbar1.click();
    }
    public boolean alertisDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(getalertcheckin));

        getalertcheckin.isDisplayed();
        return true;
    }

}
