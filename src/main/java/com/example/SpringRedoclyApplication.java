package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringRedoclyApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRedoclyApplication.class, args);
  }

}

@RestController
class UserController {
  @GetMapping("/users")
  List<User> getAll() {
    return List.of(
        new User("root"),
        new User("manager"),
        new User("worker")
    );
  }
}

record User(String name) {
}