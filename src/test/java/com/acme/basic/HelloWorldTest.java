package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }

  @Test
  public void nowCovered() {
    new HelloWorld().nowCovered();
    System.out.println("This method is now covered by unit tests");
  }
}
