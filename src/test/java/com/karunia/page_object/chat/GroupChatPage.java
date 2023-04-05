package com.karunia.page_object.chat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupChatPage {

    //AppiumDriver driver;
    public AndroidDriver<AndroidElement> driver;

    //public GroupChatPage(AppiumDriver driver){
    public GroupChatPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    MobileElement chatBox;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Home')]")
    MobileElement homebtn;

    @AndroidFindBy(xpath = "(//android.widget.Button)[last()]")
    MobileElement sendButton;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> sendMessage;


//    public static String getLastMessage2(){
//        return value.get("getLastMessage");
//    }
//    static HashMap<String,String> value = new HashMap<>();
//
//    public static void test(){
//
//        static  MobileElement sendMessage;
//        value.put("getLastMessage",sendMessage.get(sendMessage.size()-1).getAttribute("content-decc"));
//    }



    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageView']")
    List<MobileElement> gambarimg;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    MobileElement LastMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete\"]")
    MobileElement Delatebtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement OKDelatebtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete group chat message success\"]")
    MobileElement alertterhapus;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Delete group chat message success')]")
    List<MobileElement> delatedmessagebar;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Panda\n" + "09:37 PM\"]")
    MobileElement Message;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Copy\"]")
    MobileElement Copy;
    @AndroidFindBy(accessibility = "copy text to clipboard")
    MobileElement alrtcopy;

    @AndroidFindBy(accessibility = "Delete group chat message success")
    MobileElement alrtdeleted;
    public boolean deletedisdisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alrtdeleted));

        alrtdeleted.isDisplayed();
        return true;
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
    MobileElement attachbtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Image from Gallery\"]")
    MobileElement imagebtn;
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'MB')]")
    MobileElement filephotobtn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=(@content-desc, 'AM')] | //android.widget.ImageView[contains(@content-desc, 'PM')] ")
    MobileElement photomessgae;

    public boolean photoisdisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(photomessgae));

        photomessgae.isDisplayed();
        return true;
    }

    @AndroidFindBy(accessibility = "Back")
    MobileElement backbtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
    MobileElement add;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Karunia Rahma_PQA15\"]")
    MobileElement karunia;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'workbusiness5858@gmail.comworkbusiness5858@gmail.com')]")
    MobileElement emailmsg;
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Karunia Rahma_PQA15')]")
    MobileElement namekarunia;

    public boolean isDisplayedmember(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(namekarunia));

        namekarunia.isDisplayed();
        return true;
    }

    public boolean isDisplayedemail(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(emailmsg));

        emailmsg.isDisplayed();
        return true;
    }
    public void sendChat( String message ){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(chatBox));
//        WebDriver wait = new WebDriverWait(driver,150);
//        wait.until
        chatBox.click();
        chatBox.sendKeys(message);
    }
    public void clicksendpesan(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
    }
    public void clicktypebar() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(chatBox));
        chatBox.click();
    }
    public void writemessage (String message){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(chatBox));
        chatBox.sendKeys(message);
    }

    public boolean isDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(homebtn));

        homebtn.isDisplayed();
        return true;
    }
    public boolean isDisplayedcopy(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alrtcopy));

        alrtcopy.isDisplayed();
        return true;
    }
//    public boolean tampilgambar(){
//        gambarimg.isDisplayed();
//        return true;
//    }

    public String getLastMessage(){

        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }

//    public static void test(){
//        value.put("getLastMessage",lastMessage.get(lastMessage.size()-1).getAttribute("content-decc"));
//    }

    public String getLastMessagePhoto(){

        return gambarimg.get(gambarimg.size()-1).getAttribute("content-desc");
    }
    public String hapuspesan(){

        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }
    public String pesanemail(){

        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }
//    public void ClickChat (){
//        LastMessage.click();
//
//    }
    public void DelateMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(Delatebtn));

        Delatebtn.click();
    }
    public void OkDelateChat(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(OKDelatebtn));

        OKDelatebtn.click();
    }
    public void delatelastmessage(){

        sendMessage.get(sendMessage.size()-1).click();

    }
    //public String terhapus(){
        //return alertterhapus.getAttribute("content-desc");
    //}
    public void ClickMessage(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(Message));
        Message.click();
    }
    public void CopyMessage(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(Copy));
        Copy.click();
    }
    public String getcopymessage() {
        return alrtcopy.getAttribute("copy text to clipboard");
    }
    public void ClickAttachbtn() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(attachbtn));
        attachbtn.click();
    }
    public void ChooseImg() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(imagebtn));
        imagebtn.click();
    }
    public void clickfile() {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(filephotobtn));
        filephotobtn.click();
    }

//    public String verifyimage() {
//        return photomessgae.get(photomessgae.size()-1).;
//    }
//    public void verifymsg(){
//        System.out.println(alrtcopy.isDisplayed());
//    }

    public void doubleclick(){
        Actions act = new Actions(driver);
        act.doubleClick(LastMessage).perform();
    }
    public void LongPres(){
        TouchActions action = new TouchActions(driver);
        action.longPress((WebElement) sendMessage);
        action.perform();
    }
    public void clickback(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(backbtn));
        backbtn.click();
    }

    public void clickadd(){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(add));
        add.click();
    }
    public void clickkarunia(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(karunia));
        karunia.click();
    }
    public void clicksend(){

        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
    }

    public String member(){

        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
    }
    //static HashMap<String,String> value = new HashMap<>();

//    public static String test(){
//
//        value.put("getLastMessage",LastMessage.get(LastMessage.size()-1).getAttribute("content-decc"));
//    }
//
//    public static String getLastMessage2(){
//        return value.get("getLastMessage");
//    }
//    public String getLastMessage(){
//
//        return sendMessage.get(sendMessage.size()-1).getAttribute("content-desc");
//    }
//public void longPress1() {
//    //WebElement element = driver.findElementById("myElementId");
//
//    //TouchAction touchAction = new TouchAction(driver);
//    GroupChatPage groupChatPage = new GroupChatPage(driver);
//    LongPressOptions longPressOptions = LongPressOptions.longPressOptions()
//            .withElement(ElementOption.element((MobileElement)sendMessage))
//            .withDuration(Duration.ofSeconds(3)); // adjust duration as needed
//    groupChatPage.longPress1(longPressOptions).release().perform();
//}



}


