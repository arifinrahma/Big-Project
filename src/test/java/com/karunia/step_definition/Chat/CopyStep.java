package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CopyStep {
    public AndroidDriver<AndroidElement> driver;


    public CopyStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click message")
    public void userClickMessage() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.ClickMessage();
    }

    @And("user click copy button")
    public void userClickCopyButton() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.CopyMessage();
    }

    @Then("user can see alert {string}")
    public void userCanSeeAlertMessageIsCopied(String copymessage) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
//        String alrtcopy = groupChatPage.getcopymessage();
//        Assert.assertTrue(alrtcopy.contains(copymessage));

        Assert.assertTrue(groupChatPage.isDisplayedcopy());

    }
}
