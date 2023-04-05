package com.karunia.step_definition.Chat;

import com.karunia.step_definition.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;

public class BackChatStep {
    public AndroidDriver<AndroidElement> driver;

    public BackChatStep (){
        super();
        this.driver = Hooks.driver;}
    @Then("display will not change")
    public void displayWillNotChange() {
    }
}
