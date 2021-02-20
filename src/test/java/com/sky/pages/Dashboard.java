package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver driver;
    @FindBys({
        @FindBy(className = "nav-main-container"),
        @FindBy(linkText = "Programação")
    })
    private WebElement programacao;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accessMenu(){
        programacao.click();
    }

}
