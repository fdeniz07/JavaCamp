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
    List<Course> courses;

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

        for (Course existCourse : courseList) {
            if (existCourse.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Bu kurs daha önce tanimlanmistir. Lütfen farkli bir kurs ismi giriniz!");
            }
        }
        if (course.getPrice() < 0) {
            throw new Exception("Kurs ücreti 0 olamaz.");
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

}
