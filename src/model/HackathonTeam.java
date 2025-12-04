package model;

import java.util.ArrayList;

public class HackathonTeam {

    private int teamNumber;
    private String teamName;
    private Category category;
    private ArrayList<Competitor> members;
    private Score score;
    private String institution;
    private String state;

    public HackathonTeam(int teamNumber, String teamName, Category category, String institution, String state) {
        this.teamNumber = teamNumber;
        this.teamName = teamName;
        this.category = category;
        this.institution = institution;
        this.state = state;
        this.members = new ArrayList<>();
        this.score = new Score();
    }

    public void addMember(Competitor competitor) {
        members.add(competitor);
    }

    public void updateScore(int creativity, int technicality, int presentation) {
        score.setCreativity(creativity);
        score.setTechnicality(technicality);
        score.setPresentation(presentation);
    }

    public int getTotalScore() {
        return score.getTotalScore();
    }

    // Getters and Setters

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<Competitor> getMembers() {
        return members;
    }

    public Score getScore() {
        return score;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
