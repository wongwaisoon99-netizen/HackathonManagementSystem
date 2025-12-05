package model;

/**
 * The {@code Judge} class represents a hackathon judge who evaluates and scores teams.
 *
 * @author Wong Wai Soon
 * @version 1.0
 */
public class Judge {

    private Name name;

    // Constructs a Judge object. //
    public Judge(Name name) {
        this.name = name;
    }

    // Assigns score to a team. //
    public void scoreTeam(HackathonTeam team, int creativity, int technicality, int presentation) {
        team.updateScore(creativity, technicality, presentation);
    }
}
