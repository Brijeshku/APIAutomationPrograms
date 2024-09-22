package com.thetestingacademy.ex_15092024CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle2 {


    static RequestSpecification r=RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("https://api.zippopotam.us/");
        test_bdd_1();
        test_bdd_2();

    }

    private static void test_bdd_1() {
        r.basePath(("/IN/221008"));
        r.when().get();
        r.then().log().all().statusCode(200);
    }
    private static void test_bdd_2() {
        r.basePath("/IN/221009");
        r.when().get();
        r.then().log().all().statusCode(400);

    }
}
