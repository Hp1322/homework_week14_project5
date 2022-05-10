package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orangeHRMLogo;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement admin;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pim;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leave;

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboard;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;


    public void clickOnProfileLogo(){
        Reporter.log("Clicking on welcomeText "+ welcomeText.toString()+ "<br>");
        clickOnElement(welcomeText);
    }

    public void mouseHoverOnLogout(){
        Reporter.log("MouseHover on logout "+ logout.toString()+ "<br>");
        mouseHoverToElement(logout);
    }
    public void clickOnLogout(){
        Reporter.log("Clicking on logout "+ logout.toString()+ "<br>");
        clickOnElement(logout);
    }


    public void clickOnAdmin(){
        Reporter.log("Clicking on admin "+ admin.toString()+ "<br>");
        clickOnElement(admin);
    }
    public void clickOnPIM(){
        Reporter.log("Clicking on pim "+ pim.toString()+ "<br>");
        clickOnElement(pim);
    }
    public void clickOnLeave(){
        Reporter.log("Clicking on leave "+ leave.toString()+ "<br>");
        clickOnElement(leave);
    }
    public void clickOnDashboard(){
        Reporter.log("Clicking on dashboard "+ dashboard.toString()+ "<br>");
        clickOnElement(dashboard);
    }

    public String getWelcomeText(){
        Reporter.log("getting welcome Text from "+welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }
}
