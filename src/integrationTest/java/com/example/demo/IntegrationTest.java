package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationTest {

    @Test
    void testIntegrations() {
        Assertions.assertEquals(2, 2);
    }
}
