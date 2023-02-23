package homeworks.day3.kodlamaIOCourseApp.core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Logged on the File : " + data);
    }
}
