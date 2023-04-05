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

public class DelateChatStep {
    public AndroidDriver<AndroidElement> driver;

    public DelateChatStep (){
        super();
        this.driver = Hooks.driver;}
    @Given("user already in home cicle app")
    public void userAlreadyInHomeCicleApp() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.isDisplayed());
    }

    @When("user click sekolah qa{int}")
    public void userClickSekolahQa(int arg0) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openTeam(1);
    }

    @And("user click group chat")
    public void userClickGroupChat() throws Exception{
        TeamPage teamPage = new TeamPage(driver);
        teamPage.openGroupChat();
    }

    @And("User click last message")
    public void userClickLastMessage() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.delatelastmessage();

    }

    @And("User click delate button")
    public void userClickDelateButton() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.DelateMessage();
    }

    @And("User click OK")
    public void userClickOK() throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.OkDelateChat();
    }

    @Then("last message is {string}")
    public void userCanSeeThatLastMessageIsDeleted(String delete) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        //String alertterhapus = groupChatPage.hapuspesan();
        //Assert.assertTrue(groupChatPage.hapuspesan().contains(delete));
        Assert.assertEquals(groupChatPage.hapuspesan(),delete);
    }

    @Then("user can see alert hapus")
    public void userCanSeeAlertHapus() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertTrue(groupChatPage.deletedisdisplayed());
    }
}
