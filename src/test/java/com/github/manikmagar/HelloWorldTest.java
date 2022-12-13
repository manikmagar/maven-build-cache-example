package com.github.manikmagar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

  @Test
  void sayHello() {
    Assertions.assertEquals(new HelloWorld().sayHello(), "Hello");
  }
}