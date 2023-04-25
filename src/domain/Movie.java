package domain;

public class Movie {
    private String name;
    private int releaseYear;
    private double assessments;
    private int ratingTotals;
    private int durationInMinutes;
    private boolean includedInThePlan;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setAssessments(double assessments) {
        this.assessments += assessments;
    }

    public double getAssessments() {
        return assessments;
    }

    public void setRatingTotals(int ratingTotals) {
        this.ratingTotals += ratingTotals;
    }

    public int getRatingTotals() {
        return ratingTotals;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }
}
