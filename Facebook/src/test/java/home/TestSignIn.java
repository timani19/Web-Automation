package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import facebookhome.SignInPage;
import org.openqa.selenium.support.ui.Select;

public class TestSignIn extends CommonApi {
    SignInPage signInPage;

    @BeforeMethod
    public void initializeElement() {
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void signInWithValidCredentials() {
        signInPage.getEmail().sendKeys("megmar09@yahoo.com");
        signInPage.getPassword().sendKeys("tmim27@@");
        signInPage.getLogInButton().click();
    }
    @Test
    public void signInWithInvalidCredentials() throws InterruptedException {
        signInPage.getEmail().sendKeys("@");
        signInPage.getPassword().sendKeys("@@");
        signInPage.getLogInButton().click();
        boolean isErrorDisplayed = driver.findElement
                (By.xpath("//div[text()='The email or phone number you’ve " +
                        "entered doesn’t match any account. ']")).isDisplayed();
        Assert.assertEquals(isErrorDisplayed, true);
        sleepFor(5);
    }
    @Test
    public void createANewAccount() throws InterruptedException {
        signInPage.getFirstName().sendKeys("Megan");
        signInPage.getLastName().sendKeys("Marry");
        signInPage.getNewEmail().sendKeys("megmar09@yahoo.com");
        signInPage.getNewPassword().sendKeys("rmfm22@@");
        signInPage.getBirthMonth().click();
        signInPage.birthMonthOption();
        signInPage.birthDayOption();
        signInPage.birthYearOption();
        signInPage.getGenderFemale().click();
        signInPage.getSignUpButton().click();
    }

    @Test
    public void testForgotAccount(){
        signInPage.checkForgotAccount();
        signInPage.getFindAccount().sendKeys("imanitashfia@yahoo.com");
        signInPage.getSearch().click();
    }
    @Test
    public void testUrl(){
        signInPage.checkCurrentUrl();
        System.out.println(getCurrentPageUrl());
    }

}