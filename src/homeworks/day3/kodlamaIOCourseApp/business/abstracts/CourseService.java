package homeworks.day3.kodlamaIOCourseApp.business.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;

public interface CourseService {

    void addCourse(Course course) throws Exception;

    void updateCourse(String id) throws Exception;

    void deleteCourse(String id) throws Exception;

}
