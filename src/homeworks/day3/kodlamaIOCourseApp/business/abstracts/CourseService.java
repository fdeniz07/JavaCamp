package homeworks.day3.kodlamaIOCourseApp.business.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.List;

public interface CourseService {

    void addCourse(Course course) throws Exception;

    void updateCourse(String id) throws Exception;

    void deleteCourse(String id) throws Exception;

    List<Course> getCourseList();

    //Course getCourseById(String id);

    void fillCourseList();

    void showCourses();
}
