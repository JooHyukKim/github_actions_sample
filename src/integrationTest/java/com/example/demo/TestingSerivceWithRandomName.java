package com.example.demo;

import com.example.demo.service.SimpleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestingSerivceWithRandomName {

  @Autowired
  SimpleService service;

  @Test
  void name() {
    // given
    // when
    Assertions.assertEquals(Integer.MAX_VALUE, service.untestedMethod());
    // then
  }

  @Test
  public void rtt() {
    Assertions.assertEquals(Integer.MIN_VALUE, service.untestedMethod2());
  }
}
