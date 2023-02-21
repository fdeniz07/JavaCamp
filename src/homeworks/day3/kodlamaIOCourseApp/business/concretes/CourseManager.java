package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.core.helpers.IdMaker;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;

import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateCrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;


import java.util.List;

public class CourseManager {


    private CrudDao[] crudDao;
    private Logger[] loggers;

    List<Course> courses;


    public CourseManager(CrudDao[] crudDao, Logger[] loggers) {
        this.crudDao = crudDao;
        this.loggers = loggers;
    }


    public void addCourse(Course course) throws Exception{

        for (Course existCourse: courses){
            if (existCourse.getCourseName().equals(course.getCourseName())){
                throw new Exception("Bu kurs daha önce tanimlanmistir. Lütfen farkli bir kurs ismi giriniz!");
            }
        }

        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0 olamaz.");
        }
        else {
            CrudDao crudDao = new HibernateCrudDao();
            crudDao.addCourse(course);
        }

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }

}
