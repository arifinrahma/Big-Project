package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ImputEmailStep {
    public AndroidDriver<AndroidElement> driver;


    public ImputEmailStep(){
        super();
        this.driver = Hooks.driver;
    }
    @Then("last message is member id")
    public void lastMessageIsMemberId() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.isDisplayedmember());
    }
}
