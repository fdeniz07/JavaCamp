package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.CategoryService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CategoryDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    CategoryDao categoryDao;
    List<Category> categories;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
       this.categoryDao=categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void addCategory(Category category)  throws Exception{

        for (Category existCategory: categories){
            if (existCategory.getCategoryName() == category.getCategoryName()){
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

}
