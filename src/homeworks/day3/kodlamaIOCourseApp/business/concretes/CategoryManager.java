package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.CategoryService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CategoryDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

    CategoryDao categoryDao;
    List<Category> categories = new ArrayList<>();
    private Logger[] loggers;

    public static List<Category> categoryList = new ArrayList<>();

    public CategoryManager() {
    }

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void addCategory(Category category) throws Exception {
        fillCategoryList();
        for (Category existCategory : categories) {
            if (existCategory.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Bu kategori daha önce olusturulmus. Lütfen farkli bir kategori olusturunuz!");
            }
        }

        categoryDao.addCategory(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }

    @Override
    public void updateCategory(String id) {

    }

    @Override
    public void deleteCategory(String id) {

    }

    @Override
    public List<Category> getCategoryList() {
        return null;
    }


    public static Category getCategoryById(String id) {
        for (Category w : categoryList) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    @Override
    public void fillCategoryList() {
        Category category1 = new Category("CAT-1001", "Fullstack", "Fullstack Development");
        Category category2 = new Category("CAT-1002", "Database", "Database Development");
        Category category3 = new Category("CAT-1003", "Backend", "Backend Development");
        Category category4 = new Category("CAT-1004", "Frontend", "Frontend Development");

        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
        categoryList.add(category4);
    }

    @Override
    public void showCategories() {
        System.out.println();
        System.out.println("\033[35m ////////////////////////////////////// CATEGORY LIST \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \033[0m \n");
        System.out.printf("%-16s \033[35m %-15s  \033[0m %-30s \n", "Category Code", "Category Name", "Category Details");
        System.out.printf("%-16s  %-15s  %-30s\n", "---------------", "---------------", "--------------------------------------------------------------");
        for (Category w : categoryList) {
            System.out.printf("%-16s \033[35m %-15s \033[0m %-30s\n", w.getId(), w.getCategoryName(), w.getCategoryDetail());
        }
        System.out.println();
    }

}
