package com.thetestingacademy.ex_15092024CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Token {
    public static void main(String[] args) {


        String payload="{\n" +
                "                “username”: ”admin”,\n" +
                "                “password” : admin123\n" +
                "\n" +
                "        }";
        RequestSpecification r=RestAssured.given();
        r.baseUri("https://www.veripark.com/");
        r.basePath("/jobs");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
        Response response=r.when().post();
        ValidatableResponse validatableResponse=response.then();
        validatableResponse.statusCode(200);



    }
}
