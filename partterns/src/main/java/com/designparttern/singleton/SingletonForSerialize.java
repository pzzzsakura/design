package com.designparttern.singleton;

import java.io.Serializable;

//序列化反序列化操作会破坏单例，序列化之前的实例和反序列化之后的实例并不是一个
public class SingletonForSerialize implements Serializable{

   private SingletonForSerialize(){

   }

  private final static SingletonForSerialize singletonForSerialize = new SingletonForSerialize();


  public static SingletonForSerialize getInstance() {
    return singletonForSerialize;
  }


  //自定义这个readResolve 名称的方法,readObject通过反射创建的新实例不会返回，返回此方法的返回值
  public Object readResolve(){
    return singletonForSerialize;
  }

}
