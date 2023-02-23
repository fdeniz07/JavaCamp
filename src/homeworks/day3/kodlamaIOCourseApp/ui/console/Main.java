package homeworks.day3.kodlamaIOCourseApp.ui.console;

import homeworks.day3.kodlamaIOCourseApp.business.concretes.CategoryManager;
import homeworks.day3.kodlamaIOCourseApp.business.concretes.CourseManager;
import homeworks.day3.kodlamaIOCourseApp.business.concretes.InstructorManager;
import homeworks.day3.kodlamaIOCourseApp.business.concretes.StudentManager;
import homeworks.day3.kodlamaIOCourseApp.core.logging.DatabaseLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.FileLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.MailLogger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.JdbcDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager();

        System.out.println();

        Instructor instructor1 = new Instructor();
        instructor1.setId("INST-1005");
        instructor1.setFirstName("Gencay");//Gencay Engin
        instructor1.setLastName("Yildiz");//Yildiz Demirog
        instructor1.setEmail("gencay.yildiz@gencay.com");
        instructor1.setPhoneNumber("123456789");
        instructor1.setCertificates("MCPD");
        instructor1.setCourse(CourseManager.getCourseById("COU-103"));

        InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers, InstructorManager.instructorList);
        instructorManager.addInstructor(instructor1);
        InstructorManager.instructorList.add(instructor1);
        instructorManager.showInstructors();

        System.out.println("***********************************");

        Student student1 = new Student("STD-10001", "Ali", "Can", "ali.can@hotmail.de", "+49123112456", false, "Wilhelm Straße 17 58085 Hagen");
        StudentManager studentManager = new StudentManager(new JdbcDao(), loggers, StudentManager.studentList);
        studentManager.addStudent(student1);
        StudentManager.fillStudentList();

        System.out.println("***********************************");

        Category category1 = new Category("CAT-1004", "Frontend", "Frontend Development Course");
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, CategoryManager.categoryList);
        categoryManager.addCategory(category1);
        categoryManager.fillCategoryList();

        System.out.println("***********************************");

        Course course = new Course("COU-105", "Angular", "Angular Development Course", "...//angular", 59.99, 2, instructorManager.getSInstructorById("INST-1005"), categoryManager.getCategoryById("CAT-1004"), studentManager.getStudentList(), "Not Started");
        CourseManager courseManager2 = new CourseManager(new JdbcDao(), loggers, CourseManager.courseList);
        courseManager2.addCourse(course);
        courseManager2.fillCourseList();
    }
}
