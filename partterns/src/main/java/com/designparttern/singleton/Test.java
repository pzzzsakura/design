package com.designparttern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/10/13 20:56
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Test {

  public static void main(String[] args)
      throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

//    //序列化破坏实例
//    SingletonForSerialize instance = SingletonForSerialize.getInstance();
//    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton"));
//    objectOutputStream.writeObject(instance);
//    File file = new File("singleton");
//    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//    //readObject 方法 会通过反射创建一个新的实例
//    SingletonForSerialize newInstance = (SingletonForSerialize) objectInputStream.readObject();
//    System.out.println(newInstance==instance);


    //反射可以破坏单例模式
//    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//    Class hungrySingletonClass = HungrySingleton.class;
//    Constructor constructor = hungrySingletonClass.getDeclaredConstructor();
//    constructor.setAccessible(true);
//    HungrySingleton newHungrySingleton  = (HungrySingleton) constructor.newInstance();
//    System.out.println(hungrySingleton);
//    System.out.println(newHungrySingleton);
//    System.out.println(newHungrySingleton==hungrySingleton);

    EnumInstance.getInstance().print();
  }
}
