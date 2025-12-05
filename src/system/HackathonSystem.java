package system;

import java.util.ArrayList;
import java.util.List;

import model.HackathonTeam;
import model.ReportGenerator;

public class HackathonSystem {

    private List<HackathonTeam> teams = new ArrayList<>();

    public void registerTeam(HackathonTeam team) {
        if (team == null) {
            throw new IllegalArgumentException("Cannot register null team.");
        }
        teams.add(team);
        System.out.println("Registered team: " + team.getTeamName());
    }

    public void generateReport() {
        ReportGenerator.printTeamReport(teams);
    }

    public List<HackathonTeam> getTeams() {
        return teams;
    }
}
