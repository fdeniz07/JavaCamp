package homeworks.day3.kodlamaIOCourseApp.ui.console;

import homeworks.day3.kodlamaIOCourseApp.business.concretes.InstructorManager;
import homeworks.day3.kodlamaIOCourseApp.core.logging.DatabaseLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.FileLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.MailLogger;

import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Instructor instructor1 = new Instructor();
        instructor1.setId("INST-1001");
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setEmail("engin.demirog@kodlama.io");
        instructor1.setPhoneNumber("123456789");
        instructor1.setCertificates("OCA,OCP");

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor1);

        Student student1= new Student("STD-10001", "Ali", "Can", "ali.can@hotmail.de", "+49123112456", false, "Wilhelm Straße 17 58085 Hagen");

        List<Student>studentList = new ArrayList<>();
        studentList.add(student1);


        Category category1 = new Category();
        category1.setCategoryName("Fullstack Java Course");
        category1.setCategoryDetail("Java, Spring, React");

        List<Category> categoryList =new ArrayList<>();
        categoryList.add(category1);

        Course[] courses = {new Course("COURSE-101","Java","Java Ile A'dan Z'ye Programlama","path",109.99,6,instructor1,category1,studentList,"Started")};

        Logger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        InstructorManager im = new InstructorManager(new HibernateDao(),loggers,instructorList);
        im.addInstructor(instructor1);

    }
}
