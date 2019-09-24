package com.designparttern.builder;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:04
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public abstract class CourseBuilder {

  public abstract void buildCourseName(String courseName);
  public abstract void buildCoursePPT(String coursePPT);
  public abstract void buildCourseVideo(String courseVideo);
  public abstract void buildCourseArticle(String courseArticle);
  public abstract void buildCourseQA(String courseQA);


  public abstract Course makeCourse();
}
