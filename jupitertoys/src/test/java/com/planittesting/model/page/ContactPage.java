package com.planittesting.model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver){
        this.driver = driver;
        
    }
    public ContactPage setEmail(String email)
    {
        driver.findElement(By.name("email")).sendKeys(email);
        return this;
    }
    public String getEmailError() {
       return driver.findElement(By.id("email-err")).getText();
    }
    public ContactPage clickSubmitButton()
    {
        //driver.findElement(By.cssSelector( "btn-contact btn btn-primary" )).click();
        driver.findElement(By.className("btn-contact")).click();
        return this;
    }
    public String getForenameError() {
        return driver.findElement(By.id("forename-err")).getText();
    }
    public String getMessageErroe() {
        return driver.findElement(By.id("message-err")).getText();
    }
    
}
