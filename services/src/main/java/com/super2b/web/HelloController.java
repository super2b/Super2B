package com.super2b.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/hello") public User index() {
    return new User("lwb", "123456", "1");
  }
}
