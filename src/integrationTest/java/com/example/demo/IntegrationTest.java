package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
public class IntegrationTest {

    @Test
    void testIntegrations() {
        Assertions.assertEquals(2, 2);
        System.out.println("------------------------Integration");
    }
}
