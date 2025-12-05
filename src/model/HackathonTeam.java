package model;

import java.util.Arrays;

public class HackathonTeam extends Team {

    private String category;
    private String university;
    private int[] scores; 
    private String teamLeaderName; 

    public HackathonTeam(int teamID, String teamName, String category, String university, int[] scores) {
        super(teamID, teamName);
        this.category = category;
        this.university = university;
        this.scores = (scores != null) ? scores : new int[0];
        this.teamLeaderName = "Team Leader N/A"; 
    }
    
    public String getTeamLeaderName() {
        return teamLeaderName;
    }

    public void setTeamLeaderName(String teamLeaderName) {
        this.teamLeaderName = teamLeaderName;
    }

    // --- STAGE FOUR/FIVE MANDATORY METHODS ---
    
    @Override
    public double getOverallScore() {
        // COMPLEX SCORING IMPLEMENTATION (Stage 5)
        if (scores == null || scores.length < 2) {
            return 5.0; // Fallback to Stage 4 requirement if data is incomplete
        }

        // 1. Create a copy and sort the scores array
        int[] tempScores = Arrays.copyOf(this.scores, this.scores.length);
        Arrays.sort(tempScores); 

        int sum = 0;
        
        // 2. Drop the lowest score (skip index 0) and sum the rest
        for (int i = 1; i < tempScores.length; i++) {
            sum += tempScores[i];
        }

        // 3. Divide by the number of remaining scores (length - 1)
        return (double) sum / (tempScores.length - 1);
    }

    @Override
    public String getFullDetails() {
        String details = "========================================\n";
        details += "Team ID: " + getTeamID() + "\n"; // Use getter
        details += "Team Name: " + getTeamName() + "\n"; // Use getter
        details += "Team Leader: " + teamLeaderName + "\n";
        details += "Category: " + category + "\n";
        details += "University: " + university + "\n";
        details += "Overall Score: " + String.format("%.2f", getOverallScore()) + "\n";
        
        details += "Scores: [";
        for (int i = 0; i < scores.length; i++) {
            details += scores[i] + ((i < scores.length - 1) ? ", " : "");
        }
        details += "]\n";
        details += "========================================\n";
        return details;
    }

    @Override
    public String getShortDetails() {
        return "TID " + getTeamID() + " (" + getTeamName() + ") in " + getCategory() + " has an overall score of " + String.format("%.2f", getOverallScore());
    }
    
    // --- Other methods ---

    public int[] getScores() {
        return scores;
    }
    
    @Override
    public String getCategory() {
        return category;
    }
}