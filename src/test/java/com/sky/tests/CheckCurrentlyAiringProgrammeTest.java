package com.sky.tests;

import com.sky.pages.Dashboard;
import com.sky.pages.HomePage;
import com.sky.pages.ProgramacaoListPage;
import com.sky.pages.ProgramacaoPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckCurrentlyAiringProgrammeTest {
    WebDriver chrome;

    @BeforeEach
    public void setup(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void teardown(){
        chrome.close();
    }

    @Test
    @Description("Accesses the information of the current show and compares the title")
    public void VerifyCurrentShowTitleAndDuration() {
        HomePage home = new HomePage(chrome);
        home.closeWelcomeScreen();

        Dashboard dashboard = new Dashboard(chrome);
        dashboard.accessMenuProgramacao();

        ProgramacaoPage programacaoPage = new ProgramacaoPage(chrome);
        programacaoPage.scrollToProgramacaoList();

        ProgramacaoListPage programacaoList = new ProgramacaoListPage(chrome);
        programacaoList.getDisplayedInformation();
        programacaoList.openCurrentShowNaTela();
        programacaoList.getInformationDetailScreen();

        assertEquals(programacaoList.showTitle,
                programacaoList.showTitleDetailScreen);
        assertEquals(programacaoList.showDuration,
                programacaoList.showDurationDetailScreen);
    }
}
