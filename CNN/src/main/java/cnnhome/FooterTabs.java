package cnnhome;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FooterTabs extends CommonApi {
    @FindBy(xpath = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[8]/a") WebElement tech;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[9]/a") WebElement style;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[14]/ul/li[2]/a") WebElement longForm;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[12]/ul/li[7]/a") WebElement cnnVrr;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[6]/ul/li[2]/a") WebElement fitness;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[2]/ul/li[2]/a") WebElement americas;
    @FindBy(css = "//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[14]/ul/li[5]/a") WebElement cnnLeadership;

    public void goToTech() {}
    public void goToStyle() {}
    public void goToLongForm() {}
    public void goToCnnVr() {}
    public void  goToFitness() {}
    public void  goToAmericas() {}
    public void  goToCnnLead() {}

    public void getTermsOfsUse(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[1]/a");
    }

    public void getPrivacyPolicy(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[2]/a");
    }

    public void getAboutUs(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[5]/a");
    }

    public void goToCNNStore(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[13]/ul/li[6]/a");
    }

    public void getAccessibilityAndCc(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[3]/a");
    }

    public void getAdChoices(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[4]/a");
    }

    public void getCNNStudioTours(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[6]/a");
    }

    public void goToNewsletter(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[8]/a");
        clickOnElement("//*[@id=\"textbreakingnews\"]");
        typeOnElement("//*[@id=\"subEmail\"]", "timani@gmail.com");
    }

    public void getTranscript(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[9]/a");
    }

    public void licenseFootage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[10]/a");
    }

    public void getCNNNewSource(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[11]/a");
    }
    public void getSiteMap(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[12]/a");
    }

    public void get2019Elections() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[4]/nav/ul/li[3]/ul/li[6]/a");
        clickOnElement("//*[@id=\"mount\"]/div/main/section[2]/section/div[1]/div[2]/div[1]/div[1]/main/div/a/div");
    }
    public void testFactsSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[3]/ul/li[4]/a");
    }
    public void testParentingSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[6]/ul/li[4]/a");
    }

    public void testArchitecturePage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[9]/ul/li[4]/a");
    }
    public void testPlayPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[10]/ul/li[3]/a");
    }
}
