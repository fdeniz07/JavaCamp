package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Users;

public class Instructor extends Users {

    private String certificates;
    private Course course;

    public Instructor() {
    }

    public Instructor(String id, String firstName, String lastName, String email,  String phoneNumber, String certificates, Course course) {
        super(id, firstName, lastName, email, phoneNumber);
        this.certificates = certificates;
        this.course = course;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "certificates='" + certificates + '\'' +
                ", course=" + course +
                '}';
    }

}
