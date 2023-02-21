package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Users;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Instructor extends Users {

    private String[] certificates;
    private final List<Course> cours;

    public Instructor(String id, String firstName, String lastName, String email, LocalDate birthDate, String phoneNumber, String[] certificates, List<Course> cours) {
        super(id, firstName, lastName, email, birthDate, phoneNumber);
        this.certificates = certificates;
        this.cours = cours;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    @Override
    public String toString() {
        return "{" +
                "certificates=" + Arrays.toString(certificates) +
                ", courses=" + cours +
                '}';
    }
}
