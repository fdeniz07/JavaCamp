package homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

public interface CrudDao {

    void addInstructor(Instructor instructor);
    void addCategory(Category category);
    void addCourse( Course course);

    void updateInstructor(String id);
    void updateCategory(String id);
    void updateCourse(String id);


    void deleteInstructor(String id);
    void deleteCategory(String id);
    void deleteCourse(String id);

}
