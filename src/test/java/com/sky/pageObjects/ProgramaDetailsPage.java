package com.sky.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramaDetailsPage {
    WebDriver browser;

    @FindBy(className = "sky-modal-program-description")
    private WebElement detailsScreen;

    public ProgramaDetailsPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public ProgramaDetailsPage checkIfDetailsIsDisplayed() {
        detailsScreen.isDisplayed();

        return this;
    }
}
