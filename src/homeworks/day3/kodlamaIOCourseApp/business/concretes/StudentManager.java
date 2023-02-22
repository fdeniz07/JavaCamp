package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.StudentService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.StudentDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.List;

public class StudentManager implements StudentService {

    StudentDao studentDao;

    Logger[] loggers;

    List<Student> students;


    public StudentManager(StudentDao studentDao, Logger[] loggers, List<Student> students) {
        this.studentDao = studentDao;
        this.loggers = loggers;
        this.students = students;
    }

    @Override
    public void addStudent(Student student) throws Exception {

    }

    @Override
    public void updateStudent(String id) throws Exception {

    }

    @Override
    public void deleteStudent(String id) throws Exception {

    }
}
