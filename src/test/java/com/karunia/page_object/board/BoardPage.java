package com.karunia.page_object.board;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoardPage {
    public AndroidDriver<AndroidElement> driver;

    public BoardPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement addboardbtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    MobileElement addnewlistbar;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    MobileElement submitboardbtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"testing1\"]")
    MobileElement lastboard;
    //android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')]

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Add new card\"])[1]")
    MobileElement addnewcardbtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText")
    MobileElement addnamecard;
    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View")
    MobileElement addbtnnewcard;
    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"testing\n" + "Show menu\"]")
    MobileElement testingcard;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch" )
    MobileElement privateswitch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
    MobileElement rightbtnlist;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Archive this list\"]")
    MobileElement archivebtnlist;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"List has been moved to archive\"]")
    MobileElement alertarchivelist;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"testing\n" + "Show menu\"]")
    MobileElement tetsingcard;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View")
    MobileElement centangbtn;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'testing')]")
    MobileElement cardtesting;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'testing')] | //*[contains(@content-desc,'@#$%&+')] ")
    MobileElement listboard;


    public boolean boardisDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(listboard));

        listboard.isDisplayed();
        return true;
    }

    public boolean cardisDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(cardtesting));

        cardtesting.isDisplayed();
        return true;
    }

    public void clickcentang() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(centangbtn));
        centangbtn.click();
    }

    public void clickaddboard() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addboardbtn));
        addboardbtn.click();
    }
    public void addlistboard() {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewlistbar));
        addnewlistbar.sendKeys("testing");
    }
    public void submitboard(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(submitboardbtn));
        submitboardbtn.click();
    }
//    public String getlastboard(){
//
//        //return lastboard.get(lastboard.size()-1).getAttribute("content-desc");
//    }
    public void addnewcard(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewcardbtn));
        addnewcardbtn.click();
    }
    public void namecard(String testing){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnamecard));
        addnamecard.click();
        addnamecard.sendKeys(testing);
    }
//    public void submitcard(){
//        addbtnnewcard.click();
//    }
//    public void gettestingcard(){
//        if
    //}
    public void switchprivatecard(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(privateswitch));
        privateswitch.click();
}
    public void clickbuttonlist(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(rightbtnlist));
        rightbtnlist.click();
    }
    public void clickarchivelist(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(archivebtnlist));
        archivebtnlist.click();
    }
    public void getAttributelist(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alertarchivelist));
        alertarchivelist.getAttribute("content-desc");
    }
    public void clicktetsingcard(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(testingcard));
        testingcard.click();
    }
    public void addsymbollist(String ListSymbol) {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnewlistbar));
        addnewlistbar.sendKeys(ListSymbol);
    }
    public void addsymbolcard(String CardSymbol) {

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(addnamecard));
        addnamecard.sendKeys(CardSymbol);
    }

}
