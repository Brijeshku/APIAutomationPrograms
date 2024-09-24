package com.thetestingacademy.testng_example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG004 {


    @Test(priority = 1)
    public void getToken(){
        System.out.println("1");
        System.out.println("verify the priorty 1");

    }

    @Test (priority = 3)
    public void getBookingID(){
        System.out.println("2");
        System.out.println("verify the priorty 2");
    }
    @Test(priority = 2)
    public void test_PUT(){
        // token and BookingID
        System.out.println("3");
        System.out.println("verify the priorty 3");

    }
}

