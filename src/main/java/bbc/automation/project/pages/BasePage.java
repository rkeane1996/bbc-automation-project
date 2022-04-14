package bbc.automation.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasePage {

    @Autowired
    protected WebDriver driver;

    protected void clickElement(By element){
        driver.findElement(element).click();
    }

    protected String getElementText(By element){
        return driver.findElement(element).getText().split(".com")[2].trim();
    }

    protected void enterText(By element, String input){
        driver.findElement(element).sendKeys(input);
    }

    protected String getHref(By element) {
        return driver.findElement(element).getAttribute("href");
    }

    protected String getUrl(){
        return driver.getCurrentUrl();
    }

    protected List<WebElement> getListOfWebElements(By element){
        return driver.findElements(element);
    }
}
