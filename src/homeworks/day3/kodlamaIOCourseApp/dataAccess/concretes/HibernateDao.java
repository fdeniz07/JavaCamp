package homeworks.day3.kodlamaIOCourseApp.dataAccess.concretes;

import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CategoryDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.CourseDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.InstructorDao;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.StudentDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Category;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Course;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao, StudentDao {


    //region category
    @Override
    public void addCategory(Category category) {
        System.out.println("Added with Hibernate : " + category.getCategoryName() + " on the Category List" );
    }

    @Override
    public void updateCategory(String id) {

    }

    @Override
    public void deleteCategory(String id) {

    }

    //endregion

    //region course
    @Override
    public void addCourse(Course course) {
        System.out.println("Added with Hibernate : " + course.getCourseName() + " on the Course List" );
    }

    @Override
    public void updateCourse(String id) {

    }

    @Override
    public void deleteCourse(String id) {

    }

    //endregion

    //region instructor
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Added with Hibernate : " + instructor.getFirstName() + " " + instructor.getLastName() + " on the Instructer List" );
    }

    @Override
    public void updateInstructor(String id) {

    }

    @Override
    public void deleteInstructor(String id) {

    }


    //endregion

    //region student
    @Override
    public void addStudent(Student student) {
        System.out.println("Added with Hibernate : " + student.getFirstName() + " " + student.getLastName() + " on the Student List" );
    }

    @Override
    public void updatetudent(String id) {

    }

    @Override
    public void deletetudent(String id) {

    }

    //endregion
}
