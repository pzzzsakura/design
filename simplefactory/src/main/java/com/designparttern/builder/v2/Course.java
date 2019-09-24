package com.designparttern.builder.v2;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:21
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Course {
  private String courseName;
  private String coursePPT;
  private String courseVideo;
  private String courseArticle;
  private String courseQA;

  @Override
  public String toString() {
    return "Course{" + "courseName='" + courseName + '\'' + ", coursePPT='" + coursePPT + '\''
        + ", courseVideo='" + courseVideo + '\'' + ", courseArticle='" + courseArticle + '\''
        + ", courseQA='" + courseQA + '\'' + '}';
  }

  public Course(CourseBuilder courseBuilder){
    this.courseName = courseBuilder.courseName;
    this.coursePPT = courseBuilder.coursePPT;
    this.courseVideo = courseBuilder.courseVideo;
    this.courseArticle = courseBuilder.courseArticle;
    this.courseQA = courseBuilder.courseQA;
  }


  public static class CourseBuilder{
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public CourseBuilder buildCourseName(String courseName) {
      this.courseName=courseName;
      return this;
    }

    public CourseBuilder buildCoursePPT(String coursePPT) {
      this.coursePPT=coursePPT;
      return this;
    }

    public CourseBuilder buildCourseVideo(String courseVideo) {
      this.courseVideo=courseVideo;
      return this;
    }

    public CourseBuilder buildCourseArticle(String courseArticle) {
      this.courseArticle=courseArticle;
      return this;
    }

    public CourseBuilder buildCourseQA(String courseQA) {
      this.courseQA=courseQA;
      return this;
    }

    public Course build(){
      return new Course(this);
    }

  }
}
