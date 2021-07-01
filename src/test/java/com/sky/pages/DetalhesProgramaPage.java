package com.sky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetalhesProgramaPage extends Dashboard {
    @FindBy(how = How.CLASS_NAME, using = "sky-modal-program-title")
    private WebElement tituloDetalhe;

    @FindBy(how = How.CLASS_NAME, using = "sky-modal-program-date-time")
    private WebElement duracaoDetalhe;

    public DetalhesProgramaPage(WebDriver browser){
        super(browser);
    }

    public String pegarTituloTelaDetalhes(){
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("sky-modal-program-description")));
        String tituloTelaDetalhes = tituloDetalhe.getText();

        return tituloTelaDetalhes;
    }

    public String pegarDuracaoTelaDetalhes() {
        String duracaoTelaDetalhes = duracaoDetalhe.getText();
        return duracaoTelaDetalhes;
    }
}
