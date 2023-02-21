package homeworks.day3.kodlamaIOCourseApp.enitites.concretes;

import homeworks.day3.kodlamaIOCourseApp.enitites.abstracts.Categories;

public class Databases extends Categories {

    private String databaseName;
    private String details;

    public Databases() {
    }

    public Databases(String databaseName, String details) {
        this.databaseName = databaseName;
        this.details = details;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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
                "databaseName='" + databaseName + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
