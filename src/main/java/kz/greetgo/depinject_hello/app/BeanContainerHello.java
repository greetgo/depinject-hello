package kz.greetgo.depinject_hello.app;

import kz.greetgo.depinject_hello.beans.SomeBean;
import kz.greetgo.depinject_hello.beans.SomeBeanConfig;
import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;

@Include(SomeBeanConfig.class)
public interface BeanContainerHello extends BeanContainer {
  SomeBean someBean();
}
