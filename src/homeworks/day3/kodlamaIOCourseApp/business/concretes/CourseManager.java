package homeworks.day3.kodlamaIOCourseApp.business.concretes;


import homeworks.day3.kodlamaIOCourseApp.business.abstracts.CourseService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CourseDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;

import java.util.List;

public class CourseManager implements CourseService {

    CourseDao courseDao;

    private Logger[] loggers;
    List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void addCourse(Course course) throws Exception {

        for (Course existCourse: courses){
            if (existCourse.getCourseName().equals(course.getCourseName())){
                throw new Exception("Bu kurs daha önce tanimlanmistir. Lütfen farkli bir kurs ismi giriniz!");
            }
        }
        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0 olamaz.");
        }
        else {
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

}
