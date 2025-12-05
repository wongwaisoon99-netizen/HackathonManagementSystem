package system;

import java.util.ArrayList;
import java.util.List;

import model.HackathonTeam;
import model.ReportGenerator;

public class HackathonSystem {

    private List<HackathonTeam> teams = new ArrayList<>();
    private FileHandler fileHandler = new FileHandler(); 

    public HackathonSystem() {
        // Ensure you create the "data/teams.csv" file!
        loadInitialTeams("data/teams.csv"); 
    }
    
    private void loadInitialTeams(String filename) {
        List<HackathonTeam> loaded = fileHandler.loadTeamsFromFile(filename);
        if (!loaded.isEmpty()) {
            teams.addAll(loaded);
            System.out.println("Loaded " + loaded.size() + " teams from file: " + filename);
        } else {
            System.out.println("No teams loaded from file. Starting with empty system.");
        }
    }

    public void registerTeam(HackathonTeam team) {
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