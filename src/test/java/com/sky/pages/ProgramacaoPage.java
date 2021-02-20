package com.sky.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProgramacaoPage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "portlet_com_liferay_journal_" +
            "content_web_portlet_JournalContentPortlet_INSTANCE_aKJUz209eKa8")
    private WebElement programacaoList;

    public void scrollToProgramacaoList(){
        ((JavascriptExecutor) driver).executeScript("arguments[0]." +
                "scrollIntoView(true);", programacaoList);
    }
}