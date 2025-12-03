package model;

import java.util.Arrays;

public class HackathonTeam {

    private int teamID;
    private String teamName;
    private String category; // simple String for Stage 4
    private String university;
    private int[] scores; // 4–6 integer scores (0–5)

    public HackathonTeam(int teamID, String teamName, String category, String university, int[] scores) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.category = category;
        this.university = university;

        // Stage 4 requirement: int array of scores 0–5
        this.scores = scores;
    }

    public int getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCategory() {
        return category;
    }

    public String getUniversity() {
        return university;
    }

    public int[] getScoreArray() {
        return scores;
    }

    // Stage 4 requirement: always return 5 for now
    public double getOverallScore() {
        return 5;
    }

    // Stage 4: full text description
    public String getFullDetails() {
        return "Team ID " + teamID + ", name " + teamName + " (" + university + ").\n" +
               teamName + " is competing in the " + category +
               " category and received scores " + Arrays.toString(scores) +
               ", resulting in an overall score of " + getOverallScore();
    }

    // Stage 4: short details "TID 101 (CT) has an overall score of X"
    public String getShortDetails() {
        String initials = getInitials(teamName);
        return "TID " + teamID + " (" + initials + ") has an overall score of " + getOverallScore();
    }

    private String getInitials(String name) {
        String[] parts = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            sb.append(Character.toUpperCase(p.charAt(0)));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getShortDetails();
    }
}
