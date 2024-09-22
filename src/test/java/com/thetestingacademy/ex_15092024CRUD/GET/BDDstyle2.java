package com.thetestingacademy.ex_15092024CRUD.GET;

import io.restassured.RestAssured;

public class BDDstyle2 {
    public static void main(String[] args) {

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/221008")
                .when().log().all().get()
                .then().log().all().statusCode(200);

    }
}
