package model;

import java.util.List;

/**
 * Generates reports for Hackathon Teams.
 */
public class ReportGenerator {

    public static void printTeamReport(List<HackathonTeam> teams) {
        if (teams == null || teams.isEmpty()) {
            System.out.println("No team data available for reporting.");
            return;
        }

        System.out.println("===== HACKATHON TEAM REPORT =====");

        for (HackathonTeam t : teams) {
            try {
                System.out.println(t.toString());
            } catch (Exception e) {
                System.out.println("Error reading team data: " + e.getMessage());
            }
        }
        System.out.println("=================================\n");
    }
}
