package homeworks.day3.kodlamaIOCourseApp.business.concretes;

import homeworks.day3.kodlamaIOCourseApp.business.abstracts.StudentService;
import homeworks.day3.kodlamaIOCourseApp.core.logging.Logger;
import homeworks.day3.kodlamaIOCourseApp.dataAccess.abstracts.StudentDao;
import homeworks.day3.kodlamaIOCourseApp.enitites.concretes.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentService {

    StudentDao studentDao;
    List<Student> students = new ArrayList<>();
    Logger[] loggers;

    public static List<Student> studentList = new ArrayList<>();


    public StudentManager(StudentDao studentDao, Logger[] loggers, List<Student> students) {
        this.studentDao = studentDao;
        this.loggers = loggers;
        this.students = students;
    }

    @Override
    public void addStudent(Student student) throws Exception {
        fillStudentList();
        for (Student existStudent : students) {
            if (existStudent.getFirstName() == student.getFirstName() && existStudent.getLastName() == student.getLastName()) {
                throw new Exception("Bu ögrenci daha önce kaydolmus. Lütfen farkli bir ögrenci kaydi yapiniz!");
            }
        }

        studentDao.addStudent(student);

        for (Logger logger : loggers) {
            logger.log(student.getFirstName() + " " + student.getLastName());
        }
    }

    @Override
    public void updateStudent(String id) throws Exception {

    }

    @Override
    public void deleteStudent(String id) throws Exception {

    }

    @Override
    public List<Student> getStudentList() {
        return null;
    }

    @Override
    public void showStudents() {
        System.out.println();
        System.out.println("\033[31m ////////////////////////////////////// STUDENT LIST \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \033[0m \n");
        System.out.printf("%-16s \033[31m %-15s  %-15s \033[0m %-30s  %-15s  %-12s  %-10s\n", "Student Code", "First Name", "Last Name", "Email", "Phone Number", "Gender", "Address");
        System.out.printf("%-16s  %-15s  %-15s  %-30s  %-15s  %-12s %-10s \n", "---------------", "-------------", "-------------", "-----------------------------", "---------------", "-----------", "--------------------------------------");
        for (Student w : studentList) {
            System.out.printf("%-16s \033[31m %-15s  %-15s \033[0m %-30s  %-15s  %-12s %-10s\n", w.getId(), w.getFirstName(), w.getLastName(), w.getEmail(), w.getPhoneNumber(), w.isGender(), w.getAddress());
        }
        System.out.println();
    }


    //@Override
    public static Student getStudentById(String id) {
        for (Student w : studentList) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    //@Override
    public static List<Student> fillStudentList() {
        Student student1 = new Student("STD-5001", "Ahmet", "Güngör", "ahmet@gungor.com", "+9012411234", false, "Ankara");
        Student student2 = new Student("STD-5002", "Mehmet", "Kaya", "m.kaya@gmail.com", "+9012411234", false, "Istanbul");
        Student student3 = new Student("STD-5003", "Asli", "Paksoy", "paksoy35@hotmail.com", "+9012411234", true, "Izmir");
        Student student4 = new Student("STD-5004", "Ipek", "Aygan", "ipek007@yahoo.com", "+9012411234", true, "Antalya");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        return studentList;
    }
}
