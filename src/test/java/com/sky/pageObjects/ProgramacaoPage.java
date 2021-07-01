package com.sky.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramacaoPage {
    private WebDriver browser;

    @FindBy(id = "portlet_com_liferay_journal_" +
            "content_web_portlet_JournalContentPortlet_INSTANCE_aKJUz209eKa8")
    private WebElement programacaoList;

    @FindBy(className = "schedule-live")
    private WebElement airingNowPointer;

    public ProgramacaoPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public ProgramacaoPage scrollToProgramacaoList() {
        ((JavascriptExecutor) browser).executeScript("arguments[0]." +
                "scrollIntoView(true)", programacaoList);

        return this;
    }

    public ProgramaDetailsPage openCurrentlyAiringShow() {
        ((JavascriptExecutor) browser).executeScript(
                "arguments[0].click()",
                airingNowPointer
        );
        return new ProgramaDetailsPage(browser);
    }
}
