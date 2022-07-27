package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.page.HomePage;

public class LoginTest extends BaseTest {
  

    @Test
    public void verifyUserLogin(){
        var homepage = new HomePage(driver)
        .clickLoginMenu()
        .setUsername(username: "someone")
        .setPassword(password: "letmein")
        .clickLoginButton();
        assertEquals("someone",homepage.getCurrentUser());;
    }   
}
