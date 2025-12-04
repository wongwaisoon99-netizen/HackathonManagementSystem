package application;

import model.*;

public class MainApp {
    public static void main(String[] args) {

        HackathonTeam team = new HackathonTeam(
                1,
                "Tech Innovators",
                Category.ARTIFICIAL_INTELLIGENCE,
                "SEGi University",
                "Selangor"
        );

        team.addMember(new Competitor(new Name("John", "Tan"), "Developer", "john@gmail.com"));
        team.addMember(new Competitor(new Name("Sarah", "Lim"), "Designer", "sarah@gmail.com"));

        Judge judge = new Judge(new Name("Dr", "Lee"));
        judge.scoreTeam(team, 30, 40, 25);

        ReportGenerator report = new ReportGenerator();
        report.printTeamReport(team);
    }
}
