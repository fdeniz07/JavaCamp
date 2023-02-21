package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.enums.CourseStatus;

import java.util.List;

public class Course {

    private String id;
    private String courseName;
    private String courseDetails;
    private String[] courseImagePaths;
    private double price;
    private int coursePeriod;
    private Instructor instructor;
    private Category category;
    private List<Students> studentsList;
    private CourseStatus courseStatus;

    public Course() {
    }

    public Course(String id, String courseName, String courseDetails, String[] courseImagePaths, double price, int coursePeriod, Instructor instructor, Category category, List<Students> studentsList, CourseStatus courseStatus) {
        this.id = id;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.courseImagePaths = courseImagePaths;
        this.price = price;
        this.coursePeriod = coursePeriod;
        this.instructor = instructor;
        this.category = category;
        this.studentsList = studentsList;
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

    public String[] getCourseImagePaths() {
        return courseImagePaths;
    }

    public void setCourseImagePaths(String[] courseImagePaths) {
        this.courseImagePaths = courseImagePaths;
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

    public Instructor getInstructors() {
        return instructor;
    }

    public void setInstructors(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategories() {
        return category;
    }

    public void setCategories(Category category) {
        this.category = category;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public CourseStatus getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(CourseStatus courseStatus) {
        this.courseStatus = courseStatus;
    }
}
