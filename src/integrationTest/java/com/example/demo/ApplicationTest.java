package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
  @Autowired DemoApplication demoApplication;

  @Test
  void application() {
    Assertions.assertDoesNotThrow(() -> DemoApplication.main(new String[] {"hi", "hi"}));
  }
}
