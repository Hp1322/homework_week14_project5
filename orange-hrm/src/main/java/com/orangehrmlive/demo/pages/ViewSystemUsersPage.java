package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement systemUsersText;

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement usernameField;

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRollDropDown;

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeNameField;

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;

    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;

    @FindBy(xpath = "//td[@class='left'][1]")
    WebElement userInList;

    @FindBy(xpath = "//input[@name='chkSelectRow[]']")
    WebElement checkBox;

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement okButtonPopup;

    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordsFound;

    @FindBy(xpath = "//a[text()='pandey121']")
    WebElement userText;

    public String getUserTextMessage() {
        Reporter.log("getting Success Message Text from " + userText.toString() + "<br>");
        mouseHoverToElement(userText);
        return getTextFromElement(userText);

    }

    public void clickOnCheckBox(){
        Reporter.log("Clicking on checkBox "+ checkBox.toString()+ "<br>");
        clickOnElement(checkBox);
    }
    public void clickOnOkButtonPopUp(){
        Reporter.log("Clicking on okButtonPopup "+ okButtonPopup.toString()+ "<br>");
        clickOnElement(okButtonPopup);
    }
    public String getNoRecordsFoundText(){
        Reporter.log("getting noRecordsFound text from "+noRecordsFound.toString()+"<br>");
        return getTextFromElement(noRecordsFound);
    }

    public String getSystemUsersText(){
        Reporter.log("getting systemUsers Text from "+systemUsersText.toString()+"<br>");
        return getTextFromElement(systemUsersText);
    }
    public void enterUserName(String userName){
        Reporter.log("Enter user Name "+userName+ " to user Name field "+usernameField.toString() + "<br>");
        sendTextToElement(usernameField,userName);
    }
    public void selectUserRollDropDown(String rollDropDown){
        Reporter.log("Selecting roll DropDown "+rollDropDown+" from dropdown "+userRollDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRollDropDown,rollDropDown);
    }
    public void enterEmployeeNameField(String employeeName){
        Reporter.log("Enter employee Name "+employeeName+ " to employeeName field "+employeeNameField.toString() + "<br>");
        sendTextToElement(employeeNameField,employeeName);
    }
    public void selectStatusDropDown(String status){
        Reporter.log("Selecting status "+status+" from dropdown "+statusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }
    public void clickOnSearchButton(){
        Reporter.log("Clicking on searchButton "+ searchButton.toString()+ "<br>");
        clickOnElement(searchButton);
    }
    public void clickOnResetButton(){
        Reporter.log("Clicking on resetButton "+ resetButton.toString()+ "<br>");
        clickOnElement(resetButton);
    }
    public void clickOnAddButton(){
        Reporter.log("Clicking on addButton "+ addButton.toString()+ "<br>");
        clickOnElement(addButton);
    }
    public void clickOnDeleteButton(){
        Reporter.log("Clicking on deleteButton "+ deleteButton.toString()+ "<br>");
        clickOnElement(deleteButton);
    }
    public String getUserInListText(){
        Reporter.log("getting userInList text from "+userInList.toString()+"<br>");
        return getTextFromElement(userInList);
    }





}
