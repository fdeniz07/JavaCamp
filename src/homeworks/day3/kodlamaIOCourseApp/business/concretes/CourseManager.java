package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.CourseService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CourseDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {

    CourseDao courseDao;
    StudentManager sm;
    InstructorManager im;
    CategoryManager cm;

    private Logger[] loggers;
    public static List<Course> courseList = new ArrayList<>();

    public CourseManager() {
    }

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courseList = courses;
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

    @Override
    public Course getCourseById(String id) {
        for (Course w : courseList) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    @Override
    public void fillCourseList() {

        Course course1 = new Course("COU-101", "C#", "C# Development Course", "...//c#", 59.99, 3, im.getSInstructorById("INST-1"), cm.getCategoryById("CAT-1001"), sm.getStudentList(), "Started");
        Course course2 = new Course("COU-102", "Java", "Java Development Course", "...//java", 69.99, 3, im.getSInstructorById("INST-2"), cm.getCategoryById("CAT-1002"), sm.getStudentList(), "Started");
        Course course3 = new Course("COU-103", "React", "Frontend Development Course", "...//react", 49.99, 3, im.getSInstructorById("INST-2"), cm.getCategoryById("CAT-1003"), sm.getStudentList(), "Finished");
        Course course4 = new Course("COU-104", "SQL", "Database Development Course", "...//sql", 39.99, 3, im.getSInstructorById("INST-1"), cm.getCategoryById("CAT-1004"), sm.getStudentList(), "Started");

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
    }

}
