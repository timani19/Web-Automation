package home;

import base.CommonApi;
import facebookhome.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonApi {
    HomePage homePage;

    @BeforeMethod
    public void initializeElement() {homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testScrolling() {
        homePage.scrollFacebookPage();
    }
    //@Test
    public void testScrollingLogIn(){
        homePage.fbScrollToViewCreatePage();
    }
    @Test
    public void getAboutField(){
    }
    @Test
    public void getPageCategories(){
    }
    @Test
    public void getMessengerPage(){
    }
    @Test
    public void getFundraisers(){
    }
    @Test
    public void goToCareers(){
    }
    @Test
    public void checkPrivacy(){
    }
    @Test
    public void getServices(){
    }
    @Test
    public void getTermsOfCondition(){
    }
    @Test
    public void getHelp(){
    }
    @Test
    public void getMarketplace(){
    }

}
