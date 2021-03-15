package com.pengbo.mydemo.apiofjartest.testcase;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

    @Test
    public void testcase1() throws Exception {
        myService.queryById("123");
    }
}