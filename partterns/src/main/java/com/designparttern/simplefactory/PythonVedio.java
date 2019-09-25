package com.designparttern.simplefactory;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/07/24 21:44
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class PythonVedio extends Video {

  @Override
  public void produce() {
    System.out.println("python produce");

  }
}
