package homeworks.day3.kodlamaIOCourseApp.enitites.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructors;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Students;

import java.util.Arrays;
import java.util.List;

public abstract class Courses {

    private String id;
    private String courseName;
    private String courseDetails;
    private String[] courseImagePaths;
    private double price;
    private int coursePeriod;
    private Instructors instructors;
    private Categories categories;
    private List<Students> studentsList;

    public Courses() {
    }

    public Courses(String id, String courseName, String courseDetails, String[] courseImagePaths, double price, int coursePeriod, Instructors instructors, Categories categories, List<Students> studentsList) {
        this.id = id;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.courseImagePaths = courseImagePaths;
        this.price = price;
        this.coursePeriod = coursePeriod;
        this.instructors = instructors;
        this.categories = categories;
        this.studentsList = studentsList;
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

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                ", courseImagePaths=" + Arrays.toString(courseImagePaths) +
                ", price=" + price +
                ", coursePeriod=" + coursePeriod +
                ", instructors=" + instructors +
                ", categories=" + categories +
                ", studentsList=" + studentsList +
                '}';
    }
}
