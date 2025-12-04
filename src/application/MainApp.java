package application;

import model.*;
import system.HackathonSystem;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        HackathonSystem system = new HackathonSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== HACKATHON MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Team");
            System.out.println("2. Add Member to Team");
            System.out.println("3. Score a Team");
            System.out.println("4. Generate Report");
            System.out.println("5. Save to File");
            System.out.println("6. Load from File");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Team Number: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Team Name: ");
                    String teamName = sc.nextLine();

                    System.out.println("Category (1-Web, 2-AI, 3-Cybersecurity): ");
                    int cat = sc.nextInt();
                    sc.nextLine();

                    Category category = Category.WEB_DEVELOPMENT;
                    if (cat == 2) category = Category.ARTIFICIAL_INTELLIGENCE;
                    if (cat == 3) category = Category.CYBERSECURITY;

                    System.out.print("Institution: ");
                    String inst = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    system.registerTeam(new HackathonTeam(num, teamName, category, inst, state));
                    break;

                case 2:
                    System.out.print("Team Number: ");
                    int teamNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Member First Name: ");
                    String f = sc.nextLine();

                    System.out.print("Last Name: ");
                    String l = sc.nextLine();

                    System.out.print("Role: ");
                    String role = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    system.addMemberToTeam(teamNo, new Competitor(new Name(f, l), role, email));
                    break;

                case 3:
                    System.out.print("Team Number: ");
                    int tn = sc.nextInt();

                    System.out.print("Creativity Score: ");
                    int c = sc.nextInt();

                    System.out.print("Technicality Score: ");
                    int t = sc.nextInt();

                    System.out.print("Presentation Score: ");
                    int p = sc.nextInt();

                    system.scoreTeam(tn, c, t, p);
                    break;

                case 4:
                    System.out.print("Team Number: ");
                    int rep = sc.nextInt();
                    system.generateReport(rep);
                    break;

                case 5:
                    system.saveToFile();
                    break;

                case 6:
                    system.loadFromFile();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
