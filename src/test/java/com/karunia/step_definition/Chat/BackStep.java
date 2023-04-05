package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

import java.io.IOException;

public class BackStep {
    public AndroidDriver<AndroidElement> driver;


    public BackStep()throws IOException {
        super();
        this.driver = Hooks.driver;
    }
    @And("user click type message bar")
    public void userClickTypeMessageBar() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clicktypebar();
    }

    @And("user type messgae {string}")
    public void userTypeMessgae(String message) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.writemessage(message);

    }

    @And("user back in teampage")
    public void userBackInTeampage() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickback();
    }
}
