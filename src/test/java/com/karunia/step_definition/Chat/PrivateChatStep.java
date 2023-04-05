package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.InboxPage;
import com.karunia.page_object.chat.PrivateChatPage;
import com.karunia.page_object.chat.TeamPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class PrivateChatStep {
    public AndroidDriver<AndroidElement> driver;

    public PrivateChatStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click menu button")
    public void userClickMenuButton() {
        TeamPage teamPage = new TeamPage(driver);
        teamPage.clickmenubtn();
    }

    @And("user click inbox button")
    public void userClickInboxButton() {
        TeamPage teamPage = new TeamPage(driver);
        teamPage.clickinbox();
    }

    @And("user click add new message button")
    public void userClickAddNewMessageButton() {
        InboxPage inboxPage = new InboxPage(driver);
        inboxPage.addmessageprivate();
    }

    @And("user type {string} in search name bar")
    public void userTypeInSearchNameBar(String lulu) {
        PrivateChatPage privateChatPage = new PrivateChatPage(driver);
        privateChatPage.addnamemember(lulu);
    }

    @And("User click lulu name")
    public void userClickLuluName() {
        PrivateChatPage privateChatPage = new PrivateChatPage(driver);
        privateChatPage.clicklulu();
    }

//    @And("user type {string} in search name bar")
//    public void userTypeInSearchNameBar(String lulu) {
//        PrivateChatStep privateChatStep = new PrivateChatStep(driver);
//        privateChatStep.ad
//    }
//
//
//    @And("User click lulu name")
//    public void userClickLuluName() {
//        PrivateChatStep privateChatStep = new PrivateChatStep(driver);
//        privateChatStep.clicklulu();

    //}
}
