package com.thetestingacademy.testng_example;

import org.testng.annotations.Test;

public class TestNG007 {

    @Test
    public void servicestartedok(){

        System.out.println("I will run first ");

    }
    @Test(dependsOnMethods = "servicestartedok")
    public void method1(){
        System.out.println("method1");
    }
}
