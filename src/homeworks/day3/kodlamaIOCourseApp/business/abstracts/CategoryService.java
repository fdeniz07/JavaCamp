package homeworks.day3.kodlamaIOCourseApp.business.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.List;

public interface CategoryService {

     void addCategory(Category category) throws Exception;

    void updateCategory(String id) throws Exception;

    void deleteCategory(String id) throws Exception;

    List<Category> getCategoryList();

    Category getCategoryById(String id);

    void fillCategoryList();

}
