package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.core.helpers.IdMaker;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateCrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

import java.util.List;

public class InstructorManager {

    private CrudDao crudDao;
    private Logger[] loggers;

    List<Instructor> instructors;

    public InstructorManager(CrudDao crudDao, Logger[] loggers) {
        this.crudDao = crudDao;
        this.loggers = loggers;
    }

    public void addInstructor(Instructor instructor) throws Exception{

        for (Instructor existInstructor: instructors){
            if (existInstructor.getFirstName().equals(instructor.getFirstName()) && existInstructor.getLastName().equals(instructor.getLastName())){
                throw new Exception("Bu egitmen daha önce kayit edilmistir. Lütfen farkli bir egitmen giriniz!");
            }
        }
        CrudDao crudDao = new HibernateCrudDao();
        crudDao.addInstructor(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }

}
