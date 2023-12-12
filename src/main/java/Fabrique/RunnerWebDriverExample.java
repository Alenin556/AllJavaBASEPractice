package Fabrique;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static Fabrique.driverExample.fabriqueGetWebDriver;

public class RunnerWebDriverExample {

    @BeforeAll
    public static void setUp() {
        fabriqueGetWebDriver("chrome").setup();
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
    }
}
