package com.thetestingacademy;

import io.restassured.RestAssured;

public class Test002 {
    public static void main(String[] args) {
        System.out.println("Rest assured test case");
        System.out.println("Get request demo");

//         given // Header /param/ body,URL
//        when// HTTP method - GET ,POST ,PUT etc..
//         then //- Response AR=ER
      RestAssured
              .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                     .basePath("/booking/1").log().all()
              .when()
                 .get()
              .then().log().all()
                 .statusCode(200);
    }
}
