package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passWord;

    @FindBy(xpath = "//input[@name='Submit']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanelText;



    public void enterUseName(String nam){
        Reporter.log("Enter user Name "+nam+ " to user Name field "+userName.toString() + "<br>");
        sendTextToElement(userName, nam);
    }
    public void enterPassword(String pass){
        Reporter.log("Enter passWord "+pass+ " to passWord field "+passWord.toString() + "<br>");
        sendTextToElement(passWord, pass);
    }
    public void clickOnLoginButton(){
        Reporter.log("Clicking on loginButton "+ loginButton.toString()+ "<br>");
        clickOnElement(loginButton);
    }
    public String getLoginPanelText(){
        Reporter.log("getting loginPanel Text from "+loginPanelText.toString()+"<br>");
        return getTextFromElement(loginPanelText);
    }
}
