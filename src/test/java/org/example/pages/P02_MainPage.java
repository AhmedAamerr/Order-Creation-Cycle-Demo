package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P02_MainPage {
    public WebElement shoppingCartLogo(){
        return Hooks.driver.findElement(By.xpath("//div[@id='shopping_cart_container']//a[@class='shopping_cart_link']"));
    }


    public WebElement mainMenuSideBar(){
        return Hooks.driver.findElement(By.id("react-burger-menu-btn"));
    }
    public void clickMenuSideBar(){
        mainMenuSideBar().click();
    }


    public WebElement logOut(){

        return Hooks.driver.findElement(By.xpath("//nav[@class='bm-item-list']//a[contains(text(),'Logout')]"));
    }
    public void clickLogout(){
        logOut().click();
    }


    public void assertLoginSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(shoppingCartLogo().isDisplayed());
        softAssert.assertTrue(mainMenuSideBar().isDisplayed());

        softAssert.assertAll();
    }


}
