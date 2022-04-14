package bbc.automation.project.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.concurrent.TimeUnit;

@Configuration
@PropertySource("classpath:/bbc-automation-project.properties")
@ComponentScan("bbc.automation.project")
public class TestConfig {

    @Value("${browser.name}")
    private String browserName;

    @Value("${local.chrome.driver}")
    private String localChrome;

    @Value("${local.gecko.driver}")
    private String localFirefox;

    @Bean
    public WebDriver webDriver(){
        WebDriver driver = null;
        switch (browserName) {
            case "FireFox":
                System.setProperty("webdriver.gecko.driver", localFirefox);
                driver = new FirefoxDriver();
                break;
            case "Chrome":
            default:
                System.setProperty("webdriver.chrome.driver", localChrome);
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return driver;
    }
}
