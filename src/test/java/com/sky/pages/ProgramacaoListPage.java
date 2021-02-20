package com.sky.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProgramacaoListPage {
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "schedule-inner schedule-live")
    private List<WebElement> airingNow;

    public ProgramacaoListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openCurrentShowNaTela() {
        airingNow.get(0).click();
    }


}
