package kz.greetgo.depinject_hello.app;

import kz.greetgo.depinject_hello.beans.SomeBean;
import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.NoImplementor;

public class HelloDepinjectApp {
  public static void main(String[] args) {
    try {
      new HelloDepinjectApp().exec();
    } catch (NoImplementor e) {
      throw new RuntimeException("\n\n\tIf you want to run the application from IDE," +
          " run HelloDepinjectAppLauncherFromIDE in test sources\n\n", e);
    }
  }

  protected void exec() {
    BeanContainerHello beanContainer = createBeanContainer();
    SomeBean someBean = beanContainer.someBean();
    someBean.hello();
  }

  protected BeanContainerHello createBeanContainer() {
    return Depinject.newInstance(BeanContainerHello.class);
  }
}
