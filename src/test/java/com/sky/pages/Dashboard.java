package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    protected WebDriver browser;

    @FindBys({
        @FindBy(xpath = "//*[@id=\"main-menu\"]/div[2]"),
        @FindBy(linkText = "Programação")
    })
    private WebElement programacaoBtn;

    public Dashboard(WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public ProgramacaoPage abrirMenuProgramacao(){
        programacaoBtn.click();
        return new ProgramacaoPage(browser);
    }
}
