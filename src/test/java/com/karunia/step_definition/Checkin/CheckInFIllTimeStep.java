package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CreateQuestionPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckInFIllTimeStep {
    public AndroidDriver<AndroidElement> driver;

    public CheckInFIllTimeStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("click monday button")
    public void clickMondayButton() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.clickmondaybtn();
    }

    @Then("user see aler need to fill time")
    public void userSeeAlerNeedToFillTime() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.getalerttime();
    }
}
