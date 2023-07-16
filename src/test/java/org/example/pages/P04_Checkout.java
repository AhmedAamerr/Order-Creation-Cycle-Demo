package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class P04_Checkout {
    public WebElement checkoutBtn(){
        return Hooks.driver.findElement(By.id("checkout"));
    }
    public void clickCheckoutBtn(){
        checkoutBtn().click();
    }
    public WebElement firstNameField(){
        return Hooks.driver.findElement(By.xpath("//*[@id='first-name']"));
    }
    public void setFirstName(String fName){
        firstNameField().sendKeys(fName);
    }
    public WebElement lastNameField(){
        return Hooks.driver.findElement(By.xpath("//*[@id='last-name']"));
    }
    public void setLastName(String lName){
        lastNameField().sendKeys(lName);
    }
    public WebElement postalCodeField(){
        return Hooks.driver.findElement(By.xpath("//*[@id='postal-code']"));
    }
    public void setPostalCode(String pCode){
        postalCodeField().sendKeys(pCode);
    }
    public WebElement continueBtn(){
        return Hooks.driver.findElement(By.xpath("//*[@data-test='continue']"));
    }
    public void clickContinueBtn(){
        continueBtn().click();
    }
    public WebElement finishBtn(){
        return Hooks.driver.findElement(By.xpath("//*[@data-test='finish']"));
    }
    public void clickFinishBtn(){
        finishBtn().click();
    }
    public WebElement orderConfirmationAlert(){
        return Hooks.driver.findElement(By.xpath("//*[contains(text(),'Thank you for your order')]"));
    }
    public void assertOrderPlacedSuccessfully(){
        Assert.assertTrue(orderConfirmationAlert().isDisplayed());
    }
}
