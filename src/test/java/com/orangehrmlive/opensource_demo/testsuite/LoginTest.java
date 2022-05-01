package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.Pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("Admin123");
        loginPage.clickOnLoginButton();
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage,"Welcome","error");

    }


}
