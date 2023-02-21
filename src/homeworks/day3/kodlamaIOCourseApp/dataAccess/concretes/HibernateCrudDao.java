package homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes;

import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CrudDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

public class HibernateCrudDao implements CrudDao {
    //region add
    @Override
    public void addInstructor(Instructor instructor) {

        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " added to Instructor with Hibernate");
    }

    @Override
    public void addCategory(Category category) {

        System.out.println(category.getCategoryName() + " added to Category with Hibernate");
    }

    @Override
    public void addCourse(Course course) {

        System.out.println(course.getCourseName() + " added to Course with Hibernate");
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
