package model;

public class Competitor extends Person {

    private String university;

    public Competitor(String fullName, String university) {
        super(fullName);
        this.university = university;
    }

    @Override
    public String getRole() {
        return "Competitor";
    }

    public String getUniversity() {
        return university;
    }
}