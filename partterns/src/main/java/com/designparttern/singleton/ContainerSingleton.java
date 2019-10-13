package com.designparttern.singleton;

import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

//多个单例需求，线程不安全
public class ContainerSingleton {

  private static  Map<Object,Object> map = new HashMap<Object,Object>();

  private ContainerSingleton(){

  }

  public static void putInstance(Object key,Object instance) {
    if (!StringUtils.isEmpty(key) && instance != null) {
      if (!map.containsKey(key)) {
        map.put(key, instance);
      }
    }
  }

  public static Object getInstance(Object key) {
    return map.get(key);
  }
}
