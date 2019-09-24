package com.designparttern.builder.v2;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:28
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Test {

  public static void main(String[] args) {

    //按需链式调用
    Course course = new Course.CourseBuilder().buildCourseArticle("文章").buildCourseName("名字").build();
    System.out.println(course.toString());
  }
}
