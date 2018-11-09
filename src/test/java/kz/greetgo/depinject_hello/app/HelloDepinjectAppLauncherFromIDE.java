package kz.greetgo.depinject_hello.app;

import kz.greetgo.depinject.NoImplementor;
import kz.greetgo.depinject.gen.DepinjectUtil;

public class HelloDepinjectAppLauncherFromIDE extends HelloDepinjectApp {
  public static void main(String[] args) {
    new HelloDepinjectAppLauncherFromIDE().exec();
  }

  @Override
  protected BeanContainerHello createBeanContainer() {
    try {
      return super.createBeanContainer();
    } catch (NoImplementor ignore) {

      try {
        DepinjectUtil.implementAndUseBeanContainers(
            BeanContainerHello.class.getPackage().getName(),
            "build/depinject_src");
      } catch (Exception e) {
        throw new RuntimeException(e);
      }

      return super.createBeanContainer();
    }
  }
}