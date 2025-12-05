package system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.HackathonTeam;

public class FileHandler {

    public List<HackathonTeam> loadTeamsFromFile(String filename) {
        List<HackathonTeam> loadedTeams = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header line
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); 
                
                if (parts.length >= 8) { // ID, Name, Cat, Uni + 5 scores = 8 parts
                    try {
                        int teamID = Integer.parseInt(parts[0].trim());
                        String teamName = parts[1].trim();
                        String category = parts[2].trim();
                        String university = parts[3].trim();
                        
                        // Parse 5 scores
                        int[] scores = new int[5];
                        for (int i = 0; i < 5; i++) {
                            scores[i] = Integer.parseInt(parts[4 + i].trim());
                        }
                        
                        HackathonTeam team = new HackathonTeam(teamID, teamName, category, university, scores);
                        loadedTeams.add(team);
                        
                    } catch (NumberFormatException e) {
                        System.err.println("Skipping invalid team data (Score or ID not an integer): " + line);
                    }
                } else {
                    System.err.println("Skipping incomplete line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + filename + ". Make sure you created 'data/teams.csv'. " + e.getMessage());
        }
        return loadedTeams;
    }
    
    // You will add the writeReportToFile method here later.
}