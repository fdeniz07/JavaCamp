package homeworks.day3.kodlamaIOCourseApp.business.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    void addStudent(Student student) throws Exception;

    void updateStudent(String id) throws Exception;

    void deleteStudent(String id) throws Exception;

    List<Student> getStudentList();

    //Student getStudentById(String id);

    //void fillStudentList();

    void showStudents();
}
