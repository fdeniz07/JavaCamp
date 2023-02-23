package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String id;
    private String courseName;
    private String courseDetails;
    private String courseImagePath;
    private double price;
    private int coursePeriod;
    private String courseStatus;

    public static List<Course> courseList = new ArrayList<>();

    public Course() {
    }

    public Course(String id, String courseName, String courseDetails, String courseImagePath, double price, int coursePeriod, Instructor instructor, Category category, List<Student> studentsList, String courseStatus) {
        this.id = id;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.courseImagePath = courseImagePath;
        this.price = price;
        this.coursePeriod = coursePeriod;
        this.courseStatus = courseStatus;
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

    public void setCourseImagePaths(String courseImagePath) {
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

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                ", courseImagePath='" + courseImagePath + '\'' +
                ", price=" + price +
                ", coursePeriod=" + coursePeriod +
                ", courseStatus='" + courseStatus + '\'' +
                '}';
    }

}
