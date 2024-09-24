package com.thetestingacademy.testng_example;

import io.qameta.allure.AllureId;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG001 {

    @Severity(SeverityLevel.BLOCKER)
    @AllureId("verify that to true==true")
    @Test
    public void testcase_001(){
        Assert.assertEquals(true,true);

    }
    @Severity(SeverityLevel.BLOCKER)
    @AllureId("verify that to true==false")
     @Test
    public void testcase_002(){
        Assert.assertEquals(true,false);

    }

  }

