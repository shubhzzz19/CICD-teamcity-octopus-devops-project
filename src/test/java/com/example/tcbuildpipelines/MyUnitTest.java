package com.example.tcbuildpipelines;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("unit-test")
public class MyUnitTest {

    @Test
    void some_unit_test() {
        assertThat(5).isEqualTo(5);
    }

    @Test
    void another_unit_test() {
        assertThat(6).isEqualTo(6);
    }

    @Test
    void and_one_more() {
        assertThat(7).isEqualTo(7);
    }
}
