package demo_api.steps;

import demo_api.config.ApiConfig;
import demo_api.pojo.get.Pet;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class PetControllerSteps {
    @Step("Получаем список животного id:{petId}")
    public static Pet getPet(long petId){
        return given()
                 .spec(ApiConfig.mainRequestSpec(ContentType.JSON))
                 .pathParam("petId", petId)
                 .get("/pet/{petId}")
                 .then()
                 .spec(ApiConfig.mainResponseSpec(200))
                .extract().as(Pet.class);
    }
   public void successfulPostPetTest() {//todo параметр req возврат res
       Pet petReq = Pet.builder()
               .id(new Random().nextLong(10000))
               .name("Buddy")
               .status("available")
               .category(Pet.Category.builder()
                       .id(1L)
                       .categoryName("dogs")
                       .build())
               .photoUrls(List.of("url1.jpg", "url2.jpg"))
               .tags(List.of(
                       Pet.Tag.builder()
                               .id(1L)
                               .name("friendly")
                               .build()
               ))
               .build();

       Pet petRes = given()
               .when()
               .body(petReq)
               .spec(ApiConfig.mainRequestSpec(ContentType.JSON))
               .post("pet")
               .then().spec(ApiConfig.mainResponseSpec(200)).extract().as(Pet.class);


   }

}
