package com.karunia.page_object.chat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivateChatPage {
    //AppiumDriver driver;

//    public PrivateChatPage (AppiumDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
public AndroidDriver<AndroidElement> driver;

    //public GroupChatPage(AppiumDriver driver){
    public PrivateChatPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement addmessagebtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Company Members\"]/android.widget.EditText")
    MobileElement searchname;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Lulu Qorri Aina_PQA15\"]")
    MobileElement namelulu;
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'not found')]")
    MobileElement membernotfound;


    public void addmessageprivate() {

        addmessagebtn.click();
    }
    public void addnamemember(String lulu) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(searchname));

        searchname.click();
        searchname.sendKeys(lulu);
    }
    public void clicklulu() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(namelulu));

        namelulu.click();
    }
    public void addwrongmane(String wrongname) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(searchname));

        searchname.click();
        searchname.sendKeys(wrongname);
    }

    public boolean isDisplayedname(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(membernotfound));
        membernotfound.isDisplayed();
        return true;
    }

}
