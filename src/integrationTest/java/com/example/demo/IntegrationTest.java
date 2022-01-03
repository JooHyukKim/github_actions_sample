package com.example.demo;

import com.example.demo.service.SimpleService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationTest {
    @Autowired SimpleService simpleService;

    @Test
    void testIntegrations() {
        Assertions.assertEquals(2, 2);
        System.out.println("------------------------Integration");
    }

    @Test
    void setEvenNumber() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> simpleService.setEvenNumber(3));
    }
}
