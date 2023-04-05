package com.karunia.step_definition.Board;

import com.karunia.page_object.board.CardPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EditTitleStep {
    public AndroidDriver<AndroidElement> driver;

    public EditTitleStep(){
        super();
        this.driver = Hooks.driver;
    }
    @And("user click edit name card by adding {string}")
    public void userClickEditNameCardByAdding(String last) throws InterruptedException {
        CardPage cardPage = new CardPage(driver);
        cardPage.edittitle();
        Thread.sleep(3000);
        cardPage.setFilledit(last);
        cardPage.setCheklistbtn();

    }

    @Then("user see alert update {string}")
    public void userSeeAlertUpdate(String tambahan) {
        CardPage cardPage = new CardPage(driver);
        String update = cardPage.getupdatealert();
        Assert.assertTrue(update.contains(tambahan));
    }
}
