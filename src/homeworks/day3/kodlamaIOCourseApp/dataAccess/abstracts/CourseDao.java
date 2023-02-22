package homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;

public interface CourseDao {

    void addCourse(Course course);

    void updateCourse(String id);

    void deleteCourse(String id);

}
