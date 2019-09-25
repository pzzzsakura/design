package com.designparttern.builder;

/**
 * @author: Ma.li.ran
 * @datetime: 2019/09/24 22:13
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Test {

  public static void main(String[] args) {
    //统一建造者
    Coach coach = new Coach();
    //统一抽象builder。多种不同类型的builder创建不同的实体
    CourseBuilder courseBuilder = new CourseActualBuilder();
    //建造者通过builder 执行建造行为
    coach.setCourseBuilder(courseBuilder);
    //属性越来越多时，参数容易写串，可以采用链式调用
    Course course = coach.makeCourse("1","2","3","4","5");
    System.out.println(course.toString());
  }
}
