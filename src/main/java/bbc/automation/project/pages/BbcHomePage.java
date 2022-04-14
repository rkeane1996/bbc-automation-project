package bbc.automation.project.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class BbcHomePage extends BasePage {
    private By todaysDate = By.xpath("//*[@id=\"page\"]/section[2]/h2");
    private By consentPopUp = By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[2]/button[1]/p");
    private By newsTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[2]/a");
    private By sportTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[3]/a");
    private By reelTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[4]/a");
    private By workLifeTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[5]/a");
    private By travelTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[6]/a");
    private By futureTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[7]/a");
    private By cultureTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[8]/a");
    private By tvTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[9]/a");
    private By weatherTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[10]/a");
    private By soundsTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/nav[2]/ul/li[11]/a");
    private By searchTab = By.xpath("//*[@id=\"orb-header\"]/div[1]/div[4]");

    public String getDate(){
        return getElementText(todaysDate);
    }

    public void clickConsentPopUp(){
        clickElement(consentPopUp);
    }

    public void clickNewsTab(){
        clickElement(newsTab);
    }

    public void clickSearchTab(){
        clickElement(searchTab);
    }

    public String getSportsLink(){
        return getHref(this.sportTab);
    }

    public String getReelLink(){
        return getHref(this.reelTab);
    }

    public String getWorklifeLink(){
        return getHref(this.workLifeTab);
    }

    public String getTravelLink(){
        return getHref(this.travelTab);
    }

    public String getFutureLink(){
        return getHref(this.futureTab);
    }

    public String getCultureLink(){
        return getHref(this.cultureTab);
    }

    public String getTvLink(){
        return getHref(this.tvTab);
    }

    public String getWeatherLink(){
        return getHref(this.weatherTab);
    }

    public String getSoundsLink(){
        return getHref(this.soundsTab);
    }
}
