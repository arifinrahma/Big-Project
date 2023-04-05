package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.TestingBarPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MemberCommentCheckINStep {
    public AndroidDriver<AndroidElement> driver;

    public MemberCommentCheckINStep() {
        super();
        this.driver = Hooks.driver;
    }

    @And("user click add member button in check in")
    public void userClickAddMemberButtonInCheckIn() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickuser();
    }
    @Then("user can see that comment is made with {string} tag")
    public void userCanSeeThatCommentIsMadeWithTag(String Karunia) {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        Assert.assertTrue(testingBarPage.komenkarunia());
    }
}
