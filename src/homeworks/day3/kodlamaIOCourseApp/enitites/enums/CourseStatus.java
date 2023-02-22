package homeworks.day3.kodlamaIOCourseApp.enitites.enums;

public enum CourseStatus {

    NotStarted("NotStarted",0),
    Started("Started",1),
    Finished("Finished",2);

    private final String status;
    private final int statusCode;

    CourseStatus(String status, int statusCode) {
        this.status = status;
        this.statusCode = statusCode;
    }


    public String getStatus() {
        return status;
    }

    public int getStatusCode(int i) {
        return statusCode;
    }
}
