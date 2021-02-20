package com.sky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Dashboard {
    @FindBys({
        @FindBy(className = "nav-main-container"),
        @FindBy(linkText = "Programação")
    })
    private WebElement programacao;

    public void accessMenu(){
        programacao.click();
    }

}
