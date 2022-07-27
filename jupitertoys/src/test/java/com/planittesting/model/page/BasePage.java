package com.planittesting.model.page;

import java.security.PublicKey;
import java.util.Currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.planittesting.model.component.LoginDialog;

import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;

public class BasePage {
    WebDriver driver;
    
        public BasePage(WebDriver driver){
            this.driver = driver;
        }

        public ContactPage clickContactMenu(){
            driver.findElement(By.cssSelector("#nav-contact a"));
            return new ContactPage(driver);
        }

        @SuppressWarnings("unchecked")
        public LoginDialog<CurrentPage> clickLoginMenu() {
            driver.findElement(By.cssSelector("#nav-login a"));
            return new LoginDialog<CurrentPage>();
            driver.findElement(By.className("popup"),(CurrentPage) this);
        }

        public String getCurrentUser(){

            return driver.findElement(By.className("user")).getText();
        }

        
    }

