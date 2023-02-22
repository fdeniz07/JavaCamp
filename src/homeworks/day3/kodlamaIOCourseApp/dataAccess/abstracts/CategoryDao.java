package homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;

public interface CategoryDao {

    void addCategory(Category category);

    void updateCategory(String id);

    void deleteCategory(String id);
}
