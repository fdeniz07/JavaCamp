package homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts;

import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Instructor;

public interface InstructorDao {

    void addInstructor(Instructor instructor);

    void updateInstructor(String id);

    void deleteInstructor(String id);
}
