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

public class CreateQuestionPage {
    public AndroidDriver<AndroidElement> driver;

    public CreateQuestionPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//*[@text=\"type question here...\"]")
    MobileElement questionbar;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start collecting answer!\"]")
    MobileElement startcollectanswerbtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"how often the question is asked to be filled in\"]")
    MobileElement alertfilldate;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"time must be filled\"]")
    MobileElement alerttime;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mon\"]")
    MobileElement monbtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"set time\"]")
    MobileElement settimebtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Switch")
    MobileElement privateswitchcheckin;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"question must be filled\"]")
    MobileElement emptyquestionalert;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"how often the question is asked to be filled in\"]")
    MobileElement alertfillquestionbar;

    @AndroidFindBy(accessibility = "What question do you want to ask?")
    MobileElement screen;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Is the question for private only?\"]/following-sibling::*)[1]")
    MobileElement privateswitch;

    public void switchprivate() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(privateswitch));
        privateswitch.click();
    }
    public void clickscreen() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(screen));
        screen.click();
    }
    public void clickanswer() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(startcollectanswerbtn));
        startcollectanswerbtn.click();
    }
    public void getalertfilldate () {
        alertfilldate.click();
    }
    public void getalerttime () {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alerttime));
        alerttime.click();
    }
    public void clickmondaybtn () {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(monbtn));
        monbtn.click();
    }
    public void clicksettime () {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(settimebtn));
        settimebtn.click();
    }
    public void clickprivatecheckin () {
        privateswitchcheckin.click();
    }
    public void getalertemptyquestion () {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(emptyquestionalert));
        emptyquestionalert.click();
}

    public void typequestionbar (String question) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(questionbar));

    questionbar.click();
    questionbar.sendKeys(question);
    }
    public boolean alertisDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alertfillquestionbar));
        alertfillquestionbar.isDisplayed();
        return true;
    }





}
