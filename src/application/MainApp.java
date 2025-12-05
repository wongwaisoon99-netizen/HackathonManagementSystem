package application;

import model.HackathonTeam;
import system.HackathonSystem;

public class MainApp {

    public static void main(String[] args) {

        HackathonSystem system = new HackathonSystem();

        System.out.println("=== TEST CASE 1: Valid Registration ===");
        try {
            int[] s1 = {5, 4, 3, 5};
            HackathonTeam t1 = new HackathonTeam(1, "Team Alpha", "AI", "SEGi University", s1);
            system.registerTeam(t1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== TEST CASE 2: Invalid Registration (Missing Name) ===");
        try {
            int[] s2 = {4, 4, 2};
            HackathonTeam t2 = new HackathonTeam(2, "", "Cybersecurity", "UTM", s2);
            system.registerTeam(t2);
        } catch (Exception e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        System.out.println("\n=== TEST CASE 3: Invalid Scores ===");
        try {
            HackathonTeam t3 = new HackathonTeam(3, "Team Beta", "Web", "UM", null);
            system.registerTeam(t3);
        } catch (Exception e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        System.out.println("\n=== FINAL REPORT ===");
        system.generateReport();
    }
}
