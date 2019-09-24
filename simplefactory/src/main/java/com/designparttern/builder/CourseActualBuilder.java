package com.designparttern.builder;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:07
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class CourseActualBuilder extends CourseBuilder {

  private Course course = new Course();

  @Override
  public void buildCourseName(String courseName) {
    course.setCourseName(courseName);
  }

  @Override
  public void buildCoursePPT(String coursePPT) {
    course.setCoursePPT(coursePPT);
  }

  @Override
  public void buildCourseVideo(String courseVideo) {
    course.setCourseVideo(courseVideo);
  }

  @Override
  public void buildCourseArticle(String courseArticle) {
    course.setCourseArticle(courseArticle);
  }

  @Override
  public void buildCourseQA(String courseQA) {
    course.setCourseQA(courseQA);
  }

  @Override
  public Course makeCourse() {
    return course;
  }
}
