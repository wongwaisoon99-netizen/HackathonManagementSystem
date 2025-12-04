package model;

public class ReportGenerator {

    public void printTeamReport(HackathonTeam team) {
        System.out.println("---- Team Report ----");
        System.out.println("Team Number: " + team.getTeamNumber());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Category: " + team.getCategory());
        System.out.println("Institution: " + team.getInstitution());
        System.out.println("State: " + team.getState());
        System.out.println("Total Score: " + team.getTotalScore());
    }
}
