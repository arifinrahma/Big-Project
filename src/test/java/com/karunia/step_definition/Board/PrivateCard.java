package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PrivateCard {
    public AndroidDriver<AndroidElement> driver;
    public PrivateCard (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user switch private card button")
    public void userSwitchPrivateCardButton() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.switchprivatecard();
    }

}
