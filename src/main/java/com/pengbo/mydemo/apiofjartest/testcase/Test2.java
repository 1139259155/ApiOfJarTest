package com.pengbo.mydemo.apiofjartest.testcase;

import org.testng.annotations.Test;

public class Test2 extends BaseTest {

    @Test
    public void testcase2() throws Exception {
        myService.queryByName("haha");
    }
}