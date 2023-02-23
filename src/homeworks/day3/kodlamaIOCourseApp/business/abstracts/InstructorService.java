package homeworks.day3.kodlamaIOCourseApp.business.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.List;

public interface InstructorService {

    void addInstructor(Instructor instructor) throws Exception;

    void updateInstructor(String id) throws Exception;

    void deleteInstructor(String id) throws Exception;

    List<Instructor> getInstructorList();

    //Instructor getSInstructorById(String id);

    void fillInstructorList();

    void showInstructors();
}
