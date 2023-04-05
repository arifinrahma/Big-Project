package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.TestingBarPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class AllMemberCommentStep {
    public AndroidDriver<AndroidElement> driver;
    public AllMemberCommentStep (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click mention all button")
    public void userClickMentionAllButton() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickallmember();
    }

    @And("user click OK in alert")
    public void userClickOKInAlert() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickOK();
    }

//    @Then("user can see that comment is made with all member tag")
//    public void userCanSeeThatCommentIsMadeWithAllMemberTag() {
//    }
}
