package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class InventoryPageSteps {

    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) throws InterruptedException {
        new HomePage().enterUserName("standard_user");
        new HomePage().enterUserPassword("secret_sauce");
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnLoginButton();
    }


    @And("^add product$")
    public void addProduct() {
        new InventoryPage().ClickOnAddToCartButton();
    }

    @And("^I filter the products by Price 'high to low'$")
    public void iFilterTheProductsByPriceHighToLow() {
        new InventoryPage().selectPriceHighToLow();
    }


    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().ClickOnAddToCartButton();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().addProductOnCartForCheckOut();
    }


    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String Zip)  {
        new CheckOutStepPage().enterFirstNameField("Amy");
        new CheckOutStepPage().enterLastNameField("Smith");
        new CheckOutStepPage().enterZipCode("0153");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutStepPage().clickOnContinueButton();

    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new FinalPage().clickOnFinishButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        String expectedText = "THANK YOU FOR YOUR ORDER";
        String actualText = new ThankYouPage().getThankYouText();
        Assert.assertEquals("User can not see Thank you message: " , expectedText, actualText);
    }

}
