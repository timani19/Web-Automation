package facebookhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import org.openqa.selenium.support.ui.Select;

public class SignInPage extends CommonApi {

    @FindBy(xpath = "//*[@id=\"email\"]") WebElement email;
    public WebElement getEmail() { return email; }
    @FindBy(xpath = "//*[@id=\"pass\"]") WebElement password;
    public WebElement getPassword(){ return password;}
    @FindBy(xpath = "//*[@id=\"u_0_b\"]") WebElement logInButton;
    public WebElement getLogInButton(){ return logInButton;}
    @FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a") WebElement forgotAccount;
    public WebElement getForgotAccount(){ return forgotAccount;
    }
    @FindBy(xpath = "//*[@id=\"u_0_f\"]") WebElement firstName;
    public WebElement getFirstName(){ return firstName;
    }
    @FindBy(xpath = "//*[@id=\"u_0_h\"]") WebElement lastName;
    public WebElement getLastName(){ return lastName;}
    @FindBy(xpath = "//*[@id=\"u_0_k\"]") WebElement newEmail;
    public WebElement getNewEmail(){return newEmail;}
    @FindBy(xpath = "//*[@id=\"u_0_r\"]") WebElement newPassword;
    public WebElement getNewPassword(){return newPassword;}

    @FindBy(css = "#month") WebElement birthMonth;
    public WebElement getBirthMonth(){return birthMonth;}
    @FindBy(css = "#day") WebElement birthDay;
    public WebElement getBirthDay(){return birthDay;}
    @FindBy(css = "#year") WebElement birthYear;
    public WebElement getBirthYear(){return birthYear;}
    @FindBy(xpath = "//*[@id=\"u_0_u\"]/span[1]/label") WebElement genderFemale;
    public WebElement getGenderFemale(){return genderFemale;}

    @FindBy(xpath = "//*[@id=\"u_0_u\"]/span[2]/label") WebElement genderMale;
    public WebElement getGenderMale(){return genderMale;}

    @FindBy(xpath = "//*[@id=\"u_0_y\"]") WebElement signUpButton;
    public WebElement getSignUpButton(){return signUpButton;}
    @FindBy(xpath = "//*[@id=\"identify_email\"]") WebElement findAccount;
    public WebElement getFindAccount(){return findAccount;}
    @FindBy(xpath = "//*[@id=\"u_0_2\"]") WebElement search;
    public WebElement getSearch(){return search;}


    public void birthMonthOption() throws InterruptedException {
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByVisibleText("Apr");
        Thread.sleep(2000);
    }
    public void birthDayOption() throws InterruptedException {
        Select selectDay = new Select(birthDay);
        selectDay.selectByVisibleText("26");
        Thread.sleep(2000);
    }
    public void birthYearOption() throws InterruptedException {
        Select selectYear = new Select(birthYear);
        selectYear.selectByVisibleText("1992");
        Thread.sleep(2000);
    }
    public void checkForgotAccount(){
        getForgotAccount().click();
    }
    public void checkCurrentUrl() {
        driver.get("https://www.facebook.com/");
        getCurrentPageUrl();
    }
}









