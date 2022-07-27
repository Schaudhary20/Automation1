package com.planittesting.model.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginDialog<CurrentPage> {
    CurrentPage page;
    WebElement rootElement;

    public LoginDialog(WebElement rootElement ,CurrentPage page){
        this.rootElement = rootElement;
        this.page = page;
    }

    public LoginDialog<CurrentPage> setUsername(String username) {
        rootElement.findElement(By.id("loginUserName")).sendKeys(username);
        return this;
    }

    public LoginDialog<CurrentPage> setPassword(String Password) {
        rootElement.findElement(By.id("loginPassword")).sendKeys(Password);
        return this;
    }
    
    public CurrentPage clickLoginButton() {
        rootElement.findElement(By.className("btn-primary")).sendKeys();
        return this.page;
    }



}
