package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.page_object.board.CardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.awt.*;

public class CommentCardStep {
    public AndroidDriver<AndroidElement> driver;

    public CommentCardStep (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click edit card")
    public void userClickTestingCard() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clicktetsingcard();
    }

    @And("user click comment card bar")
    public void userClickCommentCardBar() {
        CardPage cardPage = new CardPage(driver);
        cardPage.addnewcommentincard();
    }

    @And("user fill the comment bar {string}")
    public void userFillTheCommentBar(String tetsing) {
        CardPage cardPage = new CardPage(driver);
        cardPage.clicktellme();
        cardPage.typecomment(tetsing);
    }


    @And("user click submit comment")
    public void userClickSubmitComment() throws InterruptedException {
        CardPage cardPage = new CardPage(driver);
        cardPage.clicksubmitcomment();
    }

    @Then("user can see a new comment in card")
    public void userCanSeeANewCommentInCard() {
        CardPage cardPage = new CardPage(driver);
        Assert.assertTrue(cardPage.CommentisDisplayed());
    }

}
