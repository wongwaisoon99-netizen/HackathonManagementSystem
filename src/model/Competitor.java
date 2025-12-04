package model;

public class Competitor {

    private Name name;
    private String role; 
    private String email;

    public Competitor(Name name, String role, String email) {
        this.name = name;
        this.role = role;
        this.email = email;
    }

    public String getName() {
        return name.getFullName();
    }

    public String getRole() {
        return role;
    }
}
