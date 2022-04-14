package bbc.automation.project.actions;

import bbc.automation.project.model.Constants;
import bbc.automation.project.model.SearchResults;
import bbc.automation.project.pages.BbcHomePage;
import bbc.automation.project.pages.NewsPage;
import bbc.automation.project.pages.SearchPage;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import org.junit.Assert;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Actions {

    @Autowired
    private BbcHomePage bbcHomePage;

    @Autowired
    private NewsPage newsPage;

    @Autowired
    private SearchPage searchPage;

    @Autowired
    private Constants constants;

    @Autowired
    private SearchResults searchResults;

    public void clickConsentPopUp(){
        try{
            this.bbcHomePage.clickConsentPopUp();
        }
        catch (NoSuchElementException e){
            System.out.println("Consent Button not interactable");
        }
    }

    public void verifyDateIsCorrect(){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM");
        Assert.assertEquals(this.bbcHomePage.getDate(),formatter.format(new Date()));
    }

    public void navigateToNewsPage(){
        this.bbcHomePage.clickNewsTab();
    }

    public void navigateToSearchPage(){
        this.bbcHomePage.clickSearchTab();
    }

    public void verifyNewsUrl(){
        Assert.assertEquals(this.newsPage.getNewsUrl(), constants.BBC_NEWS_URL);
    }

    public void performSearch(String searchItem){
        this.searchPage.enterTextInSearchBar(searchItem);
        this.searchPage.clickSearchButton();
    }

    public void assertNavigationLinks(){
        Assert.assertEquals(this.bbcHomePage.getCultureLink(),constants.BBC_CULTURE_URL);
        Assert.assertEquals(this.bbcHomePage.getFutureLink(),constants.BBC_FUTURE_URL);
        Assert.assertEquals(this.bbcHomePage.getReelLink(),constants.BBC_REEL_URL);
        Assert.assertEquals(this.bbcHomePage.getSportsLink(),constants.BBC_SPORT_URL);
        Assert.assertEquals(this.bbcHomePage.getWorklifeLink(),constants.BBC_WORKLIFE_URL);
        Assert.assertEquals(this.bbcHomePage.getTravelLink(),constants.BBC_TRAVEL_URL);
        Assert.assertEquals(this.bbcHomePage.getTvLink(),constants.BBC_TV_URL);
        Assert.assertEquals(this.bbcHomePage.getWeatherLink(),constants.BBC_WEATHER_URL);
        Assert.assertEquals(this.bbcHomePage.getSoundsLink(),constants.BBC_SOUNDS_URL);
    }

    public void verifySearchResults(){
        Assert.assertEquals(this.searchPage.getTotalSearchResults(), searchResults.getTotalResults());
        Assert.assertEquals(this.searchPage.getSearchResultURL(), searchResults.getResultURL());
        Assert.assertEquals(searchResults.getFirstResultLink(),this.searchPage.getFirstSearchResults());
    }
}
