package cnnhome;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchText extends CommonApi {

    public void searchUS() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button");
        typeOnElement("#header-search-bar", "us");
    }

    public void searchUSCrime() throws InterruptedException {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "us crime");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[1]/div/form/button");
    }

    public void searchEnergy() {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "energy");
        clickOnElement("\"//*[@id=\\\"footer-wrap\\\"]/footer/div[1]/div/form/button");
    }

    public void searchWeather() {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "weather");
        clickOnElement("\"//*[@id=\\\"footer-wrap\\\"]/footer/div[1]/div/form/button");
    }

    public void searchPhotos() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[1]/a");
    }

    public void searchBangladesh() {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "Bangladesh");
        clickOnElement("\"//*[@id=\\\"footer-wrap\\\"]/footer/div[1]/div/form/button");
    }

    public void searchMedia() {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "media");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[1]/div/form/button/div[1]");
    }

    public void searchOpinion() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[5]/a");
    }

    public void searchLifestyle() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[13]/ul/li[5]/a");
    }

    public void searchCNNProfile() {
        clickOnElement("#footer-wrap > footer > div:nth-child(2) > div > div > nav > ul > li:nth-child(14) > ul > li:nth-child(4) > a");
    }

    public void searchGadgets() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[13]/ul/li[4]/a");
    }

    public void cnnCareers() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[7]/a");
    }

    public void followOnFacebook() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[4]/div/div/div[2]/div/ul/li[1]/a");
    }

    public void followOnTwitter() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[4]/div/div/div[2]/div/ul/li[2]/a");
    }

    public void followOnInstagram() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[4]/div/div/div[2]/div/ul/li[3]/a");
    }

    public void searchSocial() {
        typeOnElement("//*[@id=\"footer-search-bar\"]", "social");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[1]/div/form/button/div[1]");
    }

    public void testSearchFood() {
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.gWkClp > button > svg");
        typeOnElement("#header-search-bar", "food");
    }

    public void searchNews() {
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.gWkClp > button > svg");
        typeOnElement("#header-search-bar", "news");
    }
    public void getCongress(){
        clickOnElement("//*[@id=\"mount\"]/div/div[1]/header/div/nav/div/div[2]/div/div[2]/a[2]");
    }

    public void getChina(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[2]/ul/li[5]/a");
    }
    public void searchBasketball(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[11]/ul/li[4]/a");
    }
    public void searchOlympics(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[11]/ul/li[6]/a");
    }
    public void searchTvSchedule(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[12]/ul/li[5]/a");
    }
    public void searchFashion(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[9]/ul/li[3]/a");
    }
    public void searchCollegeFootball(){
        clickOnElement("//*[@id=\"header-search-bar\"]");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[11]/ul/li[2]/a");
    }
}
