$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from\r\nthe saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3914340800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login with credential username \"satandard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I filter the products by Price \u0027high to low\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "InventoryPageSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 175336200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "satandard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 64
    }
  ],
  "location": "InventoryPageSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 253706900,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 2165437300,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iFilterTheProductsByPriceHighToLow()"
});
formatter.result({
  "duration": 155064000,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 122490400,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 110724800,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 77984700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "InventoryPageSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 311402500,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 110972900,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 95824400,
  "status": "passed"
});
formatter.match({
  "location": "InventoryPageSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 61855100,
  "status": "passed"
});
formatter.after({
  "duration": 956988000,
  "status": "passed"
});
});