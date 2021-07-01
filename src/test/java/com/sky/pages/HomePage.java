package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Dashboard {
    @FindBys({
        @FindBy(className = "modal-content"),
        @FindBy(className = "close")
    })
    private WebElement botaoFecharJanelaBemVindo;

    public HomePage(WebDriver browser){
        super(browser);
    }

    public HomePage fecharJanelaBemVindo(){
        botaoFecharJanelaBemVindo.click();
        return this;
    }
}
