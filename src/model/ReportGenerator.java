package model;

import java.util.List;

public class ReportGenerator {

    public static void printTeamReport(List<HackathonTeam> teams) { 

        if (teams == null || teams.isEmpty()) {
            System.out.println("No team data available.");
            return;
        }
        
        System.out.println("\n======= HACKATHON TEAM SHORT REPORT (Stage 5) =======");
        for (HackathonTeam t : teams) {
            System.out.println(t.getShortDetails());
        }
        System.out.println("===================================================\n");
        
        System.out.println("\n======= HACKATHON TEAM FULL DETAILS (Stage 5) =======");
        for (HackathonTeam t : teams) {
            System.out.println(t.getFullDetails());
        }
        System.out.println("=====================================================\n");
    }
}