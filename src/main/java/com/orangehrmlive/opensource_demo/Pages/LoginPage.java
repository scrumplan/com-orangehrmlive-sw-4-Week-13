package com.orangehrmlive.opensource_demo.Pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By welcomeText = By.id("welcome");
    By forgotPasswordLink = By.linkText("Forgot your password?");
    By forgotPasswordText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }
    public String getForgotPasswordText(){
        return getTextFromElement(forgotPasswordText);

    }

   /* sendTextToElement(By.id("txtUsername"), "Admin");
    //enter password
    sendTextToElement(By.name("txtPassword"), "admin123");
    //click on login button
    clickOnElement(By.id("btnLogin"));*/

}
