package com.sky.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProgramacaoListPage {
    private WebDriver driver;

    public String showTitle;
    public String showDuration;
    public String showTitleDetailScreen;
    public String showDurationDetailScreen;

    @FindBy(how = How.CLASS_NAME, using = "schedule-live")
    private WebElement airingNow;

    @FindBys({
        @FindBy(className = "schedule-live"),
        @FindBy(className = "program-schedule-title")
    })
//    @FindBy(how = How.CLASS_NAME, using = "schedule-live")
    private WebElement displayedProgrammeTitle;
    @FindBys({
            @FindBy(className = "schedule-live"),
            @FindBy(className = "program-duration")
    })
    private WebElement displayedProgrammeDuration;

    @FindBy(how = How.CLASS_NAME, using = "sky-modal-program-title")
    private WebElement programmeTitleDetailScreen;
    @FindBy(how = How.CLASS_NAME, using = "sky-modal-program-date-time")
    private WebElement programmeDurationDetailScreen;

    public ProgramacaoListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getDisplayedInformation(){
        showTitle = displayedProgrammeTitle.getText();
        showDuration = displayedProgrammeDuration.getText();
    }

    public void getInformationDetailScreen(){
        showTitleDetailScreen = programmeTitleDetailScreen.getText();
        showDurationDetailScreen = programmeDurationDetailScreen.getText();
    }

    public void openCurrentShowNaTela() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", airingNow);
    }

}
