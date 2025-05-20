package tests;

import configs.PropertiesConf;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TgBotTests {
    static Properties properties;
    private static String BOT_TOKEN;
    private static long CHAT_ID;

    @BeforeAll
    static void setUp() {
        properties = PropertiesConf.readProp("secretTg.properties");
        BOT_TOKEN = properties.getProperty("botToken");
        CHAT_ID = Long.parseLong(properties.getProperty("chatId"));
    }

    @Test
    void putMessage(){
        RestAssured.given()
                .baseUri("https://api.telegram.org")
                .basePath("/bot" + BOT_TOKEN)
                .queryParam("chat_id", CHAT_ID)
                .queryParam("text", "aa")
                .when()
                .get("/sendMessage")
                .then()
                .log().all()  // Логируем весь запрос и ответ
                .statusCode(200)
                .body("ok", equalTo(true));
    }
    @Test
    void sendPhoto(){
       /* RestAssured.given()
                .baseUri("https://api.telegram.org")
                .basePath("/bot" + BOT_TOKEN)
                .multiPart("chat_id", CHAT_ID)
                .multiPart("photo",)*/

    }
    @Test
    void sendPhotoAndCaption(){
        InputStream imageStream = getClass().getClassLoader().getResourceAsStream("png/nleChoppa.jpg");
        RestAssured.given()
                .multiPart("chat_id", CHAT_ID)
                .multiPart("photo", "cat.jpg", imageStream, "image/jpeg")
                .multiPart("caption","nle")
                .when()
                .post("https://api.telegram.org/bot" + BOT_TOKEN + "/sendPhoto");
    }

}
