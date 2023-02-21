package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

public class CourseManager {

    private CrudDao[] crudDao;
    private Logger[] loggers;

    public CourseManager(CrudDao[] crudDao, Logger[] loggers) {
        this.crudDao = crudDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor, Category category, Course course) throws Exception{

        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0 dan kücük olamaz");
        }

        //if (categories.getCategoryName().)





    }
}
