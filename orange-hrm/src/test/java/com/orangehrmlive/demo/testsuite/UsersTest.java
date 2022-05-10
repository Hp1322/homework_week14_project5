package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsersTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    AdminPage adminPage;
    AddUserPage addUserPage;
    DashboardPage dashboardPage;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        dashboardPage = new DashboardPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }

    @Test(priority = 0,groups = {"sanity","smoke","regression"})
    public void adminShouldAddUserSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        softAssert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "not navigate to system user page");
        viewSystemUsersPage.clickOnAddButton();
        softAssert.assertEquals(addUserPage.getAddUserText(), "Add User", "not navigate to add user page");
        addUserPage.selectUserRollDropDown("Admin");
        addUserPage.enterEmployeeNameField("Ananya Dash");
        addUserPage.enterUserName("Pandey");
        addUserPage.selectStatusDropDown("Disabled");
        addUserPage.enterPasswordField("Pandey@0789");
        addUserPage.enterConfirmPass("Pandey@0789");
        addUserPage.clickOnSaveButton();

        softAssert.assertAll();
    }

    @Test(priority = 1,groups = {"smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        softAssert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "not navigate to system user page");
        viewSystemUsersPage.enterUserName("dilshad");
        viewSystemUsersPage.selectUserRollDropDown("ESS");
        viewSystemUsersPage.selectStatusDropDown("Enabled");
        viewSystemUsersPage.clickOnSearchButton();
        //  softAssert.assertEquals(viewSystemUsersPage.getUserInListText(), "", "User name is not verified");
        softAssert.assertAll();
    }

    @Test(priority = 2,groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        softAssert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "not navigate to system user page");
        viewSystemUsersPage.enterUserName("adash");
        viewSystemUsersPage.selectUserRollDropDown("ESS");
        viewSystemUsersPage.selectStatusDropDown("Enabled");
        viewSystemUsersPage.clickOnSearchButton();
        //  softAssert.assertEquals(viewSystemUsersPage.getUserInListText(), "", "User name is not verified");
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDeleteButton();
        viewSystemUsersPage.clickOnOkButtonPopUp();
       // softAssert.assertEquals(,"","");

    }
    @Test(priority = 3,groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.enterUseName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        softAssert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "not navigate to system user page");
        viewSystemUsersPage.enterUserName("adash");
        viewSystemUsersPage.selectUserRollDropDown("ESS");
        viewSystemUsersPage.selectStatusDropDown("Enabled");
        viewSystemUsersPage.clickOnSearchButton();
        softAssert.assertEquals(viewSystemUsersPage.getNoRecordsFoundText(), "No Records Found", "not navigate to system user page");
        softAssert.assertAll();
    }

}
