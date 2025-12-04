package model;

public class Score {

    private int creativity;
    private int technicality;
    private int presentation;

    public Score() {
        this.creativity = 0;
        this.technicality = 0;
        this.presentation = 0;
    }

    public int getTotalScore() {
        return creativity + technicality + presentation;
    }

    // Setters
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void setTechnicality(int technicality) {
        this.technicality = technicality;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }
}
