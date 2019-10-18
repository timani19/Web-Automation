package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends CommonApi {

    public void navigateToUsSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[1]/a");
    }

    public void navigateToWorldSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[2]/a");
    }

    public void navigateToPoliticsSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[3]/a");
    }

    public void navigateToBusinessPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[4]/a");
    }

    public void navigateToOpinionPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[5]/a");
    }

    public void navigateToHealthPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[6]/a");
    }

    public void navigateToEntertainmentPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[7]/a");
    }

    public void navigateToStylePage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[8]/a");
    }

    public void navigateToTravelPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[9]/a");
    }

    public void navigateToSportsPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[10]/a");
    }

    public void navigateToVideosPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[11]/a");
    }

    public void checkTechPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[8]/a");
    }

    public void testSearchCoupons() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        typeOnElement("//*[@id=\"header-search-bar\"]", "coupons");
    }

    public void testAsiaPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[3]/a");
    }
    public void testInnovativeCitiesPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[8]/ul/li[6]/a");
    }

    public void testDigitalStudiosPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[12]/ul/li[2]/a");
    }
    public void testCNNFilmsPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[12]/ul/li[3]/a");
    }
    public void testEuropeSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[6]/a");
    }


}



