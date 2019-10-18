package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CnnCareers extends CommonApi {
    public void scrollToViewCnnCareers() throws InterruptedException {
        WebElement element = getElementByXPath("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[7]/a");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        clickOnElementByLinkText("Work for CNN");
        sleepFor(5);
    }

    public void checkCareersUrl() {
        driver.get("https://www.turnerjobs.com/search-jobs?orgIds=1174&ac=19299");
        getCurrentPageUrl();
    }

    public void getNews() {
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[7]/a");
        mouseHoverByXPath("//*[@id=\"custom_fieldscustomfacetcategory-toggle\"]");
    }

    public void getSports() {
        WebElement element = getElementByLinkedText("Sports");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("Sports");
    }

    public void signUpForNewsLetter() {
        clickOnElement("//*[@id=\"main-content-wrapper\"]/section[4]/div[2]/p/a");
        typeOnElement("//*[@id=\"form-field-6b79f18564\"]", "Tashfia");
        typeOnElement("//*[@id=\"form-field-761e858748\"]", "Imani");
        typeOnElement("//*[@id=\"form-field-5e8ea65a33\"]", "imani@gmail.com");
        clickOnElement("//*[@id=\"form-bc964d87b2\"]/div[3]/p[6]/input");
    }

    public void findInnovativeCities(){
        waitUntilClickAble(By.xpath("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[8]/ul/li[6]/a"));
        WebElement element = getElementByXPath("//*[@id=\\\"footer-wrap\\\"]/footer/div[2]/div/div/nav/ul/li[8]/ul/li[6]/a\"");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", element);
        Assert.assertTrue(element.getText().equals( "Innovative Cities"));
    }

    public void findCnnLeadership(){
        waitUntilClickAble(By.xpath("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[5]/a"));
        WebElement element = getElementByXPath("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[5]/a");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", element);
        Assert.assertTrue(element.getText().equals( "Cnn Leadership"));
    }

    public void searchTechJobs() {
        typeOnElement("//*[@id=\"advanced-search-keyword-ba215af2ad\"]", "tech jobs");
        clickOnElement("//*[@id=\"advanced-search-submit-ba215af2ad\"]");
    }

    public void searchAdminJobs() {
        typeOnElement("//*[@id=\"advanced-search-keyword-ba215af2ad\"]", "admin");
        clickOnElement("//*[@id=\"advanced-search-submit-ba215af2ad\"]");
    }

    public void searchFinanceJobs() {
        typeOnElement("//*[@id=\"advanced-search-keyword-ba215af2ad\"]", "finance jobs");
        clickOnElement("//*[@id=\"advanced-search-submit-ba215af2ad\"]");
    }

    public void getITJobs() {
        scrollIntoView("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[7]/a");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[14]/ul/li[7]/a");
        mouseHoverByXPath("//*[@id=\"search-filters\"]/div/section[1]/ul/li[4]/label/b[1]");
    }

    public void filterByCategory() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[2]/ul/li[1]/label/b[1]");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[2]/ul/li[1]/label/b[1]");
    }

    public void filterByAdminJobs() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[2]/ul/li[2]/label/b[1]");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[2]/ul/li[2]/label/b[1]");
    }

    public void filterByAnalyticsJobs() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[2]/ul/li[3]/label/b[1]");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[2]/ul/li[3]/label/b[1]");
    }

    public void filterByBusinessDevJobs() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[2]/ul/li[5]/label/b[1]");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[2]/ul/li[5]/label/b[1]");
    }

    public void filterByCountry() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[3]/ul");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[3]/ul");
    }

    public void filterByCountryUsa() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        WebElement element = getElementByXPath("//*[@id=\"search-filters\"]/div/section[3]/ul/li[3]/label/b[1]");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElement("//*[@id=\"search-filters\"]/div/section[3]/ul/li[3]/label/b[1]");
    }

    public void filterByUK() {
        clickOnElement("//*[@id=\"category-toggle\"]");
        mouseHoverByXPath("//*[@id=\"search-filters\"]/div/section[3]/ul/li[2]/label/b[1]");
    }

    public void searchByLocation() {
        clickOnElement("//*[@id=\"corporate-nav-links\"]/ul/li[1]/a");
    }
}