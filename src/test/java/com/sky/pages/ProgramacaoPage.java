package com.sky.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ProgramacaoPage extends Dashboard {
//    private WebDriver browser;

    @FindBys({
            @FindBy(className = "schedule-live"),
            @FindBy(className = "program-schedule-title")
    })
    private WebElement tituloDoPrograma;

    @FindBys({
            @FindBy(className = "schedule-live"),
            @FindBy(className = "program-duration")
    })
    private WebElement duracaoDoPrograma;

    @FindBy(id = "portlet_com_liferay_journal_" +
            "content_web_portlet_JournalContentPortlet_INSTANCE_aKJUz209eKa8")
    private WebElement listaProgramacao;

    @FindBy(className = "schedule-live")
    private WebElement indicadorProgramaAtual;

    public ProgramacaoPage(WebDriver browser){
        super(browser);
    }

    public ProgramacaoPage rolarParaListaProgramacao(){
        ((JavascriptExecutor) browser).executeScript("arguments[0]." +
                "scrollIntoView(true)", listaProgramacao);
        return this;
    }

    public String pegarTitulo() {
        String tituloProgramaNaLista = tituloDoPrograma.getText();
        return tituloProgramaNaLista;
    }

    public String pegarDuracao() {
        String duracaoProgramaNaLista = duracaoDoPrograma.getText();
        return duracaoProgramaNaLista;
    }

    public DetalhesProgramaPage abrirProgramaAtual() {
        ((JavascriptExecutor) browser).executeScript(
                "arguments[0].click()",
                indicadorProgramaAtual
        );
        return new DetalhesProgramaPage(browser);
    }
}
