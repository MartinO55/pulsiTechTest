package com.pulsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.pulsi" })
public class App {

  //this turns the server to 'on'
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
