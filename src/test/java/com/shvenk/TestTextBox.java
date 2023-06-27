package com.shvenk;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestTextBox {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest(){
        String userName = "Иванов Иван Иванович";
        String userEmail = "ivanov-ivan1999@yandex.ru";
        String currentAddress = "г. Москва, улица Пушкина, дом Колотушкино1";
        String permanentAddress = "г. Санкт-Петербург, улица Пушкина, дом Колотушкино";

        open("/text-box");
        $("#userName").setValue(userName);
        $("#userEmail").setValue(userEmail);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        executeJavaScript("window.scrollBy(0, 250)");
        $("#submit").click();
        // $("[id=userName"])
        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(Condition.text(userName));
        $("#output #email").shouldHave(Condition.text(userEmail));
        $("#output #currentAddress").shouldHave(Condition.text(currentAddress));
        $("#output #permanentAddress").shouldHave(Condition.text(permanentAddress));
    }

}
