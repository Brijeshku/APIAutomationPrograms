package com.thetestingacademy.testng_example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG007passdata {

    @Parameters("browser")
    @Test

    void demo1(String value){
        System.out.println("Browser is"+value);
    }
}
