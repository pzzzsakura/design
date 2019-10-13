package com.designparttern.singleton;


//懒汉式 不能防御反射
//线程不安全的
//延迟加载
public class LazySingleton {

  private static LazySingleton lazySingleton = null;
  //私有构造器
  private LazySingleton(){

  }
  //synchronized 锁着整个class 使线程安全 但影响性能
  public synchronized static LazySingleton getInstance() {
    if(lazySingleton==null){
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
