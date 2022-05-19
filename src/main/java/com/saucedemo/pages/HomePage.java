package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import gherkin.lexer.Pa;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){

        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement userPassword;

    @CacheLookup
    @FindBy(name= "login-button")
    WebElement loginButton;


    public void enterUserName(String username){
        log.info("Enter user name : " + userName.getText());
        sendTextToElement( userName, username);
    }
    public void enterUserPassword(String password){
        log.info("Enter user password : " + userPassword.toString());
        sendTextToElement(userPassword, password);

    }
    public void clickOnLoginButton(){
        log.info("Click on login button : " + loginButton.getText() );
        clickOnElement(loginButton);

    }



}
