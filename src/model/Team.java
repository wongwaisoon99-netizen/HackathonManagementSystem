package model;

public abstract class Team {

    private int teamID; 
    private String teamName; 

    public Team(int teamID, String teamName) {
        this.teamID = teamID;
        this.teamName = teamName;
    }

    // Public Getters for all access (fixes related compilation errors)
    public int getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }
    
    // Abstract methods required for Stage 4 implementation
    public abstract String getCategory(); 
    public abstract double getOverallScore();
    public abstract String getFullDetails();
    public abstract String getShortDetails();
}