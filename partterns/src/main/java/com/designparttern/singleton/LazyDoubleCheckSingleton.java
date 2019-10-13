package com.designparttern.singleton;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/10/11 22:54
 * @desc: 不能防御反射
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class LazyDoubleCheckSingleton {
  //volatile 防止多线程下的重排序
  private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
  //私有构造器
  private LazyDoubleCheckSingleton(){

  }

  public  static LazyDoubleCheckSingleton getInstance() {
    if (lazyDoubleCheckSingleton == null) {
      synchronized (LazyDoubleCheckSingleton.class) {
        if (lazyDoubleCheckSingleton == null) {
          lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
        }
      }
    }
    return lazyDoubleCheckSingleton;
  }
}
