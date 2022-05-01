package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.Pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPasswordLink();
        String actualMessage = loginPage.getForgotPasswordText();
        Assert.assertEquals(actualMessage, "Forgot Your Password?", "error");
    }
}
