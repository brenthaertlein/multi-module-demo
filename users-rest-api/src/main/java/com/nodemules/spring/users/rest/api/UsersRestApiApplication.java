package com.nodemules.spring.users.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
        "com.nodemules.spring.users"
    }
)
public class UsersRestApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(UsersRestApiApplication.class, args);
  }
}
