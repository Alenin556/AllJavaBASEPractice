package testPackage.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

@Slf4j
public class BaseDriverSetup {
    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.timeout = 10000;
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void log() {
        log.info(" - 'Test starts'");
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Selenide.closeWebDriver();
        log.info(" - 'Test ends'");
        Thread.sleep(2000);
    }
}
