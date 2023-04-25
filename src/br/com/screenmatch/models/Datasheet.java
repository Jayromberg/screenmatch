package br.com.screenmatch.models;

public class Datasheet {
    private String name;
    private int releaseYear;
    private double sumOfRatings;
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

    public void evaluate(double ratings) {
        this.sumOfRatings += ratings;
        ratingTotals++;
    }

    public double getAverage(){
        return sumOfRatings / ratingTotals;
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
