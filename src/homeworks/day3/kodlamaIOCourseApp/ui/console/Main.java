package homeworks.day3.kodlamaIOCourseApp.ui.console;

import homeworks.day3.kodlamaIOCourseApp.business.concretes.InstructorManager;
import homeworks.day3.kodlamaIOCourseApp.core.logging.DatabaseLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.FileLogger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.core.logging.MailLogger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateCrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Instructor instructor1 = new Instructor();
        instructor1.setId("INST-1001");
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setBirthDate(LocalDate.ofEpochDay(1985-10-2));
        instructor1.setEmail("engin.demirog@kodlama.io");
        instructor1.setPhoneNumber("123456789");
        instructor1.setCertificates("OCA,OCP");

        Logger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        InstructorManager im = new InstructorManager(new HibernateCrudDao(),loggers);
        im.addInstructor(instructor1);

    }
}
