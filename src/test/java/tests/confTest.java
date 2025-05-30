package tests;

import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class confTest extends BaseTest {

    @Tag("UI")
    @Test
    void checkConf(){

       Selenide.open(" ");
    }
}
