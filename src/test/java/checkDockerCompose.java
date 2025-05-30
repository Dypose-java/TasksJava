import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class checkDockerCompose {
    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://github.com/Dypose-java";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "127.0";
        Configuration.remote = "http://127.0.0.1:4444/wd/hub";
        Configuration.browserCapabilities = new ChromeOptions();
        Configuration.browserCapabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true,
                "enableLog", false
        ));

    }
    @Test
    void check(){
        Selenide.open("https://github.com/Dypose-java/UI-test/blob/master/src/test/java/selenoid/MainSelenoidDemoQa.java");

    }
}
