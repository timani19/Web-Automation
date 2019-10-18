package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;

public class GoLive extends CommonApi {
    public void testLive() {
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > a > span");
    }

    public void viewChannels() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[1]"));
    }

    public void viewShows() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[2]"));
    }

    public void viewSettings() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[3]"));
    }

    public void checkLiveUpdates() {
        clickOnElement("//*[@id=\"homepage-injection-zone-1\"]/div[2]/div/div[2]/div/ul/li[1]/article/div/div/h3/a/span[1]");
    }
}
