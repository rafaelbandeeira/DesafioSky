package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver driver;
    @FindBys({
        @FindBy(xpath = "//*[@id=\"main-menu\"]/div[2]"),
        @FindBy(linkText = "Programação")
    })
    private WebElement programacaoBtn;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accessMenuProgramacao(){
        programacaoBtn.click();
    }

}
