package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleServiceTest {
    private final SimpleService simpleService = new SimpleService();

    @Test
    public void setEvenNumberTest() {
        simpleService.setEvenNumber(2);
    }
}