package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ArchiveListStep {
    public AndroidDriver<AndroidElement> driver;

    public ArchiveListStep (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click right button in list")
    public void userClickRightButtonInList() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickbuttonlist();
    }

    @And("user click archive list")
    public void userClickArchiveList() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickarchivelist();
    }

    @Then("shown list been moved to archive list")
    public void shownListBeenMovedToArchiveList() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.getAttributelist();
    }
}
