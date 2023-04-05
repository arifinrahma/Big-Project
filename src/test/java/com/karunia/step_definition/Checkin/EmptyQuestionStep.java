package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CreateQuestionPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;

public class EmptyQuestionStep {
    public AndroidDriver<AndroidElement> driver;

    public EmptyQuestionStep(){
        super();
        this.driver = Hooks.driver;
    }
    @Then("user see alert need to fill question")
    public void userSeeAlertNeedToFillQuestion() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.getalertemptyquestion();
    }
}
