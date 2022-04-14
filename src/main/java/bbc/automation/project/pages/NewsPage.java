package bbc.automation.project.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewsPage extends BasePage {

    public String getNewsUrl(){
        return getUrl();
    }

}
