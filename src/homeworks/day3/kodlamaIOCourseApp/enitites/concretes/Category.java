package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String id;
    private String categoryName;
    private String categoryDetail;


    private static List<Category> categoryList=new ArrayList<>();

    public Category() {
    }

    public Category(String id, String categoryName, String categoryDetail) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;

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

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDetail='" + categoryDetail + '\'' +
                '}';
    }
}
