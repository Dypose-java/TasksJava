package ui.pages.gitHub;

import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoriesPage {
    private String value;
    public UserRepositoriesPage(String value) {
        $("#code-tab").shouldBe(visible);
        this.value=value;
    }
    @Step("Скачиваем файл репозитория")
    public void downloadZipRep(){
        $("button[data-size='medium'][data-variant='primary']").click();
        /*File downloadedFile =  $(".m-3 .prc-ActionList-ActionListItem-uq6I7 a").download();
        assertThat(downloadedFile.getName())
                .contains(value)
                .endsWith(".zip");*/
        File downloadedFile =$(".border-top li a").download();
        assertThat(downloadedFile.getName())
                .contains(value);


    }
}
