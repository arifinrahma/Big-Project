package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class CardSymbolStep {
    public AndroidDriver<AndroidElement> driver;

    public CardSymbolStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user fill your card name by symbol {string}")
    public void userFillYourCardNameBySymbol(String CardSymbol) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.addsymbolcard(CardSymbol);
    }
}
