package bbc.automation.project.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class SearchResults {

    private int totalResults = 10;
    private String resultURL = "https://www.bbc.co.uk/search?q=Houghton+Mifflin+Harcourt&page=1";
    private String firstResultLink = "http://news.bbc.co.uk/hi/english/business/newsid_1366000/1366206.stm";
}
