package system;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HackathonSystem {

    private ArrayList<HackathonTeam> teams;

    public HackathonSystem() {
        this.teams = new ArrayList<>();
    }


    // TEAM REGISTRATION


    public void registerTeam(HackathonTeam team) {
        teams.add(team);
        System.out.println("Team registered successfully.");
    }


    // ADD MEMBER TO TEAM


    public void addMemberToTeam(int teamNumber, Competitor member) {
        for (HackathonTeam t : teams) {
            if (t.getTeamNumber() == teamNumber) {
                t.addMember(member);
                System.out.println("Member added.");
                return;
            }
        }
        System.out.println("Team not found.");
    }


    // SCORE TEAM


    public void scoreTeam(int teamNumber, int creativity, int technicality, int presentation) {
        for (HackathonTeam t : teams) {
            if (t.getTeamNumber() == teamNumber) {
                t.updateScore(creativity, technicality, presentation);
                System.out.println("Team scored successfully.");
                return;
            }
        }
        System.out.println("Team not found.");
    }


    // DISPLAY REPORT


    public void generateReport(int teamNumber) {
        for (HackathonTeam t : teams) {
            if (t.getTeamNumber() == teamNumber) {
                ReportGenerator r = new ReportGenerator();
                r.printTeamReport(t);
                return;
            }
        }
        System.out.println("Team not found.");
    }


    // SAVE TO FILE


    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("teams.txt"))) {

            for (HackathonTeam team : teams) {
                writer.println(team.getTeamNumber() + "," +
                        team.getTeamName() + "," +
                        team.getCategory() + "," +
                        team.getInstitution() + "," +
                        team.getState() + "," +
                        team.getTotalScore());
            }

            System.out.println("Data saved to teams.txt");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }


    // LOAD FROM FILE


    public void loadFromFile() {
        try (Scanner scan = new Scanner(new File("teams.txt"))) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");

                int teamNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                Category cat = Category.valueOf(parts[2]);
                String inst = parts[3];
                String state = parts[4];

                HackathonTeam t = new HackathonTeam(teamNo, name, cat, inst, state);
                registerTeam(t);
            }

            System.out.println("File loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("No saved file found.");
        } catch (Exception e) {
            System.out.println("Error loading file.");
        }
    }

    public ArrayList<HackathonTeam> getTeams() {
        return teams;
    }
}
