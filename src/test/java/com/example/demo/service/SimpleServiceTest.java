package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleServiceTest {
  private final SimpleService simpleService = new SimpleService();

  @Test
  public void setEvenNumberTest() {
    simpleService.setEvenNumber(6);
  }
}
