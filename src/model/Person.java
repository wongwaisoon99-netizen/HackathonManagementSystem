package model;

public abstract class Person {

    private String fullName; // Changed to private for proper encapsulation

    public Person(String fullName) {
        this.fullName = fullName;
    }

    // Public Getter is mandatory
    public String getFullName() {
        return fullName;
    }

    public abstract String getRole();
}