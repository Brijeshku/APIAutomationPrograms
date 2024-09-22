package com.thetestingacademy.ex_15092024CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDPUTStyle {

    RequestSpecification      RequestSpecification;
    ValidatableResponse        ValidatableResponse;
    Response response;
//    public void get_token(){
//
//    }
//    public void get_bookingid(){
//        return bookingid;
//    }

    @Test
    public void test_put_positive_tc(){
        String payload=" {\"firstname\" : \"tony\",\n" +
                "    \"lastname\" : \"Brown\",}";
        RequestSpecification= RestAssured.given();
       RequestSpecification.baseUri("https://restful-booker.herokuapp.com");
        RequestSpecification.basePath("/auth");

    }
}

