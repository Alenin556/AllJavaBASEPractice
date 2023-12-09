package Parametrized.WEBTests.Selenide;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import Parametrized.WEBTests.BaseDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class ParametrizedTests extends BaseDriverSetup {

    @ParameterizedTest
    @ValueSource(strings = { "cali", "bali", "dani" })
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Where I can find meteorite?"})
    void testSource(String str) {
        open("https://www.google.ru/");
        SelenideElement searchField = $x("//*[@id=\"APjFqb\"]");
        SelenideElement searchButton = $x("//*[@class=\"CcAdNb\"]");
        searchField.setValue(str);
        searchField.clear();
        searchField.setValue(str);

//        searchButton.click();
        executeJavaScript("\"arguments[0].click();\"",searchButton);
    }

    @ParameterizedTest
    @ValueSource(strings = { "Where I can find meteorite?","Where I can find excalibur?","Where I can buy flycar?"})
    void testManySource(String str) {
        open("https://www.google.ru/");
        SelenideElement searchField = $x("//*[@id=\"APjFqb\"]");
        SelenideElement searchButton = $x("//*[@class=\"CcAdNb\"]");
        searchField.setValue(str);
        searchField.clear();
        searchField.setValue(str);

        searchButton.click();
    }

    @Test
    @Disabled
    void openUrl(){
        open("https://www.google.ru/");
    }

    @Test
    @RepeatedTest(2)
    void repeated() {
        System.out.println("1");
    }
}
