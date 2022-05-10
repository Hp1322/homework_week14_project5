package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        softAssert.assertEquals(homePage.getWelcomeText().substring(0, 7), "Welcome", "Not navigate to welcome page");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //   softAssert.assertEquals();
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnProfileLogo();
        homePage.mouseHoverOnLogout();
        homePage.clickOnLogout();
        softAssert.assertEquals(loginPage.getLoginPanelText(), "LOGIN Panel", "Not navigate to login page");
        softAssert.assertAll();
    }

}
