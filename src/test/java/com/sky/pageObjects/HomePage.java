package com.sky.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver browser;

    @FindBy(id = "acc-container")
    private WebElement fullPage;

    public HomePage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public HomePage scrollToDashboard() {
        fullPage.isDisplayed();

        return this;
    }

}
