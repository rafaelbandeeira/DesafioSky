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
    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterEach
    public void teardown(){
        driver.close();
    }

    @Test
    @Description("Accesses the information of the current show and compares the title")
    public void VerifyCurrentShowTitleAndDuration() {
        HomePage home = new HomePage(driver);
        home.closeWelcomeScreen();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.accessMenuProgramacao();

        ProgramacaoPage programacaoPage = new ProgramacaoPage(driver);

        programacaoPage.scrollToProgramacaoList();

        ProgramacaoListPage programacaoList = new ProgramacaoListPage(driver);
        programacaoList.getDisplayedInformation();
        programacaoList.openCurrentShowNaTela();
        programacaoList.getInformationDetailScreen();

        assertEquals(programacaoList.showTitle,
                programacaoList.showTitleDetailScreen);
        assertEquals(programacaoList.showDuration,
                programacaoList.showDurationDetailScreen);
    }
}
