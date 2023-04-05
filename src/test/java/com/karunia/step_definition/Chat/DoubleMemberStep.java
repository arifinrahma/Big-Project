package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DoubleMemberStep {
    public AndroidDriver<AndroidElement> driver;

    public DoubleMemberStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click add member button")
    public void userClickAddMemberButton() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickadd();
    }

    @And("user click karunia")
    public void userClickKarunia() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickkarunia();
    }

    @And("click send message button")
    public void clickSendMessageButton() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clicksend();
    }

//    @Then("member is not added message show email{string}")
//    public void memberIsNotAddedMessageShowEmail(String member) {
//        GroupChatPage groupChatPage = new GroupChatPage(driver);
//
//        String LastMessage = groupChatPage.getLastMessage();
//        Assert.assertTrue(LastMessage.contains(member));
//    }

    @Then("member is not added message show email {string}")
    public void memberIsNotAddedMessageShowEmail(String member) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.isDisplayedemail());
    }
}
