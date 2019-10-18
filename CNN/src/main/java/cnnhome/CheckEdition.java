package cnnhome;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CheckEdition extends CommonApi {

    @FindBy(css = "#edition-picker-toggle-desktop")
    WebElement checkEdition;

    @FindBy(css = "edition-picker-toggle-desktop")
    WebElement uSEdition;

    @FindBy(css = "#edition-picker-toggle-desktop")
    WebElement internationalEdition;

    @FindBy(css = "#edition-picker-toggle-desktop")
    WebElement arabicEdition;

    @FindBy(css = "#edition-picker-toggle-desktop")
    WebElement espanolEdition;


    public WebElement testCheckEdition() {
        return checkEdition;
    }

    public WebElement testUsEdition() {
        return uSEdition;
    }

    public WebElement testInternationalEdition() {
        return internationalEdition;
    }

    public WebElement checkArabicEdition() {
        return arabicEdition;
    }

    public WebElement checkHispanicEdition() {
        return espanolEdition;
    }

    public boolean isCheckEditionDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return testCheckEdition().isDisplayed();
    }
    public boolean isUsEditionDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return testUsEdition().isDisplayed();
    }
    public boolean isInternationalEditionDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return testInternationalEdition().isDisplayed();
    }
    public boolean isArabicEditionDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return checkArabicEdition().isDisplayed();
    }
    public boolean isSpanishEditionDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return checkHispanicEdition().isDisplayed();
    }
}
