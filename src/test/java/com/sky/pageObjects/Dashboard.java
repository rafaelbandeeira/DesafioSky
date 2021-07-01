package com.sky.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class Dashboard {
    private WebDriver browser;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/div[2]")
    private WebDriver dashboard;

    public Dashboard(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public ProgramacaoPage openProgramacaoPage() {
        dashboard.findElement(By.linkText("Programação"));

        return new ProgramacaoPage(browser);
    }

}
