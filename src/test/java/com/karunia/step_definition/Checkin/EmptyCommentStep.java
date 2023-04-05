package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.TestingBarPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EmptyCommentStep {
    public AndroidDriver<AndroidElement> driver;


    public EmptyCommentStep(){
        super();
        this.driver = Hooks.driver;
    }
    @Then("user see alert {string}")
    public void userSeeAlert(String empty) {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        String alertkomen = testingBarPage.getemptyalert();
        Assert.assertTrue(alertkomen.contains(empty));
    }
}
