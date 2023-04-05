package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CheckinPage;
import com.karunia.page_object.Checkin.TestingBarPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CommentCheckInStep {
    public AndroidDriver<AndroidElement> driver;

    public CommentCheckInStep() {
        super();
        this.driver = Hooks.driver;
    }

    @And("user click {string} check in")
    public void userClickCheckIn(String testingcomment) {
        CheckinPage checkinPage = new CheckinPage(driver);
        checkinPage.clicktetsingbar();
    }

    @And("user click add new comment")
    public void userClickAddNewComment() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickcommentbar();
    }

    @And("user fill add new comment bar {string}")
    public void userFillAddNewCommentBar(String testingcomment) {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.typecommentbar(testingcomment);
    }
    @Then("user can see that comment {string} is made")
    public void userseecomment(String commenttesting) {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        Assert.assertTrue(testingBarPage.commentcheckinisDisplayed());
    }

}
