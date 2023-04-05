package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DoubleclickStep {
    public AndroidDriver<AndroidElement> driver;

    public DoubleclickStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("User double click last message bar")
    public void userDoubleClickLastMessageBar() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.doubleclick();
    }

}
