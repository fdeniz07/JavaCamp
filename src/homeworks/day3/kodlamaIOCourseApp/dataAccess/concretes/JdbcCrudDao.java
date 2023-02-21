package homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes;

import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

public class JdbcCrudDao implements CrudDao {

    //region add
    @Override
    public void addInstructor(Instructor instructor) {

        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " added to Instructor with JDBC");
    }

    @Override
    public void addCategory(Category category) {

        System.out.println(category.getCategoryName() + " added to Category with JDBC");
    }

    @Override
    public void addCourse(Course course) {

        System.out.println(course.getCourseName() + " added to Course with JDBC");
    }
    //endregion

    //region update
    @Override
    public void updateInstructor(String id) {

    }

    @Override
    public void updateCategory(String id) {

    }

    @Override
    public void updateCourse(String id) {

    }
    //endregion

    //region delete

    @Override
    public void deleteInstructor(String id) {

    }

    @Override
    public void deleteCategory(String id) {

    }

    @Override
    public void deleteCourse(String id) {

    }
    //endregion
}
