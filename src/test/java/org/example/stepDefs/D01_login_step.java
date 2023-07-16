package org.example.stepDefs;

import io.cucumber.java.en.*;
import org.example.pages.P01_login;
import org.example.pages.P02_MainPage;


public class D01_login_step {
    P01_login login = new P01_login();
    P02_MainPage mainPage= new P02_MainPage();

    @Given("user go to website and entering the login page")
    public void goLoginPage() {
    }

    @When("user login with userName {string} and password {string}")
    public void enterUserNameAndPassword(String userName, String pass) {
        login.enterUserName(userName);
        login.enterPassword(pass);
        login.clickLogBtn();
    }


    @Then("user login to the system successfully")
    public void loginSuccessfully() throws InterruptedException {
        mainPage.assertLoginSuccessfully();
    }


    @But("user can't login to the system successfully")
    public void loginFailed() {
        login.assertFailedLogin();
    }



}

