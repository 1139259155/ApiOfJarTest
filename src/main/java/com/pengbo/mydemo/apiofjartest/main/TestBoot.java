package com.pengbo.mydemo.apiofjartest.main;

import org.testng.TestNG;

public class TestBoot {

    public static void main(String[] args) throws Exception {

        TestNG testNG = new TestNG();
        testNG.setTestClasses(new Class[]{
                com.pengbo.mydemo.apiofjartest.testcase.Test1.class,
                com.pengbo.mydemo.apiofjartest.testcase.Test2.class,
        });
        testNG.setOutputDirectory("/home/pengbo/123");
        testNG.run();
    }
}