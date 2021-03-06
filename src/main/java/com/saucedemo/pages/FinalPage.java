package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import gherkin.lexer.Fi;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage extends Utility {

    private static final Logger log = LogManager.getLogger(FinalPage.class.getName());

    public FinalPage(){
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "finish")
    WebElement finishButton;



    public void clickOnFinishButton(){
        log.info("Click on continue button : " + finishButton.getText() );
        clickOnElement(finishButton);
    }



}
