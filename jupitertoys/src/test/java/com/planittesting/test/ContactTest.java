package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.page.HomePage;

public class ContactTest extends BaseTest{
    @Test
    public void verifyIncorrectEmailError(){
        var contactPage = new HomePage(driver)
            .clickContactMenu()
            .setEmail("not an email");
            assertEquals("Please enter a valid email", contactPage.getEmailError());
    }
    @Test
    public void verifySubmitErrors(){
        var contactPage = new HomePage(driver)
        .clickContactMenu()
        .clickSubmitButton();
        
        assertEquals("Forename is required", contactPage.getForenameError()); 
        assertEquals("Message is required", contactPage.getMessageErroe());
    }
}
