package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {

  public void setEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException("[ERROR] 짝수가 아닙니다");
    }
    for (int i = 0; i < 5; i++) {
    }

    for (int i = 0; i < 5; i++) {
    }

    for (int i = 0; i < 5; i++) {
    }

    for (int i = 0; i < 5; i++) {
    }
  }

  public int untestedMethod() {
    return Integer.MAX_VALUE;
  }

  public int untestedMethod1() {
    return Integer.MIN_VALUE;
  }


  public int untestedMethod2() {
    return Integer.MIN_VALUE;
  }
}
