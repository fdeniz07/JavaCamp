package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes.HibernateCrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;

import java.util.List;

public class CategoryManager {

    private CrudDao[] crudDao;
    private Logger[] loggers;

    List<Category> categories;

    public CategoryManager(CrudDao[] crudDao, Logger[] loggers) {
        this.crudDao = crudDao;
        this.loggers = loggers;
    }

    public void addCategory(Category category) throws Exception{

        for (Category existCategory: categories){
            if (existCategory.getCategoryName() == category.getCategoryName()){
                throw new Exception("Bu kategori daha önce olusturulmus. Lütfen farkli bir kategori olusturunuz!");
            }
        }
        CrudDao crudDao = new HibernateCrudDao();
        crudDao.addCategory(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }

}
