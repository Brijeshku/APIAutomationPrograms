package com.thetestingacademy.ex_15092024CRUD.testng;


import org.testng.annotations.*;

public class Test002 {

   @BeforeSuite
    void demo1(){
       System.out.println("Before suite");
    }
    @BeforeTest
    void demo2(){
        System.out.println("Before test");
    }
    @BeforeClass
    void demo3(){
        System.out.println("Before class");
    }
    @BeforeGroups
    void demo4(){
        System.out.println("Before group");
    }
  @BeforeMethod
    void demo5(){
      System.out.println("Before method");
  }
  @Test
    void demo6(){
      System.out.println("test");
  }
  @AfterMethod
    void demo7(){
      System.out.println("after method");
  }
  @AfterClass
    void demo8(){
      System.out.println("After class");
  }
  @AfterTest
    void demo9(){
      System.out.println("After test");
  }
}
