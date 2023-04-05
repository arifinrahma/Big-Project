package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SendPhoto {
    public AndroidDriver<AndroidElement> driver;
    public SendPhoto (){
        super();
        this.driver = Hooks.driver;}
    @And("Click attach file")
    public void clickAttachFile() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.ClickAttachbtn();
    }

    @And("User Click Image from Galery")
    public void userClickImageFromGalery() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.ChooseImg();
    }

    @And("User choose file")
    public void userChooseFile() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickfile();
    }

    @Then("image is show and sent")
    public void imageIsShowAndSent() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.photoisdisplayed());
    }
}
