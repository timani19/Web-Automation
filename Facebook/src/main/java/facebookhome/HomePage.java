package facebookhome;

import base.CommonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonApi {
    public void scrollFacebookPage(){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(4);
    }

    public void fbScrollToViewCreatePage(){
        WebElement element=getElementByXPath("//*[@id=\"js_1\"]/ul/li[19]/a");
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        clickOnElement("//*[@id=\"js_1\"]/ul/li[19]/a");
    }

    public void getAboutField(){
        scrollFacebookPage();
        clickOnElement("About");
    }

    public void getPageCategories(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[7]/a");
    }
    public void getMessengerPage(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[3]/a");
    }

    public void getFundraisers(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[15]/a");
    }
    public void goToCareers(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[21]/a");
    }
    public void checkPrivacy(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[22]/a");
    }
    public void getServices(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[16]/a");
    }
    public void getTermsOfCondition(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[25]/a");
    }

    public void getHelp(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[26]/a");
    }
    public void getMarketplace(){
        scrollFacebookPage();
        clickOnElement("//*[@id=\"js_1\"]/ul/li[11]/a");
    }

}
