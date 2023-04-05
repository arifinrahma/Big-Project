package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CreateQuestionPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckInFIllQUestion {
    public AndroidDriver<AndroidElement> driver;

    public CheckInFIllQUestion(){
        super();
        this.driver = Hooks.driver;
    }
    @Then("user see alert need to fill")
    public void userSeeAlertNeedToFill() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        Assert.assertTrue(createQuestionPage.alertisDisplayed());
    }

    @And("user click screen")
    public void userClickScreen() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.clickscreen();
    }
}
