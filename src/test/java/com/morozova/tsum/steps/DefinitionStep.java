package com.morozova.tsum.steps;

import com.morozova.tsum.pages.TsumLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionStep {
    TsumLoginPage tsumLoginPage;

    @Given("^User go to Tsum login page$")
    public void userGoToGoogleHomePage() {
        tsumLoginPage.open();
    }

    @When("^User enter \"([^\"]*)\" login$")
    public void userEnterLogin(String keyword) {
        tsumLoginPage.enterLogin(keyword);
    }

    @And("^User enter \"([^\"]*)\" password$")
    public void userEnterPassword(String keyword) {
        tsumLoginPage.enterPassword(keyword);
    }

    @And("Click submit town")
    public void clickSubmitTown() {
        tsumLoginPage.clickApplyButton();
    }

    @And("^User click enter button$")
    public void userClickEnterButton() {
        tsumLoginPage.clickEnterButton();
    }

    @And("Popup shows")
    public void invalidLoginOrPwd() {
        tsumLoginPage.invalidPwdPopup("Неверный логин или пароль");
    }

    @And("User go to personal page")
    public void enterPersonalPage() {
        tsumLoginPage.waitForUserEmail();
        tsumLoginPage.enterPersonalPage();
    }

    @And("User click logout")
    public void doLogout() {
        tsumLoginPage.clickLogoutButton();
    }

    @And("Switch to registration form")
    public void switchToRegistrationForm() {
        tsumLoginPage.switchToRegistrationPage();
    }

    @And("^Enter existing \"([^\"]*)\" user email$")
    public void enterEmailReg(String keyword) {
        tsumLoginPage.enterEmailReg(keyword);
    }

    @And("^Enter password \"([^\"]*)\" for existing user email$")
    public void enterPwdReg(String keyword) {
        tsumLoginPage.enterPwdReg(keyword);
    }

    @And("User already exists popup")
    public void userAlreadyExistspopup() {
        tsumLoginPage.userAlreadyExistsPopup();
    }
}
