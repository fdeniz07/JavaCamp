package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.enums.CourseStatus;

import java.util.List;

public class Course {

    private String id;
    private String courseName;
    private String courseDetails;
    private String courseImagePath;
    private double price;
    private int coursePeriod;


    public Course() {
    }

    public Course(String id, String courseName, String courseDetails, String courseImagePath, double price, int coursePeriod, Instructor instructor, Category category, List<Student> studentsList, CourseStatus courseStatus) {
        this.id = id;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.courseImagePath = courseImagePath;
        this.price = price;
        this.coursePeriod = coursePeriod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public String getCourseImagePath() {
        return courseImagePath;
    }

    public void setCourseImagePaths(String courseImagePaths) {
        this.courseImagePath = courseImagePath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCoursePeriod() {
        return coursePeriod;
    }

    public void setCoursePeriod(int coursePeriod) {
        this.coursePeriod = coursePeriod;
    }

}
