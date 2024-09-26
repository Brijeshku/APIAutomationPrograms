package com.thetestingacademy.Testng_22092024;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verfication001 {

    @Test
    public void test_verify(){
        String responseName="Tony";
        Assert.assertEquals("Tony",responseName);
    }
}
