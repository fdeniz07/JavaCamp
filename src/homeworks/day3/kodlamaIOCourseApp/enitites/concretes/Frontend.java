package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Courses;

public class Frontend extends Courses {

    private String programmingLanguage;
    private String details;

    public Frontend() {
    }

    public Frontend(String programmingLanguage, String details) {
        this.programmingLanguage = programmingLanguage;
        this.details = details;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Frontend{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
