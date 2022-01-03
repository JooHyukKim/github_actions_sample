package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleServiceTest {
    private final SimpleService simpleService = new SimpleService();

    @Test
    public void setEvenNumberTest() {
        simpleService.setEvenNumber(6);
    }

    @Test
    public void tt() {
        Assertions.assertEquals(Integer.MAX_VALUE, simpleService.untestedMethod());
    }

    @Test
    public void rtt() {
        Assertions.assertEquals(Integer.MIN_VALUE, simpleService.untestedMethod1());
    }
}
