package kz.greetgo.depinject_hello.beans;

import kz.greetgo.depinject.core.Bean;

@Bean
public class SomeBean {
  public void hello() {
    System.out.println("Hello from SOME BEAN");
  }
}
