package com.designparttern.singleton;


//多个线程隔离的 单例
public class ThreadLocalSingleton {

  private static  ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal
      = new ThreadLocal<ThreadLocalSingleton>(){

    protected ThreadLocalSingleton initialValue() {
      return new ThreadLocalSingleton();
    }
  };

  private ThreadLocalSingleton(){

  }


  public static ThreadLocalSingleton getInstance(Object key) {
    return threadLocalSingletonThreadLocal.get();
  }
}
