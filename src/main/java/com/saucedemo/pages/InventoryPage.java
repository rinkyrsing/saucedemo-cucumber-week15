package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortNameTab;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartList;

    @CacheLookup
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;


    public void selectPriceHighToLow(){
        log.info("Click on price sort list tab, and select 'high to low' price :" + sortNameTab.getText());
       selectByVisibleTextFromDropDown(sortNameTab, "Price (high to low)");
    }

    public void ClickOnAddToCartButton(){
        log.info("Add to cart select 'cheapest and costliest product : " );
        addToCartList.get(0).click();
        addToCartList.get(addToCartList.size() -1).click();
    }

    public void addProductOnCartForCheckOut(){
        log.info("Click on add cart button :" + shoppingCart.getText());
        clickOnElement(shoppingCart);
    }

    public String getProductsText(){
        return getTextFromElement (productsText);
    }





}
