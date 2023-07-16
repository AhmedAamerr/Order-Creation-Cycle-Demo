package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class P03_AddToCart {
    public WebElement shoppingCartBadge(){
        return Hooks.driver.findElement(By.xpath("//div[@id='shopping_cart_container']//span[@class='shopping_cart_badge']"));
    }
    public WebElement shoppingCartLink(){
        return Hooks.driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
    }
    public int noOfItemsInCart(){
        return Hooks.driver.findElements(By.cssSelector(".cart_item")).size();
    }
    public void openShoppingCart(){
        shoppingCartLink().click();
    }

    public List<WebElement> addToCartBtn(){
        List <WebElement> items=Hooks.driver.findElements(By.xpath("//*[@class='inventory_item']//*[contains(text(),'Add to cart')]"));
        return items;
    }

    public void clickAddToCart(int num){
        addToCartBtn().get(num).click();
    }
    public void userAddedItemsToTheCart(int noOfItems) {
            int i =noOfItems-1;
        while (i>=0){
            clickAddToCart(i);
            i--;
        }
    }

    public void assertMinimumNoOfItemsToBeAddedToTheCart(int requestedNo){
        Assert.assertTrue(requestedNo>0,"you must added at least one item to the cart!");
    }
    public void assertMaxNoOfItemsToBeAddedToTheCart(int requestedNo){
        Assert.assertTrue(addToCartBtn().size()>=requestedNo,"the requsted items to be added greater than the available items!");
    }
    public void assertNoOfItemsAtShoppingCart(int num){
        Assert.assertTrue(shoppingCartBadge().isDisplayed());
        Assert.assertEquals(Integer.parseInt(shoppingCartBadge().getText()), num);
    }

    public void assertItemsAddedToTheCart(int num){

        Assert.assertTrue(noOfItemsInCart()==num);
    }


}
