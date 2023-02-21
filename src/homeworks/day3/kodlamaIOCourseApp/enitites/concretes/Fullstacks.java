package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Categories;

public class Fullstacks extends Categories {

    private String programmingLanguage;
    private String details;

    public Fullstacks() {
    }

    public Fullstacks(String programmingLanguage, String details) {
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
        return "{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
