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

public class TestingBarPage {
    public AndroidDriver<AndroidElement> driver;

    public TestingBarPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new comment...\"]")
    MobileElement addnewcommentbar;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText")
    MobileElement commentbar;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"a moment ago\n" + "Karunia Rahma_PQA15\n" + "testing\n" + "12:23 AM\"]")
    MobileElement testingcomment;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'testing')] | //android.view.View[contains(@content-desc, 'testing')]")
    MobileElement sendcomment;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\" ￼ \n" + "Karunia Rahma_PQA15\"]")
    MobileElement locatorkarunia;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"mention all\"]")
    MobileElement allmemberbtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement OKbtn;
    @AndroidFindBy(xpath = "//*[@text='Bold']")
    MobileElement boldbtn;

    @AndroidFindBy(xpath = "//*[@text='mention other user']")
    MobileElement addbtnuser;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Karunia')]")
    MobileElement komenkarunia;

    @AndroidFindBy(xpath = "(//*[@text=\"Tell your comment here...\"]/preceding-sibling::*)[1]")
    MobileElement barcomment;
    @AndroidFindBy(accessibility = "comments can't be empty")
    MobileElement emptyalert;


    public String getemptyalert () {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(emptyalert));

        return emptyalert.getAttribute("content-desc");
    }

    public void typecommentcheckin(String testing){

        barcomment.sendKeys(testing);
    }

    public boolean komenkarunia() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(komenkarunia));

        komenkarunia.isDisplayed();
        return true;
    }
    public void clickuser(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addbtnuser));
        addbtnuser.click();
    }
    public void clickcommentbar(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewcommentbar));
        addnewcommentbar.click();
    }
    public void typecommentbar(String testingcomment){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(commentbar));
        commentbar.click();
        commentbar.sendKeys(testingcomment);
    }
    public boolean commentcheckinisDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(sendcomment));

        sendcomment.isDisplayed();
        return true;
    }

    public String getcomment(){
        return sendcomment.getAttribute("content-desc");
    }
    public String getmembercomment(){
        return sendcomment.getAttribute("content-desc");
    }
    public void clickallmember(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(allmemberbtn));
        allmemberbtn.click();
    }
    public void clickOK(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(OKbtn));
        OKbtn.click();
    }
    public void clickcomment(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(commentbar));
        commentbar.click();
    }
    public void clickbold(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(boldbtn));
        boldbtn.click();
    }


}
