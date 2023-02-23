package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.InstructorService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.InstructorDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;


import java.util.ArrayList;
import java.util.List;

public class InstructorManager implements InstructorService {

    InstructorDao instructorDao;
    List<Instructor> instructors = new ArrayList<>();

    private Logger[] loggers;

    public static List<Instructor> instructorList = new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        instructorList = instructors;
    }

    @Override
    public void addInstructor(Instructor instructor) throws Exception {
        fillInstructorList();
        for (Instructor w : instructorList) {
            if (w.getFirstName().equals(instructor.getFirstName()) && w.getLastName().equals(instructor.getLastName())) {
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

    //@Override
    public static Instructor getSInstructorById(String id) {
        for (Instructor w : instructorList) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    @Override
    public void fillInstructorList() {

        Instructor instructor1 = new Instructor("INST-1001", "Engin", "Demirog", "engin.demirog@kodlama.io", "123456789", "OCA,OCP", CourseManager.getCourseById("COU-102"));
        Instructor instructor2 = new Instructor("INST-1002", "Mustafa Murat", "Coskun", "mustafa.murat@gmail.com", "123456789", "MCPD", CourseManager.getCourseById("COU-104"));
        Instructor instructor3 = new Instructor("INST-1003", "Ömer Faruk", "Colakoglu", "o.colakoglu@isisan.com.tr", "123456789", "MVC,OCA", CourseManager.getCourseById("COU-103"));
        Instructor instructor4 = new Instructor("INST-1004", "Fatih", "Cakiroglu", "fcakiroglu@gmail.com", "123456789", "MCPD,MVP", CourseManager.getCourseById("COU-101"));

        instructorList.add(instructor1);
        instructorList.add(instructor2);
        instructorList.add(instructor3);
        instructorList.add(instructor4);

    }

    @Override
    public void showInstructors() {
        System.out.println();
        System.out.println("\033[33m ////////////////////////////////////// INSTRUCTOR LIST \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \033[0m \n");
        System.out.printf("%-16s  %-15s  %-15s  %-30s  %-15s  %-12s  %-10s\n", "Instructor Code", "First Name", "Last Name", "Email", "Phone Number", "Certificates", "Course Code");
        System.out.printf("%-16s  %-15s  %-15s  %-30s  %-15s  %-12s %-10s \n", "---------------", "-------------", "-------------", "-----------------------------", "---------------", "-----------", "-----------");
        for (Instructor w : instructorList) {
            System.out.printf("%-16s  %-15s  %-15s  %-30s  %-15s  %-12s %-10s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getEmail(), w.getPhoneNumber(), w.getCertificates(), w.getCourse());
        }
        System.out.println();
    }


}
