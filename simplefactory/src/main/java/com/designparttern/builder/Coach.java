package com.designparttern.builder;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:08
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Coach {

  private CourseBuilder courseBuilder;

  public void setCourseBuilder(CourseBuilder courseBuilder) {
    this.courseBuilder = courseBuilder;
  }

  public Course makeCourse(String courseName, String coursePPT, String courseVideo,
      String courseArticle, String courseQA) {
    this.courseBuilder.buildCourseName(courseName);
    this.courseBuilder.buildCourseArticle(courseArticle);
    this.courseBuilder.buildCoursePPT(coursePPT);
    this.courseBuilder.buildCourseVideo(courseVideo);
    this.courseBuilder.buildCourseQA(courseQA);
    return this.courseBuilder.makeCourse();
  }

}
