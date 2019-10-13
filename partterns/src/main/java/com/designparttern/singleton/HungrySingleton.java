package com.designparttern.singleton;

//饿汉式
public class HungrySingleton {

  private final static HungrySingleton hungrySingleton;

  static {
      hungrySingleton = new HungrySingleton();
  }

  private HungrySingleton(){
    if(hungrySingleton!=null){
      throw new RuntimeException("禁止反射");
    }
  }

  public static HungrySingleton getInstance() {
    return hungrySingleton;
  }
}
