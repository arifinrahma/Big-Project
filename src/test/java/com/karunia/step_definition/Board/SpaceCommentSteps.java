package com.karunia.step_definition.Board;

import com.karunia.page_object.board.CardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SpaceCommentSteps {
    public AndroidDriver<AndroidElement> driver;

    public SpaceCommentSteps(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user fill card comment with {string}")
    public void userFillCardCommentWith(String space) {
    }

    @Then("user can see alert message {string}")
    public void userCanSeeAlertMessage(String alert) {
        CardPage cardPage = new CardPage(driver);
        String spacealert = cardPage.getspacealert();
        Assert.assertTrue(spacealert.contains(alert));
    }
}
