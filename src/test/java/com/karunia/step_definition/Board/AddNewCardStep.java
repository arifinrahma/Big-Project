package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddNewCardStep {
    public AndroidDriver<AndroidElement> driver;

    public AddNewCardStep (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click add new card")
    public void userClickAddNewCard() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.addnewcard();
    }

    @And("user fill yorcard name by {string}")
    public void userFillYorcardNameBy(String testing) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.namecard(testing);
    }

    @And("user click checklist button")
    public void userClickChecklistButton() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickcentang();
    }

    @Then("user can see that new card is made")
    public void userCanSeeThatNewCardIsMade() {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertTrue(boardPage.cardisDisplayed());

    }
}
