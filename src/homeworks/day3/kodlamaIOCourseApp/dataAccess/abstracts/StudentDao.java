package homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

public interface StudentDao {

    void addStudent(Student student);

    void updatetudent(String id);

    void deletetudent(String id);
}
