package demo_api.steps;

import demo_api.config.ApiConfig;
import demo_api.pojo.get.UserPojo;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApiSteps {
    @Step("Получаем юзера по имени:{userName}")
    public static UserPojo getUser(String userName){
       return given()
                .spec(ApiConfig.mainRequestSpec(ContentType.JSON))
                .pathParam("username",userName)
                .get("/user/{username}")
                .then().spec(ApiConfig.mainResponseSpec(200)).extract().as(UserPojo.class);
    };
}
