package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.CourseService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CourseDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CourseManager implements CourseService {

    CourseDao courseDao;
    StudentManager sm;
    InstructorManager im;
    CategoryManager cm;

    private Logger[] loggers;
    List<Course> courses = new ArrayList<>();

    public static List<Course> courseList = new ArrayList<>();

    public CourseManager() {
    }

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void addCourse(Course course) throws Exception {
        fillCourseList();
        for (Course existCourse : courseList) {
            if (existCourse.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Bu kurs daha önce tanimlanmistir. Lütfen farkli bir kurs ismi giriniz!");
            }
        }
        if (course.getPrice() < 0) {
            throw new Exception("Kurs ücreti $0'dan büyük olamali.");
        } else {
            courseDao.addCourse(course);
        }


        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }

    @Override
    public void updateCourse(String id) throws Exception {

    }

    @Override
    public void deleteCourse(String id) throws Exception {

    }

    @Override
    public List<Course> getCourseList() {
        return null;
    }


    public static Course getCourseById(String id) {
        for (Course w : courseList) {
            if (Objects.equals(w.getId(), id)) {
                return w;
            }
        }
        return null;
    }

    @Override
    public void fillCourseList() {

        Course course1 = new Course("COU-101", "C#", "C# Development Course", "...//c#", 59.99, 3, InstructorManager.getSInstructorById("INST-1"), CategoryManager.getCategoryById("CAT-1001"), StudentManager.fillStudentList(), "Started");
        Course course2 = new Course("COU-102", "Java", "Java Development Course", "...//java", 69.99, 3, InstructorManager.getSInstructorById("INST-2"), CategoryManager.getCategoryById("CAT-1002"), StudentManager.fillStudentList(), "Started");
        Course course3 = new Course("COU-103", "React", "Frontend Development Course", "...//react", 49.99, 3, InstructorManager.getSInstructorById("INST-2"), CategoryManager.getCategoryById("CAT-1003"), StudentManager.fillStudentList(), "Finished");
        Course course4 = new Course("COU-104", "SQL", "Database Development Course", "...//sql", 39.99, 3, InstructorManager.getSInstructorById("INST-1"), CategoryManager.getCategoryById("CAT-1004"), StudentManager.fillStudentList(), "Started");

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
    }

    @Override
    public void showCourses() {
        System.out.println();
        System.out.println("\033[34m ////////////////////////////////////// COURSE LIST \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \033[0m \n");
        System.out.printf("%-16s \033[34m %-15s  \033[0m %-30s %-20s %-10s %-16s %-10s \n", "Course Code", "Course Name", "Course Details", "Image Path", "Price", "Course Period", "Status");
        System.out.printf("%-16s \033[34m %-15s  \033[0m %-30s %-20s %-10s %-16s %-10s \n", "---------------", "---------------", "------------------------------", "--------------------", "------", "--------------", "----------");
        for (Course w : courseList) {
            System.out.printf("%-16s \033[34m %-15s  \033[0m %-30s %-20s $%-10s %-16s %-10s \n", w.getId(), w.getCourseName(), w.getCourseDetails(), w.getCourseImagePath(), w.getPrice(), w.getCoursePeriod()+" Months", w.getCourseStatus());
        }
        System.out.println();

    }

}
