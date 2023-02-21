package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import java.util.List;

public class Category {

    private String id;
    private String categoryName;
    private String categoryDetail;
    private List<Course> course;

    public Category() {
    }

    public Category(String id, String categoryName, String categoryDetail, List<Course> cours) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
        this.course = cours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public List<Course> getCourses() {
        return course;
    }

    public void setCourses(List<Course> cours) {
        this.course = cours;
    }


}
