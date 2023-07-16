package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_MainPage;
import org.example.pages.P03_AddToCart;

public class D02_AddToCart_step {
    P02_MainPage mainPage=new P02_MainPage();
    P03_AddToCart addToCart=new P03_AddToCart();

    @Given("User is on the home page")
    public void userIsOnTheHomePageAndTheCartIsEmpty() {
        //mainPage.shoppingCartIsEmpty();
    }

    @And("user added {int} of items to the cart")
    public void userAddedItemsToTheCart(int noOfItems) {
        addToCart.assertMinimumNoOfItemsToBeAddedToTheCart(noOfItems);
        addToCart.assertMaxNoOfItemsToBeAddedToTheCart(noOfItems);
        addToCart.userAddedItemsToTheCart(noOfItems);
        addToCart.assertNoOfItemsAtShoppingCart(noOfItems);
    }
    @And("user opens the shopping cart")
    public void userOpensTheShoppingCart() {
        addToCart.openShoppingCart();

    }

    @Then("the {int} of items was added successfully to the cart")
    public void theItemsAddedSuccessfullyToTheCart(int num) {
        addToCart.assertItemsAddedToTheCart(num);
    }


}
