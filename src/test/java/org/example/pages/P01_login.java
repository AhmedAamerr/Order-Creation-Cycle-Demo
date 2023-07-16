package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class P01_login {


    public WebElement userName() {
        return Hooks.driver.findElement(By.xpath("//*[@id='user-name']"));
    }
    public WebElement password() {
        return Hooks.driver.findElement(By.cssSelector("#password")) ;
    }
    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.id("login-button"));
    }

    public void enterUserName(String userN){
        userName().sendKeys(userN);
    }
    public void enterPassword(String pa){
        password().sendKeys(pa);
    }

    public void clickLogBtn(){
        loginBtn().click();
    }


    public WebElement errorMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']"));
    }

    public void assertFailedLogin(){
        Assert.assertTrue(errorMsg().getText().contains("Username and password do not match any user in this service"));
    }

}
