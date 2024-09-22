package com.thetestingacademy.restassured.io;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test001 {
    public static void main(String[] args) {

    }
@Test
    public void test_01(){
        RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users?page=2")
                .when().log().all().get()
                .then().log().all().statusCode(400);

    }
}
