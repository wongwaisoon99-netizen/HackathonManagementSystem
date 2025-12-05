package model;

import java.util.Arrays;

/**
 * HackathonTeam - contains team identity and scoring.
 */
public class HackathonTeam {

    private int teamID;
    private String teamName;
    private String category;    // simple string category
    private String university;
    private int[] scores;       // optional array of scores
    // store component scores (used by updateScore)
    private int creativity;
    private int technicality;
    private int presentation;

    public HackathonTeam(int teamID, String teamName, String category, String university, int[] scores) {
        if (teamID <= 0) throw new IllegalArgumentException("Team ID must be positive.");
        if (teamName == null || teamName.isBlank()) throw new IllegalArgumentException("Team name required.");
        this.teamID = teamID;
        this.teamName = teamName;
        this.category = category == null ? "" : category;
        this.university = university == null ? "" : university;
        this.scores = scores == null ? new int[0] : scores;
        // initialize component scores from array if available
        if (this.scores.length >= 3) {
            this.creativity = this.scores[0];
            this.technicality = this.scores[1];
            this.presentation = this.scores[2];
        } else {
            this.creativity = 0;
            this.technicality = 0;
            this.presentation = 0;
        }
    }

    // --- methods expected elsewhere in project ---

    /** updateScore used by Judge.scoreTeam(...) and other callers */
    public void updateScore(int creativity, int technicality, int presentation) {
        this.creativity = creativity;
        this.technicality = technicality;
        this.presentation = presentation;
        // keep scores[] in sync (store first three slots)
        if (this.scores.length < 3) {
            this.scores = new int[] {creativity, technicality, presentation};
        } else {
            this.scores[0] = creativity;
            this.scores[1] = technicality;
            this.scores[2] = presentation;
        }
    }

    /** total of component scores */
    public int getTotalScore() {
        return creativity + technicality + presentation;
    }

    /** average (double) */
    public double getAverageScore() {
        return getTotalScore() / 3.0;
    }

    // small convenience getters
    public int getCreativity() { return creativity; }
    public int getTechnicality() { return technicality; }
    public int getPresentation() { return presentation; }

    public int getTeamID() { return teamID; }
    public String getTeamName() { return teamName; }
    public String getCategory() { return category; }
    public String getUniversity() { return university; }
    public int[] getScoreArray() { return Arrays.copyOf(scores, scores.length); }

    @Override
    public String toString() {
        return "Team " + teamID + " - " + teamName + " (" + category + ") Total: " + getTotalScore();
    }
}
