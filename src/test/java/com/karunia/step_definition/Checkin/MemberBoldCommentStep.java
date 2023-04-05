package com.karunia.step_definition.Checkin;

import com.karunia.page_object.Checkin.TestingBarPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class MemberBoldCommentStep {
    public AndroidDriver<AndroidElement> driver;

    public MemberBoldCommentStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click tell your commentbar")
    public void userClickTellYourCommentbar() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickcomment();
    }

    @And("user fill {string} bold comment")
    public void userFillBoldComment(String testing) {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.typecommentbar(testing);
    }

    @And("user click bold button")
    public void userClickBoldButton() {
        TestingBarPage testingBarPage = new TestingBarPage(driver);
        testingBarPage.clickbold();
    }

}
