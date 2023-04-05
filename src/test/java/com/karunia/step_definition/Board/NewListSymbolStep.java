package com.karunia.step_definition.Board;

import com.karunia.page_object.board.BoardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;

public class NewListSymbolStep {
    public AndroidDriver<AndroidElement> driver;

    public NewListSymbolStep (){
        super();
        this.driver = Hooks.driver;
    }
    @And("user type new name board with symbol {string}")
    public void userTypeNewNameBoardWithSymbol(String ListSymbol) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.addsymbollist(ListSymbol);


    }
}
