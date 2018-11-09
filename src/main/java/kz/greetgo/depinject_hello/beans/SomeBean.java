package kz.greetgo.depinject_hello.beans;

import kz.greetgo.depinject.core.Bean;

@Bean
public class SomeBean {
  public void hello() {
    System.out.println();
    System.out.println("\tThe application runs ok");
    System.out.println();
    System.out.println("\tHello from SOME BEAN");
    System.out.println();
  }
}
