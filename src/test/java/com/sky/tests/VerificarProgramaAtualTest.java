package com.sky.tests;

import com.sky.pages.HomePage;
import com.sky.pages.DetalhesProgramaPage;
import com.sky.pages.ProgramacaoPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificarProgramaAtualTest {
    WebDriver browser;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.sky.com.br");
    }

    @AfterEach
    public void teardown(){
        browser.close();
    }

    @Test
    @Description(
            "Verificar o show atual e comparar se o titulo " +
                    "e duração foram refletidos nos detalhes"
    )
    public void testVerificarDuracaoETituloDoProgramaAtual() {
        String tituloPrograma = new HomePage(browser)
                .fecharJanelaBemVindo()
                .abrirMenuProgramacao()
                .pegarTitulo();

        ProgramacaoPage programacaoPage = new ProgramacaoPage(browser);
        String duracaoPrograma = programacaoPage
                .pegarDuracao();

        String tituloDetalhesPrograma = programacaoPage
                .abrirProgramaAtual()
                .pegarTituloTelaDetalhes();

        String duracaoTelaDetalhes = new DetalhesProgramaPage(browser)
                .pegarDuracaoTelaDetalhes();

        assertEquals(tituloPrograma, tituloDetalhesPrograma);
        assertEquals(duracaoPrograma, duracaoTelaDetalhes);
    }
}
