package model;

/**
 * The {@code Competitor} class models an individual team member participating
 * in the hackathon. Each competitor has a name, assigned role, and email.
 *
 * <p>This class is used by {@link HackathonTeam} to maintain a list of members.</p>
 *
 * @author Wong Wai Soon
 * @version 1.0
 */
public class Competitor {

    private Name name;
    private String role;
    private String email;

    // Constructs a Competitor object. //
    public Competitor(Name name, String role, String email) {
        this.name = name;
        this.role = role;
        this.email = email;
    }

    // Returns full name. //
    public String getName() {
        return name.getFullName();
    }

    // Returns competitor's role. //
    public String getRole() {
        return role;
    }
}
