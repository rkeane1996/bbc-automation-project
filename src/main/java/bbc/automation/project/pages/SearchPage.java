package bbc.automation.project.pages;


import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class SearchPage extends BasePage{

    private By searchTextBox = By.id("search-input");
    private By searchButton = By.xpath("//*[@id=\"main-content\"]/div[1]/form/div/div/div/button");
    private By searchResults = By.xpath("//*[@id=\"main-content\"]/div[1]/div[3]/div/div/ul/li");
    private By firstSearchResultLink = By.xpath("//*[@id=\"main-content\"]/div[1]/div[3]/div/div/ul/li[1]/div/div/div/div[1]/a");

    public void enterTextInSearchBar(String searchItem){
        enterText(searchTextBox, searchItem);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }

    public int getTotalSearchResults(){
        return getListOfWebElements(this.searchResults).size();
    }

    public String getSearchResultURL(){
        return getUrl();
    }

    public String getFirstSearchResults(){
        return getHref(this.firstSearchResultLink);
    }
}
