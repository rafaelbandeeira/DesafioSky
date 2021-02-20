package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    private static String URL = "https://www.sky.com.br";

    @FindBys({
        @FindBy(className = "modal-content"),
        @FindBy(className = "sky_icon sky_icon-close icon_xs")
    })
    private WebElement welcomeScreenCloseBtn;

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void closeWelcomeScreen(){
        welcomeScreenCloseBtn.click();
    }
}
