package demo_api;

import demo_api.config.ApiConfig;
import demo_api.pojo.get.Pet;
import demo_api.pojo.get.UserPojo;
import demo_api.steps.PetControllerSteps;
import demo_api.steps.UserApiSteps;
import io.qameta.allure.*;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Epic("API Тесты")
@Tag("Api")
public class Main extends ApiConfig {
    @BeforeAll
   static public void addUser(){

    }

    @Test
    @DisplayName("Получение данных животного по id")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Pet")
    @Story("Get")
    @Owner("Dypose")
    void successfulGetPetTest() {
        long petId = 1L;
        Pet pet = PetControllerSteps.getPet(petId);

        assertThat(pet).isNotNull();
        assertThat(pet.getId()).isEqualTo(petId);
        assertThat(pet.getPhotoUrls()).isNotNull();
        assertThat(pet.getStatus())
                .isIn("available", "pending", "sold");
    }
    @Test
    @DisplayName("Добавляем нового животного")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Pet")
    @Story("Post")
    @Owner("Dypose")
    void successfulPostPetTest() {

    }
    /// /////////////////////////////////////////
    @Test
    void successfulGetUser(){
       long userId =8471720280778750000L;
        UserPojo string = UserApiSteps.getUser("string");
        assertThat(string).isNotNull();
        assertThat(userId).isEqualTo(string.getId());

    }



}
