package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.page_object.chat.TeamPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NewListStep {
    public AndroidDriver<AndroidElement> driver;

    public NewListStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click board")
    public void userClickBoard() throws InterruptedException {
        TeamPage teamPage = new TeamPage(driver);
        teamPage.clickboard();
        Thread.sleep(6000);
    }

    @And("user click add new board button")
    public void userClickAddNewBoardButton() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickaddboard();
    }

    @And("user type new name board")
    public void userTypeNewNameBoard() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.addlistboard();
    }

    @And("user click submit")
    public void userClickSubmit() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.submitboard();
    }

    @Then("user can see new boar is made")
    public void userCanSeeNewBoarIsMade() {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertTrue(boardPage.boardisDisplayed());
    }
}
