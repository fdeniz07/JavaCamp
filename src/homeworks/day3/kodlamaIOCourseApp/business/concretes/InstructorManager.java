package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.InstructorService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.InstructorDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;


import java.util.ArrayList;
import java.util.List;

public class InstructorManager implements InstructorService {

    InstructorDao instructorDao;

    private Logger[] loggers;

    List<Instructor> instructorList= new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructorList = instructors;
    }

    @Override
    public void addInstructor(Instructor instructor) throws Exception {

        for (Instructor existInstructor: instructorList){
            if (existInstructor.getFirstName().equals(instructor.getFirstName()) && existInstructor.getLastName().equals(instructor.getLastName())){
                throw new Exception("Bu egitmen daha önce kayit edilmistir. Lütfen farkli bir egitmen giriniz!");
            }
        }

        instructorDao.addInstructor(instructor);


        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }

    }

    @Override
    public void updateInstructor(String id) throws Exception {

    }

    @Override
    public void deleteInstructor(String id) throws Exception {

    }

    @Override
    public List<Instructor> getInstructorList() {
        return null;
    }

    @Override
    public Instructor getSInstructorById(String id) {
        for (Instructor w : instructorList){
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    @Override
    public void fillInstructorList() {

    }


}
