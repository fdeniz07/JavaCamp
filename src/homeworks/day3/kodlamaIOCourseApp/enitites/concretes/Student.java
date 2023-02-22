package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Users;

public class Student extends Users {

    private boolean gender; //true: Female - false: Male
    private String address;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, String email, String phoneNumber, boolean gender, String address) {
        super(id, firstName, lastName, email,phoneNumber);
        this.gender = gender;
        this.address = address;
    }


    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
