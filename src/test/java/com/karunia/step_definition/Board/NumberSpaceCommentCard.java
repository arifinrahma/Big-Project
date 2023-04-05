package com.karunia.step_definition.Board;

import com.karunia.page_object.board.CardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class NumberSpaceCommentCard {
    public AndroidDriver<AndroidElement> driver;

    public NumberSpaceCommentCard(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user fill click page number")
    public void userFillClickPageNumber() {
        CardPage cardPage = new CardPage(driver);
        cardPage.clicklistnumber();
    }

}
