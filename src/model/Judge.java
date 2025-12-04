package model;

public class Judge {

    private Name name;

    public Judge(Name name) {
        this.name = name;
    }

    public void scoreTeam(HackathonTeam team, int creativity, int technicality, int presentation) {
        team.updateScore(creativity, technicality, presentation);
    }
}
