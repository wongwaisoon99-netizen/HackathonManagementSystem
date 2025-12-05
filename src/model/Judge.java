package model;

public class Judge extends Person {

    private String expertise;

    public Judge(String name, String expertise) {
        super(name);
        this.expertise = expertise;
    }

    // The scoring method is simplified for now.
    public void scoreTeam(HackathonTeam team, int score1, int score2, int score3, int score4, int score5) {
        // We can't update the team's scores easily without a setter, so this is just a placeholder
        // for when you integrate this logic in Stage 6.
        System.out.println("Judge " + getFullName() + " has scored team " + team.getTeamName());
    }

    @Override
    public String getRole() {
        return "Judge";
    }

    public String getExpertise() {
        return expertise;
    }
}