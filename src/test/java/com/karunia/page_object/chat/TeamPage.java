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

public class TeamPage {

//    AppiumDriver driver;
//
//    public TeamPage(AppiumDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
public AndroidDriver<AndroidElement> driver;

    //public GroupChatPage(AppiumDriver driver){
    public TeamPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Group Chat\"]")
    MobileElement groupChat;
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Menu')]")
    MobileElement Menubtn;
    @AndroidFindBy (xpath = "//*[contains(@content-desc,'Inbox')]")
    MobileElement inboxbtn;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Board\"]")
    MobileElement boardbtn;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Check-Ins\"]")
    MobileElement Checkinbtn;


    public void openGroupChat(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(groupChat));

        groupChat.click();
    }
    public void clickmenubtn() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(Menubtn));
        Menubtn.click();
    }
    public void clickinbox() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(inboxbtn));
        inboxbtn.click();
    }
    public void clickboard() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(boardbtn));
        boardbtn.click();
    }
    public void clickcheckin() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(Checkinbtn));
        Checkinbtn.click();
    }


}
