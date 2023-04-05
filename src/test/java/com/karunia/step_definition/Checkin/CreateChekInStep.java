package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CheckinPage;
import com.karunia.page_object.Checkin.CreateQuestionPage;
import com.karunia.page_object.Checkin.TimePage;
import com.karunia.page_object.chat.TeamPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateChekInStep {
    public AndroidDriver<AndroidElement> driver;

    public CreateChekInStep (){
        super();
        this.driver = Hooks.driver;
    }

    @And("user click Checkin")
    public void userClickCheckin() {
        TeamPage teamPage = new TeamPage(driver);
        teamPage.clickcheckin();
    }

    @And("user click plus button")
    public void userClickPlusButton() {
        CheckinPage checkinPage = new CheckinPage(driver);
        checkinPage.clickaddbtn();
    }
    @And("user fill type question here bar {string}")
    public void userFillTypeQuestionHereBar(String question) throws InterruptedException {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.typequestionbar(question);
        Thread.sleep(3000);

    }
    @And("click set time")
    public void clickSetTime() {
    CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
    createQuestionPage.clicksettime();

    }

    @And("User click OK in select time")
    public void userClickOKInSelectTime() {
        TimePage timePage = new TimePage(driver);
        timePage.settime();

    }
    @And("user click start collecting answer bar")
    public void userClickStartCollectingAnswerBar() throws InterruptedException {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.clickanswer();
    }

    @Then("user see that checkin is made")
    public void userSeeThatCheckinIsMade() {
        CheckinPage checkinPage = new CheckinPage(driver);
        Assert.assertTrue(checkinPage.alertisDisplayed());
    }

}
