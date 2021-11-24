package com.example.demo.service;

public class SimpleService {

    public void setEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("[ERROR] 입력 값이 짝수가 아닙니다.");
        }
    }
}
