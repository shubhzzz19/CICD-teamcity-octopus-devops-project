package com.example.tcbuildpipelines;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ui-test")
public class MyUiTest {

    @Test
    public void run_a_selenium_test() throws InterruptedException {
        Thread.sleep(2500);
    }
}
