package com.designparttern.singleton;

//通过静态内部类初始化锁,允许多个线程初始化一个实例 不需考虑指令重排序
public class StaticInnerClassSingleton {

  private StaticInnerClassSingleton(){

  }
  private static class  InnerClass{
    private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
  }

  public StaticInnerClassSingleton getInstance(){
    return InnerClass.staticInnerClassSingleton;
  }
}
