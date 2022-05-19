package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutStepPage.class.getName());

    public CheckOutStepPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "first-name")
    WebElement userFirstName;

    @CacheLookup
    @FindBy(id = "last-name")
    WebElement userLastName;

    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement userZipCode;

    @CacheLookup
    @FindBy(id = "continue")
    WebElement continueButtom;

    public void enterFirstNameField(String firstName){
        log.info("Enter user first name : " + userFirstName.toString());
        sendTextToElement(userFirstName, firstName);
    }
    public void enterLastNameField(String lastName){
        log.info("Enter user last name : " + userLastName.toString());
        sendTextToElement(userLastName, lastName);
    }
    public void  enterZipCode(String Zip){
        log.info("Enter user first name : " + userZipCode.toString());
        sendTextToElement(userZipCode, Zip);
    }
    public void clickOnContinueButton(){
        log.info("Click on continue button : " + continueButtom.getText() );
        clickOnElement(continueButtom);
    }



}
