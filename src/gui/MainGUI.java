package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.HackathonTeam;
import system.HackathonSystem;

public class MainGUI {

    private HackathonSystem system = new HackathonSystem();

    public MainGUI() {

        // Main window
        JFrame frame = new JFrame("Hackathon Management System");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buttons
        JButton registerBtn = new JButton("Register New Team");
        JButton reportBtn = new JButton("Generate Team Report");

        // Button actions
        registerBtn.addActionListener(e -> registerTeam());
        reportBtn.addActionListener(e -> system.generateReport());

        // Panel container
        JPanel panel = new JPanel();
        panel.add(registerBtn);
        panel.add(reportBtn);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void registerTeam() {
        try {
            String name = JOptionPane.showInputDialog("Enter Team Name:");
            if (name == null || name.isBlank()) {
                JOptionPane.showMessageDialog(null, "Team name required!");
                return;
            }

            String category = JOptionPane.showInputDialog("Enter Category:");
            String uni = JOptionPane.showInputDialog("Enter University:");

            // Must pass 5 scores to match the updated HackathonTeam constructor
            int[] scores = {0, 0, 0, 0, 0}; 

            HackathonTeam team = new HackathonTeam(
                system.getTeams().size() + 1,
                name,
                category,
                uni,
                scores
            );

            system.registerTeam(team);
            JOptionPane.showMessageDialog(null, "Team registered successfully! ID: " + team.getTeamID());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error during registration: " + ex.getMessage());
        }
    }
}