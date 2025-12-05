package model;

/**
 * The {@code Score} class represents the scoring components assigned
 * to a hackathon team by judges.
 *
 * <p>It includes creativity, technicality, and presentation scores.</p>
 *
 * @author Wong Wai Soon
 * @version 1.0
 */
public class Score {

    private int creativity;
    private int technicality;
    private int presentation;

    public Score() {
        creativity = 0;
        technicality = 0;
        presentation = 0;
    }

    // Computes total score. //
    public int getTotalScore() {
        return creativity + technicality + presentation;
    }

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
