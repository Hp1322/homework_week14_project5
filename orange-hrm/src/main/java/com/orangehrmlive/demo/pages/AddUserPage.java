package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUsersText;

    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRollDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeNameField;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement usernameField;

    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButton;

    public String getAddUserText(){
        Reporter.log("getting addUsers Text from "+addUsersText.toString()+"<br>");
        return getTextFromElement(addUsersText);
    }

    public void selectUserRollDropDown(String rollDropDown) {
        Reporter.log("Selecting rollDropDown "+rollDropDown+" from dropdown "+userRollDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRollDropDown, rollDropDown);
    }

    public void enterEmployeeNameField(String employeeName) {
        Reporter.log("Enter employee Name "+employeeName+ " to employee Name field "+employeeNameField.toString() + "<br>");
        sendTextToElement(employeeNameField, employeeName);
    }

    public void enterUserName(String userName) {
        Reporter.log("Enter user Name "+userName+ " to user Name field "+usernameField.toString() + "<br>");
        sendTextToElement(usernameField, userName + (int) (Math.random() * 10000));
    }

    public void selectStatusDropDown(String status) {
        Reporter.log("Selecting status "+status+" from dropdown "+statusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDropDown, status);
    }

    public void enterPasswordField(String password) {
        Reporter.log("Enter password "+password+ " to password field "+passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPass(String confirmPass) {
        Reporter.log("Enter confirmPass "+confirmPass+ " to email field "+confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField, confirmPass);
    }

    public void clickOnSaveButton() {
        Reporter.log("Clicking on saveButton "+ saveButton.toString()+ "<br>");
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton() {
        Reporter.log("Clicking on cancelButton "+ cancelButton.toString()+ "<br>");
        clickOnElement(cancelButton);
    }
}
