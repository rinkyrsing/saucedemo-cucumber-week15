package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends Utility {

    private static final Logger log = LogManager.getLogger(ThankYouPage.class.getName());

    public ThankYouPage(){

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement verifyThankYou;


    public String getThankYouText(){
  log.info("Verify 'Thank you text is displayed :" + verifyThankYou.getText());
        return getTextFromElement(verifyThankYou);
    }
}
