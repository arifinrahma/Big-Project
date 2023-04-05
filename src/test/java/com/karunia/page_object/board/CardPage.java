package com.karunia.page_object.board;

import com.sun.javafx.scene.traversal.Direction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class CardPage {
    public AndroidDriver<AndroidElement> driver;

    public CardPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(accessibility = "Add new comment...")
    MobileElement addnewcomment;
    @AndroidFindBy(xpath = "//*[@text=\"Tell your comment here...\"]")
    MobileElement addnewcommenttype;
    @AndroidFindBy(accessibility = "submit")
    MobileElement submitcommentbtn;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"a moment ago\n" + "Karunia Rahma_PQA15\n" + "Aa\n" + "8:03 PM\"]")
    MobileElement getcomment;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"comments can't be empty\"]")
    MobileElement spacealert;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[3]")
    MobileElement numberlist;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')]")
    MobileElement commentcard;
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'testing')]")
    MobileElement awal;
    @AndroidFindBy(accessibility = "update title success")
    MobileElement alertupdate;

    public void geserbawah(){
        MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollintoView(" + "new UiSelector().description(\"comment\"));");
        awal.click();
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText")
    MobileElement isikomen;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"testing\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
    MobileElement edit;

    @AndroidFindBy(xpath = "//*[@text=\"testing, Type Card title here...\"]")
    MobileElement filledit;
    @AndroidFindBy(xpath = "(//*[contains(@content-desc,'Attachmen')]/child::*)[2]")
    MobileElement cheklistbtn;

    public void setCheklistbtn (){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(cheklistbtn));

        cheklistbtn.click();


    }

    public void setFilledit(String last){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(filledit));

        filledit.sendKeys(last);

    }
    public void edittitle (){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(edit));

        edit.click();


    }
    public boolean CommentisDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(commentcard));

        commentcard.isDisplayed();
        return true;
    }
    public void addnewcommentincard(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewcomment));

        addnewcomment.click();
    }
    public void clicktellme (){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewcommenttype));
        addnewcommenttype.click();
    }
    public void typecomment(String testing) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(isikomen));

        isikomen.sendKeys(testing);
    }

//    Dimension dimension = driver.manage().window().getSize();
//    int x = (int) (dimension.width * 0.5);
//    int y = (int) (dimension.height * 0.8);

    public void clicksubmitcomment(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(submitcommentbtn));

        submitcommentbtn.click();
    }
//    public void addspace(String space) {
//        addnewcommenttype.sendKeys(space);
    //}

    public String getspacealert(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(spacealert));
        return spacealert.getAttribute("content-desc");
    }

    public String getupdatealert(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alertupdate));
        return alertupdate.getAttribute("content-desc");
    }
    public void clicklistnumber(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(numberlist));

        numberlist.click();
    }
}
