package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Users;

import java.time.LocalDate;
import java.util.Arrays;

public class Instructors extends Users {

    private String[] certificates;

    public Instructors(String id, String firstName, String lastName, String email, LocalDate birthDate, String phoneNumber, String[] certificates) {
        super(id, firstName, lastName, email, birthDate, phoneNumber);
        this.certificates = certificates;
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
                '}';
    }
}
