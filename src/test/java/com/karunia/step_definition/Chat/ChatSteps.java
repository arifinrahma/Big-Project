package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.GroupChatPage;
import com.karunia.page_object.chat.HomePage;
import com.karunia.page_object.chat.TeamPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChatSteps {

    public AndroidDriver<AndroidElement> driver;

    public ChatSteps(){
        super();
        this.driver = Hooks.driver;
    }

    @Given("User on the chat group page")
    public void userOnTheChatPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);

        TeamPage teamPage = new TeamPage(driver);
        teamPage.openGroupChat();
        Thread.sleep(2000);

        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.isDisplayed());
    }

    @When("User send {string}")
    public void userSendMessage(String message) throws InterruptedException {

        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.sendChat(message);
        Thread.sleep(2000);

    }

    @Then("Last message is {string}")
    public void verifyLastMessage(String message) throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(driver);

        String lastMessage = groupChatPage.getLastMessage();
        Assert.assertTrue(lastMessage.contains(message));
        Thread.sleep(2000);
    }

    @And("user click send")
    public void userClickSend() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clicksendpesan();
        Thread.sleep(3000);
    }
}
