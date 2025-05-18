package ui.tests.setUp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static ui.config2.Project.PROJECT_CONF;
import static helpers.Attach.addVideo;
import static com.codeborne.selenide.Configuration.*;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = PROJECT_CONF.url();
        Configuration.browser = PROJECT_CONF.browser();
        Configuration.browserSize = PROJECT_CONF.windowSize();
        Configuration.timeout = PROJECT_CONF.timeOut();
        Configuration.pageLoadTimeout = PROJECT_CONF.pageLoadTimeout();
        Configuration.headless = PROJECT_CONF.headless();
        Configuration.downloadsFolder = "resources/files";//todo исправить путь
        if (PROJECT_CONF.runMode().equals("selenoid")) {
            Configuration.remote = PROJECT_CONF.remote();
            Configuration.browserVersion= PROJECT_CONF.browserVersion();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }

    @BeforeEach
    void allure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeEach
    void downloadFile() {
        URL resourceUrl = getClass().getClassLoader().getResource("files");
        if (resourceUrl == null) {
            throw new RuntimeException("Downloads folder not found in resources");
        }
        downloadsFolder = resourceUrl.getPath();
        File downloadsFolderFile = new File(downloadsFolder);
        // Очистка папки перед тестом
        try {
            FileUtils.cleanDirectory(downloadsFolderFile);
        } catch (IOException e) {
            throw new RuntimeException("Failed to clean downloads directory", e);
        }
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("last screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();

        if (PROJECT_CONF.runMode().equals("selenoid")) {
            addVideo();
        }

        closeWebDriver();
    }
}
