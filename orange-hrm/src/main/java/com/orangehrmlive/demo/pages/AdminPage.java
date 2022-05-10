package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagementTab;

    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobTab;

    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organizationTab;

    public void clickOnUserManagement(){
        Reporter.log("Clicking on userManagementTab "+ userManagementTab.toString()+ "<br>");
        clickOnElement(userManagementTab);
    }
    public void clickOnJob(){
        Reporter.log("Clicking on jobTab "+ jobTab.toString()+ "<br>");
        clickOnElement(jobTab);
    }
    public void clickOnOrganization(){
        Reporter.log("Clicking on organizationTab "+ organizationTab.toString()+ "<br>");
        clickOnElement(organizationTab);
    }


}
