package ru.netology;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanRequestTest {
    @Test
    void shouldPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body(  "data", Matchers.equalTo("some data") );
    }
}
