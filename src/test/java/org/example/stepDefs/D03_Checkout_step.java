package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P02_MainPage;
import org.example.pages.P03_AddToCart;
import org.example.pages.P04_Checkout;

public class D03_Checkout_step {
    P04_Checkout checkout=new P04_Checkout();
    P02_MainPage mainPage=new P02_MainPage();
    @And("user proceed to the checkout page")
    public void userProceedToTheCheckoutPage() {
        checkout.clickCheckoutBtn();
    }

    @And("user enter his {string}, {string}, and {string}")
    public void userEnterHisFirstNameLastNameAndZipPostalCode(String fName, String lName, String pCode) {
        checkout.setFirstName(fName);
        checkout.setLastName(lName);
        checkout.setPostalCode(pCode);

    }

    @And("user proceeds to the checkout overview and finishes the order")
    public void userProceedsToTheCheckoutOverviewAndFinishesTheOrder() {
        checkout.clickContinueBtn();
        checkout.clickFinishBtn();
    }

    @Then("user logout from the website")
    public void Logout() {

        mainPage.clickMenuSideBar();
        mainPage.clickLogout();
    }
}
