package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SimpleController {

  @GetMapping("hello")
  public String sayHello() {
    log.info("Request | SimpleController | GET | \"/hello\"");
    return "Hello from the other side......";
  }
}
