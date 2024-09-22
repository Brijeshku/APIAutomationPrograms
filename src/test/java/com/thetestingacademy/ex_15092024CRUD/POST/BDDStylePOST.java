package com.thetestingacademy.ex_15092024CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class BDDStylePOST {
    public static void main(String[] args) {

        String payload="{\n" +
                "                “username”: ”admin”,\n" +
                "                “password” : admin123\n" +
                "\n" +
                "        }";

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(payload).when()
                .post().then().log()
                .all().statusCode(200);


    }
}
