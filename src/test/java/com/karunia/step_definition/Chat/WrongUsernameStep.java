package com.karunia.step_definition.Chat;

import com.karunia.page_object.chat.PrivateChatPage;
import com.karunia.step_definition.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WrongUsernameStep {
    public AndroidDriver<AndroidElement> driver;

    public WrongUsernameStep(){

        super();
        this.driver = Hooks.driver;
    }
    @And("user type wrong member name {string} in search name bar")
    public void userTypeWrongMemberNameInSearchNameBar(String wrongname) {
        PrivateChatPage privateChatPage = new PrivateChatPage(driver);
        privateChatPage.addwrongmane(wrongname);

    }

    @Then("use see message {string}")
    public void useSeeMessage(String wrongname) {
        PrivateChatPage privateChatPage = new PrivateChatPage(driver);
        Assert.assertTrue(privateChatPage.isDisplayedname());
    }
}
