package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Users;

import java.time.LocalDate;


public class Instructor extends Users {

    private String certificates;
    private Course course;


    public Instructor() {
    }

    public Instructor(String id, String firstName, String lastName, String email, LocalDate birthDate, String phoneNumber, String certificates, Course course) {
        super(id, firstName, lastName, email, birthDate, phoneNumber);
        this.certificates = certificates;
        this.course = course;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    @Override
    public String toString() {
        return "{" +
                "certificates='" + certificates + '\'' +
                ", course=" + course +
                '}';
    }
}
