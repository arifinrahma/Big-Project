package com.karunia.step_definition.Chat;

import com.karunia.page_object.board.BoardPage;
import com.karunia.page_object.board.CardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NoEditTitle {
    public AndroidDriver<AndroidElement> driver;

    public NoEditTitle (){
        super();
        this.driver = Hooks.driver;
    }
    @Then("alert will not update")
    public void alertWillNotUpdate() {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertTrue(boardPage.boardisDisplayed());
    }


    @And("user click send button")
    public void userClickSendButton() {
        CardPage cardPage = new CardPage(driver);
        cardPage.setCheklistbtn();
    }
}
