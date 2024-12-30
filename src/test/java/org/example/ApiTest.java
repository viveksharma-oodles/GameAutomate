package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public static void test() {
        RestAssured.baseURI = "https://api.resful-api.devs";

        Response response = given().when().get("/objects");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code -> "+response.getStatusCode());
        System.out.println("Response Time -> "+response.getTime());
    }
}