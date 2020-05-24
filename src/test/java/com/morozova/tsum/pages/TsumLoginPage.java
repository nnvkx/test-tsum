package com.morozova.tsum.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/login")
public class TsumLoginPage extends PageObject {
    @FindBy(css = ".login-input")
    private WebElementFacade loginInput;
    @FindBy(css = ".pwd-input")
    private WebElementFacade passwordInput;
    @FindBy(css = ".ui-button_theme_quite-black")
    private WebElementFacade applyButton;
    @FindBy(css = ".ui-button")
    private WebElementFacade enterButton;
    @FindBy(css = ".header__private > .header__link")
    private WebElementFacade enterPersonalPage;
    @FindBy(css = ".personal__nav-item:nth-child(6) > .personal__nav-link")
    private WebElementFacade logoutButton;
    @FindBy(css = ".notice > .ng-star-inserted")
    private WebElementFacade invalidPassword;
    @FindBy(css = ".last")
    private WebElementFacade switchToRegistrationButton;
    @FindBy(css = ".input-wrapper:nth-child(1) > .ui-input")
    private WebElementFacade emailRegistration;
    @FindBy(css = ".input-wrapper:nth-child(2) > .ui-input")
    private WebElementFacade pwdRegistration;
    @FindBy(css = ".notice > .ng-star-inserted")
    private WebElementFacade userAlreadyExists;

    public void enterLogin(String login) {
        loginInput.type(login);
    }
    public void enterPassword(String password) {
        passwordInput.type(password);
    }
    public void clickApplyButton() { applyButton.click(); }
    public void clickEnterButton(){
        clickOn(enterButton);
    }
    public void waitForUserEmail() { waitFor(enterPersonalPage); }
    public void enterPersonalPage() { clickOn(enterPersonalPage); }
    public void clickLogoutButton() { clickOn(logoutButton); }
    public void invalidPwdPopup(String popup) { waitForAllTextToAppear(invalidPassword.getText()); }
    public void switchToRegistrationPage() {clickOn(switchToRegistrationButton);}
    public void userAlreadyExistsPopup() { waitFor(userAlreadyExists); }
    public void enterEmailReg(String email) { emailRegistration.type(email); }
    public void enterPwdReg(String pwd) {
        pwdRegistration.type(pwd);
    }
}

