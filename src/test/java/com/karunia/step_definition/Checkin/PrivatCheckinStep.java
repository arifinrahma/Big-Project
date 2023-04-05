package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.CreateQuestionPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class PrivatCheckinStep {
    public AndroidDriver<AndroidElement> driver;


    public PrivatCheckinStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click private")
    public void userClickPrivate() {
        CreateQuestionPage createQuestionPage = new CreateQuestionPage(driver);
        createQuestionPage.switchprivate();
    }
}
