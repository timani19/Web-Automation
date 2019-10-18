package keywordriven;

import base.CommonApi;
import cnnhome.SearchText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import cnnhome.SearchText;

public class Steps extends CommonApi {
    public enum Features{
        searchText,
        getText,
        searchPage,
        sendKeys,
        click,
        isDisplayed,
    }

    public void selectFeatures(Features feature, WebElement element, String value){
        switch(feature){
            case searchText:
                element.sendKeys(value);
                break;
            case getText:
                element.sendKeys(value);
            case searchPage:
                element.click();
            case sendKeys:
                element.sendKeys(value);
            case click:
                element.click();
            case isDisplayed:
                element.isDisplayed();
        }
    }
    public void getFeatures(WebDriver driver1)throws IOException, InterruptedException {
        SearchItemsLists items = new SearchItemsLists();
        String[] testSteps = items.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            //selectFeatures(testSteps[i], driver1);
        }
    }
}

