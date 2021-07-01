package com.sky.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    private WebDriver browser;

    @FindBys({
            @FindBy(className = "modal-content"),
            @FindBy(className = "close")
    })
    private WebElement closeButton;

    public WelcomePage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public HomePage closeWelcomeScreen() {
        closeButton.click();

        return new HomePage(browser);
    }

}
