package com.designparttern.simplefactory;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/07/24 21:47
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class VedioFactory {

//  public Video getVideo(String type){
//    //如果扩展，此类需要不断修改
//    if("java".equals(type.toLowerCase())){
//      return new JavaVedio();
//    }else if("python".equals(type.toLowerCase())){
//      return new PythonVedio();
//    }else{
//      return null;
//    }
//  }


  /**
   * 利用反射,如果需要新增只需要新增工厂实现类，此工厂方法不用修改
   * @param clazz
   * @return
   */
  public Video getVideo(Class clazz) {
    Video video = null;
    try {
      video = (Video) Class.forName(clazz.getName()).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return video;
  }
}
